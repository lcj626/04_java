package main.java.com.ohgiraffers.section01.baekjun;

public class BaekJune9086 {

    public static void main(String[] args){

        //문자열을 입력으로 주면 문자열의 첫 글자와 마지막 글자를 출력하는 프로그램을 작성하시오.

        String alphabet = "ACDKJFOWIEGHE";

        System.out.println("substring(1) : " + alphabet.substring(1));
        System.out.println("substring() : " + alphabet.substring(alphabet.length()-1));
        //System.out.println(alphabet);
        //substring은 지정한 구간만 출력한다는 메소드 이므로 이 문제에 사용하긴 적절하지 않았다

        System.out.println("================================================");

        String str1 = "ACDKJFOWIEGHE";
        for (int i = 0; i < str1.length(); i++) {

            System.out.println(str1.charAt(0) + str1.charAt(str1.length()-1)); //따로따로 넣으면 나오는데 둘이 더하면 정수형으로 출력되는 이유??
        }

    }


}
