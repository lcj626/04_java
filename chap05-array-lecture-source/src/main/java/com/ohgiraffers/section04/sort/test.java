package main.java.com.ohgiraffers.section04.sort;

import java.util.Scanner;

public class test {

    public static void main(String[] args){


        Scanner scn = new Scanner(System.in);

        int[] arr = new int[10];
        int i;

        for( i=0; i<10; i++)
        {
            arr[i] = scn.nextInt();
        }

        System.out.print(arr[2]+" "+arr[4]+" "+arr[arr.length-1]);
    }
}
