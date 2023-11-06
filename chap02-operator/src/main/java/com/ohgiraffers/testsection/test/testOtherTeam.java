package com.ohgiraffers.testsection.test;

public class testOtherTeam {

    public static void main(String[] args){

        // 2번 문제
        // 승객 두명의 놀이기구 탑승 가능여부를 출력하는 코드를 만드시오.
        // 놀이기구 탑승 기준은 키가 120cm 이상이다.
        // 승객 두명의 키는 각각 113cm 와 127cm 이다.

        // 화면에 보여지는 양식은 다음과 같다.
        // 키카 113cm 이므로 탑승 불가능합니다.
        // 키가 127cm 이므로 탑승 가능합니다.

        // 조건
        // 삼항 연산자를 사용하시오
        System.out.println("==================");

        int customer1 = 113;
        int customer2 = 127;
        String result1 = (customer1 >= 120)? "탑승 가능" : "탑승 불가능" ;
        String result2 = (customer2 >= 120)? "탑승 가능" : "탑승 불가능" ;

        System.out.println("키가 " + customer1 + "이므로 " + result1 + "합니다.");
        System.out.println("키가 " + customer2 + "이므로 "  + result2 + "합니다.");

        //1번문제
        // A 마트의 이번 주 주류 판매 실적은 소주 :  45만원 , 맥주 : 30만원 , 와인 : 36만원 , 고량주 : 27만원 이다.

        // 마트의 주당 평균 총 매출이 140 만원일때

        // 그 주의 주류 별 평균 실적과 그 주의 총 매출을 정리하고(세금 10%),

        // 총 매출이 주당 평균 매출보다 높은지 나타내려고 한다.

        // 다음과 같은 양식을 가진다.


        // A마트 이번 주 주류 당 평균 실적은 ()만원이고, 세금을 제외한 총 매출은 ()만원이며 세금은 ()만원을 냈다.

        // 이번 주 총 매출은 평균 총 매출보다 높다/낮다. (삼항연산자 사용)


        System.out.println("==============================================================================");
        // 3번 문제
        //삼항연산자를 이용해 한 강아지의 아이큐가 60보다 낮으면 똥개 . 60보다 높으면 천재견을 출력해라.
        //강아지 '백구'의 아이큐는 200이다.
        //  보여지는 출력은 다음과 같다
        // "백구의 아이큐는 200 이므로 (똥개/천재견) 이다.

        int num1 =200;
        String result = ((num1 < 60)? "똥개" : "천재견");
        System.out.println("백구의 아이큐는 " + num1 + "이므로 " + result + "이다.");






    }
}
