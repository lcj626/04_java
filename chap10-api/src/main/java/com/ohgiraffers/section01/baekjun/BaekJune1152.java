package main.java.com.ohgiraffers.section01.baekjun;

import java.util.StringTokenizer;

public class BaekJune1152 {

    //영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까?
    // 이를 구하는 프로그램을 작성하시오. 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.

    public static void main(String[] args){

        String emp1 = "The Curious Case of Benjamin Button";


        String[] emp1Arr = emp1.split(" ");


        for (String emp: emp1Arr) {
            System.out.println(emp);
        }
        //단어를 분리 시켜서 나열하는 메소드 였다 -> 이걸 활욯 해서 숫자를 세는 방법은 없을까?

        System.out.println("=======================================================================");

        StringTokenizer st1 = new StringTokenizer(emp1, " ");//delim : 토큰을 " " 기준으로 구분 한다.
        while(st1.hasMoreTokens()){//hasMoreTokens 다음 값이 존재하는가 true false 빈 문자열 값으로 포함 안함
            System.out.println("st1 : " + st1.countTokens());
            break;
        }


    }
}
