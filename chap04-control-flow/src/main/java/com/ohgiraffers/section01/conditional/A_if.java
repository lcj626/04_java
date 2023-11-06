package main.java.com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class A_if {

    public void testSimpleIfStatement(){

        /*
        * [if문 표현식]
        * if(조건){
        *   조건이 참일 경우 실행할 내용
        * }
        *
        *
        * 조건식이 : 참 혹은 거짓이 나오는 연산식을 조건식이라고 한다.
        * if 문은 조건식의 결과 값이 참이면 {} 안에 있는 코드를 실행하고
        * 조건식의 결과 값이 거짓이면 {} 안의 내용을 무시한다.
        *
        * 정수를 한 게 입력 받고 그 수가 짝수인지 아닌지 검사 하는 프로그램을 만들어 보자*/

        /*Scanner sc = new Scanner(System.in);

        System.out.println("숫자 한 개를 입력하세요");
        if num = sc.nextInt();

        /*if (num % 2==0){
            System.out.println("짝수");
        }else if (num % 2!=0){
            System.out.println("홀수");
        }*/



    }

    public void testNestedIfStatement() {

        /*
         * 중첩된 if 문 실행 흐름 확인
         *
         * 정수 한 개를 입력받아 그 수가 양수인 경우에만 짝수인지를 확인하고
         * 짝수이면 "입력하신 숫자는 안수이면서 짝수 입니다." 라고 출력을 한다.
         * 그 외 둘 중 하나라도 아니면 프로그램을 종료 한다.
         * */

        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자 한 개를 입력해 주세요");
        int num = scanner.nextInt();
        // 양수, 0, 음수
        // 양수 인가 확인
        if (num > 0) {

        } else if (num < 0) {
            //짝수 판단
            if ((num%2==0)){
                System.out.println("입력한 정수는 양수 이면서 짝수 입니다");
            }else{
                System.out.println("입력한 결과는 양수 이면서 홀수 입니다");
            }
        } else {
            System.out.println(0 + "입니다");
        }
    }
}
