package main.java.com.ohgiraffers.section02.looping;

import javax.swing.*;
import java.util.Scanner;

public class A_for {

    public void testSimpleForStatement() {

        /*
         * for[표현식]
         * for(초기값; 조건식; 증감식;
         *
         * }
         * */

        for (int i = 0; i <= 10; i++) {

            System.out.println(i);

        }


    }

    public void testForExample() {
        //반의 학생이 10명인 학생의 이름을 입력받기

        Scanner scanner = new Scanner(System.in);

        System.out.println("1번째 학생의 이름을 입력해 주세요 : ");
        String name1 = scanner.nextLine();


        for (int i = 0; i < 10; i++) {
            System.out.println(i + "번째 학생의 이름을 입력해 주세요 : ");
            String student = scanner.nextLine();
            System.out.println(i + "번째 학생의 이름은 " + student + "입니다");
        }

    }


    public void testForExample2() {
        //1~10까지 수의 합을 구한다.
        //1~10까지의 수는 1씩 증가된다.
        // 1 +2 +3 +4 +5 +6 +7 +8 +9 +10

        int sum = 0;

        for (int i = 1; i < 11; i++) {
            sum += i;
        }
        System.out.println(sum);

        //반복문에서 조건문 사용하기

        for (int i = 1; i <= 10; i++) {
            if (i == 0) {
                System.out.println("0입니다");
            } else if (i % 2 == 0) {
                System.out.println("짝수 입니다");
            } else {
                System.out.println("홀수 입니다.");
            }
        }

    }


    public void testForExample4() {
        /*숫자 두 개를 입력 받아 작은 수에서 큰 수까지의 합계를 구하세요
         * 단, 두 숫자는 같은 숫자를 입력하지 않는다는 가정으로 해결을 합니다.
         * */

        /* 프로그램
         * 목표: 두 수를 입력 받아서 작은 수 부터 큰 수 까지의 합계를 구한다.
         * 주의 : 두 수의 값은 같을 수 없다.
         *
         * 1. 두 수를 입력 받아야 한다.
         * 2. 입력 받은 수가 같은지 비교 한다.
         *   false(같지 않으면). 다음으로 넘긴다.
         *   true(같으면). 두 수를 다시 입력 받는다.
         * 3. 같지 않다면 작은 수와 큰 수를 구한다.
         * 4. 작은 수 부터 큰 수 까지의 합계를 구한다.
         *
         *
         * */
        System.out.println(" 두 수를 입력 받아 작은 수 부터 큰 수 까지의 합계를 구하는 프로그램 입니다.");
        //1. 두 수를 입력 받아야 한다.
        Scanner scanner = new Scanner(System.in);


         for (; ; ) {
            System.out.println(" 첫 번째 수를 입력해 주세요 : ");
            int first = scanner.nextInt();
            System.out.println(" 두 번째 수를 입력해 주세요 : ");
            int second = scanner.nextInt();

            if (first == second) { // 같은 경우 입력을 다시 받는다

                //2. 입력 받은 수가 같은지 비교 한다.
                System.out.println("두 수의 값이 같기 때문에 입력을 다시 해주세요");
                //System.out.println(" 첫 번째 수를 다시 입력해 주세요 : ");
                //first = scanner.nextInt();
                //second = scanner.nextInt()
                //false(같지 않으면). 다음으로 넘긴다.
                //true(같으면). 두 수를 다시 입력 받는다.
                return;
            } else { // 같지 않으면 다음 진행
                //3. 같지 않다면 작은 수와 큰 수를 구한다.
                int max = (first > second) ? first : second;
                int min = (first < second) ? first : second;
                int sum = 0;

                //4. 작은 수 부터 큰 수 까지의 합계를 구한다.
                for (int i = min; i <= max; i++) {
                    sum += i;

                }
                System.out.println("입력 한 두 수에서 작은 값은 " + min + " 큰 값은 " + max + " 이고 합계는 " + sum + " 입니다.");
                break;


            }


        }
    }
    /**
    * 구구단을 위한 함수 입니다.
    * n~9단까지
    * @param first : 해당 단을 출력함
    * @return void
    * */
    public void gugudan(int first){

        /*Scanner sc = new Scanner(System.in);
        System.out.println("단을 입력해 주세요");
        int num = sc.nextInt();*/
        for(int i = 1; i < 10; i++){
            System.out.println(first + " * " + i + "=" + i*first);
        }





    }
}