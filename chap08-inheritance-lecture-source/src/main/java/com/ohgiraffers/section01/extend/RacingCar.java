package main.java.com.ohgiraffers.section01.extend;

public class RacingCar extends Car {

    public RacingCar(){
        System.out.println("racingClass 클래스의 기본 생성자를 호출")
        ;
    }
    public void run(){

        System.out.println("레이싱 카가 전속력으로 질주 합니다.");
    }

    public void soundHorn(){
        System.out.println("레이싱 카가 멈춥니다");
    }

    @Override
    public boolean isRunning() {
        return super.isRunning();
    }

    @Override
    public void stop() {
        super.stop();
    }

}
