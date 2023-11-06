package main.java.com.ohgiraffers.section01.list.test;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Test1 {

    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);

        Stack<Integer> integerStack = new Stack<>();

        ArrayList arrayList = new ArrayList();


        System.out.println("수를 입력해 주세요");
        int N = scanner.nextInt();

        int[] data = new int[N];

        for (int i = 1; i <= N; i++) {

            if(i <= N){
                integerStack.push(i);
                System.out.println("+");
                integerStack.pop();

            }


        }


    }
}
