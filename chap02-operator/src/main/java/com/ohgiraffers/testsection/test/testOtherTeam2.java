package com.ohgiraffers.testsection.test;

public class testOtherTeam2 {

    public static void main(String[] args){

        /*1.
        한 축구 구단의 직원 수는 약 1892명 이다.
        올해에 리그에서 순위가 18위 이하로 나온다면 강등 되어서 직원수를 15% 줄여야 한다.
        17위 이상을 기록하면 구단의 직원수는 15% 증가한다.
        (삼항연산자로 해보기)

        2.
        영어시험을 본 결과 1번 학생은 90점 2번 학생은 95점 3번 학생은 81점을 맞았다 평균을 구한 후 논리 연산자를 이용해 90점 이상~100점 이하라면 true를 출력하라.

        3.
        300만원을 갖고 있는 김과장이 62만원인 지갑을 구매하려 한다. 실행되지 않는 코드의 오류를 수정해라.

        String name = '김과장'
        balance = 3000000
        walletPrice = 620000

        int result = (balance >= walletPrice) ? (name + " 님의 결제가 진행되었습니다. " + name + " 님의 남은 잔고 : " + (balance - walletPrice)) : "잔액 부족으로 결제가 진행되지 않았습니다.";
        System.out.println(result);

        4.
        시험과목 3개의 점수가 50,40,60이다 평균 40을 넘기면 합격 못넘기면 불합격 출력*/

        /*System.out.println("1번 문제");

        int rank = 10;
        int num = 1892;
        double a1 = num*0.85;
        double a2 = num*1.15;
        String.valueOf() = ((rank < 18)? a1 : a2);*/







        System.out.println(" ====2번 문제===================");
        int num1 = 90;
        int num2 = 95;
        int num3 = 81;

        int result = (num1+num2+num3)/3;

        System.out.println((result >=90) && (result <=100)? "참" : "거짓");

        System.out.println("==============3번문제================");

        String name = "김과장";
        int balance = 3000000;
        int walletPrice = 620000;

        String result11 = (balance >= walletPrice) ? name + "님의 결제가 진행되었습니다. 남은 잔고는 " + (balance-walletPrice) + "입니다."  : "잔액 부족으로 결제가 진행되지 않았습니다.";
        System.out.println(result11);



    }
}
