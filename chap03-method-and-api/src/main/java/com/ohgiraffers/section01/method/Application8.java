package main.java.com.ohgiraffers.section01.method;

public class Application8 {

    public static void main(String[] args){

        /*
        * static 메소드
        *
        * static 메소드를 호출하는 방법
        * 클래스.메소드명();
        * */

        //Application8 app1 = new Application8();
        //int result = app1.sumToNumbers - static 상황에서는 권장하지 않는 방식 static은 이미 메모리가 있기 때문에 but static 이외에는 따로 설정해야함



        int num1 = 11;
        int num2 = 5;
        int num3 = 9;
        int num4 = 6;
        String result2 =Application8.maxNumberOf(11,5,9,6);
        System.out.println(result2);

    }

    public static String maxNumberOf(int num1, int num2, int num3, int num4){
            return (num1*num2 > num3*num4)? "참" : "거짓" ;
    }
}
