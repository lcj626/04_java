package main.java.com.ohgiraffers.section01.method;

public class Application9 {

    public static void main(String[] args){

        /* 계산기 만들기*/

        int first = 20;
        int second = 50;

        int result = 0;
        Caculator app9 = new Caculator();
        result =app9.minNumberOf(first, second);
        System.out.println(result);
        result =Caculator.maxNumberOf(first, second);
        System.out.println(result);









    }

}
