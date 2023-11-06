package main.java.com.ohgiraffers.section01.understand.car;

/*자동차가 공통적으로 가지고 있는
*성을 만들어 준다.
*
* 자동차는 공통적으로
* brand명과 price를 갖는다.
* */
public class Car {

    // 현대차

    private final String brand;//Car 클래스 속성

    private int price;



    public Car(String brand, int price){
        this.brand = brand;
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }


    public String getBrand(){
        return this.brand;
    }
}
