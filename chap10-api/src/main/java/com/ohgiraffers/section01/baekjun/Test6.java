package main.java.com.ohgiraffers.section01.baekjun;

import java.util.Scanner;

public class Test6 {

    public static void main(String[] args){

      /*  StringBuilder word = new StringBuilder("level");


        if(word == word.reverse()){
            System.out.println("팰랜드롬 단어가 맞습니다.");
        }else{
            System.out.println("팰랜드롬 단어가 아닙니다.");
        }*/

        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        sc.close();
        int len = str.length();
        boolean ans = true;

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        for(int i=0;i<len/2;i++) {
            if(str.charAt(i) != sb.charAt(i)) {
                ans = false;
            }
        }
        System.out.println(ans);
    }
}
