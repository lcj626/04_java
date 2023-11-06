package main.java.com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("값을 입력해 주세요 ");
        String greeting = sc.nextLine();
        System.out.println(greeting);

        System.out.println("두번째 값을 입력해 주세요");
        String greeting2 = sc.next();
        System.out.println(greeting2);//next는 뛰어쓰기도 카운트 부분만 출력 nextLine은 전체 출력

    }
}
