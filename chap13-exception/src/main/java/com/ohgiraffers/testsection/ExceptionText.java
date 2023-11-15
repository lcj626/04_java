package main.java.com.ohgiraffers.testsection;

public class ExceptionText {

    public void divideNumber(int num1, int num2){


        if(num2 == 0){
            throw new ArithmeticException("0은 나눌 수 없습니다");
        }
    }


}
