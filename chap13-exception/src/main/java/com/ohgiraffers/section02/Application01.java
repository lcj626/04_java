package main.java.com.ohgiraffers.section02;

import main.java.com.ohgiraffers.section02.exception.MoneyNegativeException;
import main.java.com.ohgiraffers.section02.exception.NotEnoughMoneyException;
import main.java.com.ohgiraffers.section02.exception.PriceNegativeException;

public class Application01 {

    public static void main(String[] args){

        ExceptionTest et = new ExceptionTest();

        try {
            et.checkEnoughMoney(-10000, -500);
        } catch (PriceNegativeException e) {//Exception 하나로 묶지 않고 이렇게 따로 작성하면 오류를 더 자세하게 볼 수 있다(Runtime exception인지 아닌지도 구분 안 됨)
            System.out.println("PriceNegativException 발생");
            System.out.println(e.getMessage()); // 예외가 빨간색 오류 형태가 아니라 메세지 형태로 나오게 됨
        } catch (MoneyNegativeException e) {
            System.out.println("MoneyNegativeException 발생");
            System.out.println(e.getMessage());
        } catch (NotEnoughMoneyException e) {
            System.out.println("NotEnoughMoneyException 발생");
            System.out.println(e.getMessage());
        }
    }
}
