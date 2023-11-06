package main.java.com.ohgiraffers.understand;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Application01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 6자리 입력해 주세요");

//        int[] num = new int[6];
//
//
//        for (int i = 0; i < num.length; i++) {
//            num[i] = scanner.nextInt();
//            if (num[i] > 45 || num[i] < 1) {
//                System.out.println("입력 범위에서 벗어났습니다. 다시 입력해 주세요");
//                System.out.println(num[i]);
//
//            }

        int lotto[] = new int [6];

        // 번호 생성
        for(int i=0; i<6; i++) {
            lotto[i] = (int)(Math.random() * 45) + 1;

            // 중복 번호 제거
            for(int j=0; j<i; j++) {
                if(lotto[i] == lotto[j]) {
                    i--;
                    break;
                }
            }
        }
        System.out.print("로또 번호: ");

        // 번호 출력
        for(int i=0; i<6; i++) {
            System.out.print(lotto[i] + " ");
        }



//        int i = 0;
//
//        System.out.print("배열의 길이를 생성 : ");
//        int num1 = scanner.nextInt();
//        int[] num = new int[6];
//        //int[]data = new int[num];
//        System.out.println(num + "개의 배열이 생성되었습니다.");
//        System.out.println("데이터를 입력하세요");
//
//        for (i = 0; i < num.length; i++) {
//            System.out.print((i + 1) + "번째 데이터 입력 : ");
//            num[i] = scanner.nextInt();
//        }
//
//
//        System.out.print("배열의 데이터 : ");
//        for (i = 0; i < num.length; i++) {
//            System.out.print(num[i] + " ");
//        }
//        System.out.println("입니다.");


//            Set<Integer> lotto = new TreeSet<>();
//            while (lotto.size() < 6) {
//                lotto.add((int) (Math.random() * 45) + 1);
//            }
//            System.out.println(lotto);



    }
}
