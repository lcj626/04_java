package main.java.com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args){

        /*
        * java.util.Scanner
        * 콘솔 화면에 값을 입력 받아 기능을 제공한다.
        *
        * 1-1 Scanner는 객체를 만들어서 사용한다.
        * */

        Scanner sc = new Scanner(System.in); //System in 시스템에 입력을 할 수 있는 시스템에 정의되어있는 inputstream 객체를 갖다 쓰는것

        System.out.println("이름을 입력해 주세요 : ");
        String name = sc.nextLine();
        System.out.println("안녕하세요 " +name + "님!!");


        int age2 = sc.nextInt();
        System.out.println((5000<age2 && age2<10000)? "검소한 식비입니다" : "굶는 중입니다.");

        Long lnum = sc.nextLong();
        System.out.println("입력한 LONG : " + lnum);

        boolean isTrue = sc.nextBoolean();
        if(isTrue){
            System.out.println(("참이다."));
        }else{
            System.out.println("거짓");
        }
        sc.nextLine();

        char charValue = sc.nextLine().charAt(0);
        System.out.println(charValue);


    }
}
