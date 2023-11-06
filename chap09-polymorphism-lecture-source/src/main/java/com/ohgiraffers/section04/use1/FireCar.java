package main.java.com.ohgiraffers.section04.use1;

public class FireCar extends Car implements Soundable{

    //Car car = new FireCar();
    /*Soundable soundable = new FireCar();
    FireCar fireCar = new FireCar();*/ // -> 상속으로 인해 FireCar 는 세가지 형태로 반환 가능


    @Override
    public void go() {
        System.out.println("소방차가 달려 갑니다.");
    }

    @Override
    public void stop() {
        System.out.println("소방차가 멈춥니다.");
    }

    @Override
    public void horn() {
        System.out.println("소방차가 나갑니다. 비키세요 급합니다.");
    }
}
