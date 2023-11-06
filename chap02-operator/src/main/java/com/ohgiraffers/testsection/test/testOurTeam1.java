package com.ohgiraffers.testsection.test;

public class testOurTeam1 {

    public static void main(String[] args){



        //1. ch1 = X, ch2 = Z 일때 그 값을 비교한 후 참이면 "참", 거짓이면 "거짓"으로 출력할 것



        char ch1 = 'X';
        char ch2 = 'Z';

        System.out.println("============== 문자값 비교 ===============");
        System.out.println("ch1과 ch2가 같은지 비교 : " + ((ch1 == ch2)? "참" : "거짓"));
        System.out.println("ch1과 ch2가 같지 않은지 비교 : " + ((ch1 != ch2)? "참" : "거짓"));
        System.out.println("ch1이 ch2보다 큰지 비교 : " + ((ch1 > ch2)? "참" : "거짓"));
        System.out.println("ch1이 ch2보다 크거나 같은지 비교 : " + ((ch1 >= ch2)? "참" : "거짓"));
        System.out.println("ch1이 ch2보다 작은지 비교 : " + ((ch1 < ch2)? "참" : "거짓"));
        System.out.println("ch1이 ch2보다 작은거나 같은지 비교 : " + ((ch1 <= ch2)? "참" : "거짓"));

        //String result1 = (num1 > 0)? "양수다.": "양수가 아니다.";
        //String result2 = (num2 > 0)? "양수다.": "양수가 아니다.";

        System.out.println("=================================================");

        int num = 33;
        String result = (num > 20)? "성인" : "미성년자";

        System.out.println("나는 현재 " + result);



        // 길동이의 첫달 월급은 100만원이다
        // 짝수달은 10프로 보너스를 받고, 홀수달은 15프로 보너스를 받는다
        // 길동이 연봉은?

        int salary = 100;
        double bonus1 = 0.1;
        double bonus2 = 0.15;




















    }
}
