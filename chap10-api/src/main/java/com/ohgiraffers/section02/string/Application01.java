package main.java.com.ohgiraffers.section02.string;

public class Application01 {


    public static void main(String[] args) {

        /*
         * chatAt() : 해당 문자열의 특정 인덱스에서 해당하는 문자를 반환 한다.
         * 인덱스는 0부터 시작하는 숫자 체계이며
         * 인덱스를 벗어난 경우 IndexOutOfBoundException이 발생 된다.
         *
         * */

        String str1 = "apple";
        for (int i = 0; i < str1.length(); i++) {

            System.out.println("[" + i + "] 번째 문자열 " + str1.charAt(i));
        }

//        for(char a : str1.) { foreach 문에서는 문자열을 지원하지 않음
//    }

        /*
         * compareTo() : 인자로 전달된 문자열과 ㅅ전 순으로 비교하여
         * 두 문자열이 같다면 0을 반환, 인자로 전달된 문자열보다 작으면 음수를 크면 양수를 반환
         * 단 이 메소드는 대소문자를 구분하여 비교한다.
         * */

        System.out.println("=============================================================");


        String java1 = "java";
        String java2 = "java";
        String java3 = "JAVA";
        String java4 = "oracle";

        System.out.println("compareTo() " + (java1.compareTo(java2)));
        System.out.println("소문자와 대문자 비교 compareTo() " + (java2.compareTo(java3)));
        System.out.println("대문자와 소문자 비교 compareTo() " + (java3.compareTo(java2)));
        System.out.println("다른 값 비교 compareTo() " + (java1.compareTo(java4)));
        System.out.println("다른 값 비교 compareTo() " + (java4.compareTo(java1)));


        System.out.println("================================================================");
        // ComparetoIgnoreCase() : 대소문자를 구분하지 않고 비교한다.
        System.out.println("comparetoIgnoreCase() : " + (java3.compareToIgnoreCase(java1)));
        System.out.println("comparetoIgnoreCase() : " + (java3.compareToIgnoreCase(java4)));


        System.out.println("======================================================================");
        /*
        * concat () : 문자열에 인자로 전달된 문자열을 합치기 해서 새로운 문자열을 반환 한다.
        * */
        System.out.println("concat() : " + (java1.concat(java4)));


        System.out.println("=================================================================");
        /*
        * indexOf() : 문자열에서 특정 문자를 탐색하여 처음 일치하는 인덱스 위치를 정수형으로 반환 한다.
        * 단, 일치하는 문자가 없는 경우 -1을 반환 한다.
        * */
        String indexOf = "java oracle";
        System.out.println("indexOf('a')" + indexOf.indexOf('a'));
        System.out.println("indexOf('z')" + indexOf.indexOf('z'));


        System.out.println("=================================================");
        /*
        * lastIndexOf() : 문자열 특정 문자를 탐색하는데 탐색의 기준은 뒤에서 부터이다
        * */

        System.out.println("lastIndexOf('a')" + indexOf.lastIndexOf('a'));
        System.out.println("lastIndexOf('z')" + indexOf.lastIndexOf('z'));


        System.out.println("================================================");
        /*
        * trim() : 문자열의 앞 뒤에 공백을 제거한 문자열 반환 한다.
        *
        * */

        String trimStr = "  java   ";
        System.out.println("trimstr : #" + trimStr + "#");
        System.out.println("trim() : #" + trimStr.trim()+"#");


        System.out.println("=======================================================");
        /*
        * toLowerCase() : 문자열을 소문자로 변경함
        * toUpperCase() : 문자열을 대문자로 변경함
        * */
        String value = "java";
        System.out.println("toUpperCase " + value.toUpperCase());
        System.out.println("toLowerCase " + value.toLowerCase());
        System.out.println(value);

        System.out.println("=========================================");

        /*
        * subString() : 문자열의 일부 잘라내어 새로운 문자열을 반환한다.
        * */

        String javascript = "javaScript";
        System.out.println("substring(3,6) " + javascript.substring(3,6));
        System.out.println("substring(3) " + javascript.substring(3));
        System.out.println(javascript);

        System.out.println("===============================================");
        /*
        * replace() : 문자열에서 대체할 문자열을 기존의 문자열을 변경해서 반환 한다.
        * */

        System.out.println("replace() : " + javascript.replace("java","python"));


        System.out.println("==================================================");
        /*
        *length() : 문자열의 길이를 정수형으로 반환 한다.
        * */

        System.out.println("===================================================");

        /*
        * isEmpty() : 문자열의 길이가 0 이면 true를 반환하고, 아니면 false를 반환 한다.
        * 길이가 0인 문자열은 null과 다르다.
        * */

        String test = "";
        String nullTest = null;

        System.out.println(test.isEmpty());
//        System.out.println("null TEST " + (nullTest == null));
//        System.out.println("nullTest" + nullTest.isEmpty());

        System.out.println("======================================================");

        /*
        * 문자열 객체를 만드는 방법
        * "" 리터럴 형태 : 동일한 값을 가지는 인스턴스를 단일 인스턴스로 반환한다(singleton)
        * new ("문자열") : 매번 새로운 인스턴스를 생성한다.
        * */

        String stringTest = "java";
        String stringTest2 = "java"; // string pool에 생김
        String newString1 = new String("java"); //heap 영역에 생김 위에랑 주소값 다름
        String newString2 = new String("java");

        /*
         * String test = "java" 와 같은 리터럴 타입의 문자열은
         * stack 에 있는 string pool 영역에 생성되며
         * 동일한 문자열을 리터럴 형식으로 전달 하여도 String Pool에 존재하는 주소값을 반환 한다.
         * */
        System.out.println("str1 == str2 " + (stringTest2 == stringTest));

        System.out.println("stringTest2 == newString1 " + (stringTest == newString1));
        System.out.println("String의 hashCode " +stringTest.hashCode());

        System.out.println("stringTest와 newString의 값 비교 " + stringTest2.equals(newString1));

    }
}
