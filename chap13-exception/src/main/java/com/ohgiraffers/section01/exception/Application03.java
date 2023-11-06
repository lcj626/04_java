package main.java.com.ohgiraffers.section01.exception;

public class Application03 {

    public static void main(String[] args){

        ExceptionText et = new ExceptionText();

        try {// 예외가 발생하지 않는데도 예외를 써야 하는 이유 - 프로그램 측에서 구조를 모르기 때문에 미리 try를 적어놔야 함
            et.checkEnoughMoney(5000,10000);
            System.out.println("상품 구매 완료");
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("프로그램 종료");
    }
}
