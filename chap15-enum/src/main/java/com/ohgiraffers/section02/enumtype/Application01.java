package main.java.com.ohgiraffers.section02.enumtype;

public class Application01 {

    public static void main(String[] args){

        /*열거형(enum)을 이용한 상수 열거 패턴의 단점을 해결 하기*/

        Subjects sbj = Subjects.JAVA;
        Subjects sbj2 = Subjects.HTML;

        if(sbj == sbj2){
            System.out.println("두 과목은 같은 과목입니다.");
        }else{
            System.out.println("sbj : " + sbj.name());//JAVA 가 가진 네임 값을 꺼내옴
            System.out.println("sbj2 : " + sbj2.toString());// value 필드값에 접근 한 것
            System.out.println("는 다른 과목입니다.");
        }

        System.out.println("=============================================================================");
        Subjects value = Subjects.CSS;
        System.out.println("value : " +value);
        //인스턴스의 타입을 보장하기 때문에 ==으로 값을 비교하는 것이 가능하다.
        System.out.println(sbj == Subjects.JAVA);

        System.out.println("=====================================================================");

        Subjects[] subjects = Subjects.values();
        for (Subjects sb: subjects) {
            System.out.println(sb);
        }
    }
}
