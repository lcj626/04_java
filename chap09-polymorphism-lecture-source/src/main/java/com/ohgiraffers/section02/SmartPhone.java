package main.java.com.ohgiraffers.section02;

public class SmartPhone extends Product {// Product는 몸체가 없기때문에 extends 만 치면 오류 ->abstractMethod를 오버라이딩 해줘야 함


    /*@Override
    public void abstractMethod() {

    }*/

    public SmartPhone(){

    }

    @Override
    public void abstractMethod(){
        System.out.println("Product 클래스의 추상 메서드를 호출함");
    }

    public void printSmartPhone(){
        System.out.println("Smart 폰의 클래스의 print 메서드를 호출함");
    }
}
