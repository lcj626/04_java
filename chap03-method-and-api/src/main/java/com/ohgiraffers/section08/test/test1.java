package main.java.com.ohgiraffers.section08.test;

import java.util.Random;

public class test1 {

    public static void main(String[] args){

        //1번 문제

        // A와 B라는 무작위의 숫자를 출력해 그 합을 반환하는 함수를 만들어 주세요.
        // 답변 양식은  ("A의 값은 () B의 값은 () 이므로 합은 ()입니다.")
        // static 메소드를 활용해주세요

        Random random = new Random();
        int randomNumber1 = random.nextInt(1000);
        int randomNumber2 = random.nextInt(1000);
        int result = test1.sumToNumbersOf(randomNumber1,randomNumber2);
        System.out.println("A의 값은 " + randomNumber1 + ", B의 값은 " + randomNumber2 + "이므로 합은 " + result + "입니다");



        System.out.println("========================================================================");
        //2번 문제
        // 주문한 음식의 가격을 합을 출력하려고 한다.
        // 식당의 메뉴는 탕수육, 마파두부, 짜장면이 있으며,
        // 탕수육의 가격은 4만원
        // 마파두부의 가격은 2만원
        // 짜장면의 가격은 1만원 이다.

        // 탕수육, 마파두부, 짜장면 3그릇을 주문하였을 때 가격의 합을 출력하시오.
        // method 를 사용하시오.
        // 출력되는 값은 다음과 같다. "주문하신 음식 가격의 합은 : #만원 입니다."

        int num3=4;
        int num4=2;
        int num5=1;
        test1 app1 = new test1();
        int result2 = app1.sumToNumbersOf(4,2,1);
        System.out.println("주문하신 음식 가격의 합은 : " + result2 + "만원 입니다.");



    }

    public static int sumToNumbersOf(int num1, int num2){

        return (num1 + num2);
    }

    public int sumToNumbersOf(int num3, int num4, int num5){

        return (num3+num4+num5*3);
    }


}
