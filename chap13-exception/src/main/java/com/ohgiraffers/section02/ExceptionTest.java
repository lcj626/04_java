package main.java.com.ohgiraffers.section02;

import main.java.com.ohgiraffers.section02.exception.MoneyNegativeException;
import main.java.com.ohgiraffers.section02.exception.NotEnoughMoneyException;
import main.java.com.ohgiraffers.section02.exception.PriceNegativeException;

public class ExceptionTest {

    public void checkEnoughMoney(int price, int money)
            throws PriceNegativeException, MoneyNegativeException, NotEnoughMoneyException{ //Exception 하나로 묶여 있다
        System.out.println("가지고 있는 돈은 " + money + "원 입니다.");


        if(price<0) {
            throw new PriceNegativeException("상품 가격은 음수일 수 없습니다");//예외를 별도로 정의
        }
        if(money < 0){//else if 로 묶어버리면 위에거 끝나고 끝나버릴 수 있음 따로따로가 좋을때가 있다
            throw new MoneyNegativeException("가지고 있는 돈은 음수일 수 없습니다.");
        }
        if(money < price){
            throw new NotEnoughMoneyException("가진 돈 보다 상품 가격이 더 비쌉니다");
        }
        System.out.println("즐쇼~");
    }


}
