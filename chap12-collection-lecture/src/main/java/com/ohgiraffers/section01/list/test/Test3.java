package main.java.com.ohgiraffers.section01.list.test;
import java.util.Scanner;
public class Test3 {

    public static void main(String[] args) {
        //배열의 생성하고 데이터를 넣어서 출력해라.
        Scanner sc = new Scanner(System.in);
        int i = 0;

        System.out.print("배열의 길이를 생성 : ");
        int num = sc.nextInt();
        int[]data = new int[num];
        System.out.println(num + "개의 배열이 생성되었습니다.");
        System.out.println("데이터를 입력하세요");

        for(i = 0; i < data.length; i++) {
            System.out.print((i+1) + "번째 데이터 입력 : ");
            data[i] = sc.nextInt();
        }


        System.out.print("배열의 데이터 : ");
        for(i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("입니다.");
    }

}
