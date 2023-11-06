package main.java.com.ohgiraffers.section05.parameter;

public class BaekJunTest1_App1 {

    public static void main(String[] args){

        BaekJunTest1_Parameter pt = new BaekJunTest1_Parameter();

        RectAngle r1 = new RectAngle(2,3);
        System.out.println(" 직사각형 가져온 값" + r1);
        pt.testPrameter(r1);



    }
}
