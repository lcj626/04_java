package main.java.com.ohgiraffers.section01.init;

public class Car {

    private String modelName;

    private int maxSpeed;

    public Car(String modelName, int maxSpeed){
        this.modelName = modelName;
        this.maxSpeed = maxSpeed;

    }

    public void driveMAxSpeed(){
        System.out.println(modelName + "이(가) 최고시속 " + maxSpeed + "km/h로 달려 갑니다.");
    }
}
