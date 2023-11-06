package main.java.com.ohgiraffers.section08.japangi;

import java.util.Scanner;

public class Application {

    public static void main(String[] args){

        int money = 0;
        int menu = 0;
        int price = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("금액을 넣어주세요");

        money = scanner.nextInt();
        System.out.println("음료수를 골라라");
        System.out.println("1.콜라 1000원 2.사이다 900원 3.환타 800원 4.데자와 500원");
        menu = scanner.nextInt();

        switch (menu){

            case 1 : price = 1000; break;
            case 2 : price = 900; break;
            case 3 : price = 800; break;
            case 4 : price = 500; break;
            default: System.out.println("해당 메뉴는 없습니다.");break;
        }
        if (money<price){
            System.out.println("돈이 부족합니다");
        }else{
            money -=price;
        }
        System.out.println("잔돈 : " + money);







    }
}
