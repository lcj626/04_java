package main.java.com.ohgiraffers.section01.baekjun;

import java.util.Scanner;

public class Test4 {

    public static void main(String[] args){


        //단어 S와 정수 i가 주어 졌을 때, S의 i번째 글자를 출력하는 프로그램을 작성하시오.
        //Sprout
        //3

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("단어를 입력해 주세요");
//        String word = scanner.next();
//        System.out.println("숫자를 입력해 주세요");
//        int num = scanner.nextInt();


        Scanner scanner = new Scanner(System.in);
        System.out.println("단어를 입력해 주세요");
        String word = scanner.next();
//        System.out.println("숫자를 입력해 주세요");
//        int num = scanner.nextInt(); //if 문 쓸 때는 int num = scanner.nextInt(); 여기다 입력


        for (int i = 0; i < word.length(); i++) {

            System.out.println("숫자를 입력해 주세요");
            int num = scanner.nextInt();
            if(num>word.length()) {
                System.out.println("입력값이 초과되었습니다. 다시 입력해 주세요");
            }else{
                System.out.println(word.charAt(num-1));
            }



        }
        //if(num>word.length()) {
//                System.out.println("입력값이 초과되었습니다. 다시 입력해 주세요");
//            }else{
//                System.out.println(word.charAt(num-1));
//            }



        //for는 반복문이라 계속 숫자를 넣는 과정이 나오고 if문은 한번에 끝난다.












    }
}
