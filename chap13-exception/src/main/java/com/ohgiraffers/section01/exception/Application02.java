package main.java.com.ohgiraffers.section01.exception;

public class Application02 {

    public static void main(String[] args){

        ExceptionText et = new ExceptionText();

        try{
            et.checkEnoughMoney(1000000, 100); // money<price 예외 사항이라 이걸 먼저 실행시키면 아래 것이 실행되지 않고 여기서 스탑
            et.checkEnoughMoney(5000, 10000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("프로그램을 종료 합니다");


    }
}
