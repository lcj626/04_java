package main.java.com.ohgiraffers.section01.list.test;

import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {


        int[] arrInt = {2, 4, 6, 8};
        for (int i = 0 ; i < arrInt.length ; i++)
        {
            System.out.print(arrInt[i] + "  ");
        }
        System.out.println();

        Scanner sc = new Scanner(System.in);
        int[] arrInt2 = new int[6];
        for (int i = 0 ; i < arrInt2.length ; i++ )
        {
            System.out.print("정수 입력 : ");
            arrInt2[i] = sc.nextInt();
        }

        for (int i = 0; i < arrInt2.length ; i++ )
        {
            System.out.print(arrInt2[i] + " ");
        }
        System.out.println();

    }

}
