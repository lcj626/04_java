package main.java.com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Application04 {

    public static void main(String[] args){

        // 5명의 자바 점수를 정수로 입력 받아서 합계와 평균을 실수로 구하는 프로그램을 만들어 주세요

        int sum = 0;
        int[] iarr = new int[5];

        iarr[0] = 40;
        iarr[1] = 60;
        iarr[2] = 70;
        iarr[3] = 30;
        iarr[4] = 90;

        for(int i = 0; i < iarr.length; i++) {
            sum += iarr[i];
        }
        System.out.println("for iarr = " + sum);


        //1. 5명의 자바 정수를 입력 받는다
        int[] student = new int[5];
        Scanner scanner = new Scanner(System.in);

        // 합계를 받은 값
        int sum1 = 0;

        //평군
        double avg = 0.0;
        //값을 입력 받고 합을 구한다.
        for(int i = 0; i <student.length; i++){
            System.out.println(i + "번째 학생의 자바 점수를 입력해 주세요 : ");
            student[i] = scanner.nextInt();
            sum1 += student[i];
        }
        avg = sum/student.length;
        //구한 값
        System.out.println(student.length + "명의 자바 점수 합계는 = " + sum + "\n 평균 점수는 " + (avg));





    }
}
