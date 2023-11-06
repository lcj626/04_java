package main.java.com.ohgiraffers.section04.use1;

public class RacingCar extends Car{//울리는 기능은 구현하지 않을거라 Car만 상속 받음

    @Override
    public void go() {
        System.out.println("레이싱카가 달려 갑니다.");
    }

    @Override
    public void stop() {
        System.out.println("레이싱카가 멈춥니다.");
    }
}
