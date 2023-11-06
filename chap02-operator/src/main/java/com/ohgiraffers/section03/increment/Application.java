package com.ohgiraffers.section03.increment;

public class Application {

    public static void main(String[] args){

        //증감연산자에 대하여 공부하자
        /*
        *  ++ X / X ++ : 앞 또는 뒤에 있는 피연산자의 값을 1만큼 증가시킨다.
        *  -- X / X -- : 앞 또는 뒤에 있는 피연산자의 값을 1만큼 뺀다.
        * */

        int num = 10;
        int num2 = 20;
        int result =0;
        //num++;
        //++num;

        result = result * ++num;
        System.out.println(result);
        System.out.println(num);
        //증감은 num 자체의 값을 바꿔주기 때문에 num 11
        //++이 앞에 붙기 때문에 num 증가를 먼저 시켜주고 num과 result의 연산을 한다.


        System.out.println("================================");
        //result = ++num;
        System.out.println(num);

        //result = num + num2++;
        //System.out.println(result);


        System.out.println("=========================================");
        result = 1;
        result = result * num++;
        System.out.println(result);
        System.out.println(num);
        //++ 가 뒤에 붙으면 num 증가 전에 result + num 이 우선시 된다.
    }
}
