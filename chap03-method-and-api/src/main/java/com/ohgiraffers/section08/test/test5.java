package main.java.com.ohgiraffers.section08.test;

import java.util.Scanner;

public class test5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 숫자를 입력해 주세요.");
        int num1 = sc.nextInt();
        System.out.println("두 번째 숫자를 입력해 주세요.");
        int num2 = sc.nextInt();

        //for (int i = 1; i <= 9; i++) {
            //for (int j = 1; j <= 9; j++) {
                if (3 * num1 + 2 * num2 == 26) {
                    System.out.println("참");
                } else {
                    System.out.println("거짓");
                }










    }
}
