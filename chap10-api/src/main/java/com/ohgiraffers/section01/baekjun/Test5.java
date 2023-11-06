package main.java.com.ohgiraffers.section01.baekjun;

import java.util.Scanner;

public class Test5 {

    public static void main(String[] args){

//        예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
//
//        입력
//        첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
//
//        출력
//        첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.


        /*Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력해 주세요");
        int N = scanner.nextInt();


        for (int i = 1; i < N; i++) {
            for (int j = 9; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/
//        for (int i = 1; i < 10; i+=2) {
//            for (int j = 0; j < i; j+=2) {
//                System.out.print(" ");
//            }
//            for (int j = 8; j > i; j--) {
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }


        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();

        for(int i = 1; i <= N ; i++) {
            for(int j = 0; j < N-i; j++)
                System.out.print(" ");
            for(int j = 0; j < i*2-1; j++)
                System.out.print("*");
            System.out.println();
        }

        for(int i = N-1; i >= 0 ; i--) {
            for(int j = 0; j < N-i; j++)
                System.out.print(" ");
            for(int j = 0; j < i*2-1; j++)
                System.out.print("*");
            System.out.println();
        }




    }
}
