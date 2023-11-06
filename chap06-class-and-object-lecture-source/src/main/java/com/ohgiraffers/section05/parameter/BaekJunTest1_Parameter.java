package main.java.com.ohgiraffers.section05.parameter;

public class BaekJunTest1_Parameter {

    public void testPrameter(RectAngle rectAngle){

        System.out.println("매개변수로 전달받은 값 : " + rectAngle);

        rectAngle.calcArea();

        System.out.println("새로운 값");

        rectAngle.setHeight(100);
        rectAngle.setWidth(1);
        rectAngle.calcArea();



    }
}
