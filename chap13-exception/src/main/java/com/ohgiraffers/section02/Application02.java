package main.java.com.ohgiraffers.section02;

import main.java.com.ohgiraffers.section02.exception.MoneyNegativeException;
import main.java.com.ohgiraffers.section02.exception.NotEnoughMoneyException;
import main.java.com.ohgiraffers.section02.exception.PriceNegativeException;

public class Application02 {

    public static void main(String[] args){

        ExceptionTest et = new ExceptionTest();

        try {
            et.checkEnoughMoney(-10000, -500);
        } catch (NotEnoughMoneyException e){// PriceNega 랑 MoneyNega 는 부모가 같아서 같이 묶이지만 NotEnough는 부모가 달라서 안됨
            e.printStackTrace();
        }catch (PriceNegativeException | MoneyNegativeException e){
            e.printStackTrace();
        }finally {
            System.out.println("무조건 마지막에 동작됨");
        }

    }


}
