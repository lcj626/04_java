package main.java.com.ohgiraffers.section03.abstraction;

public class CarRacer {



    private final Car car = new Car();

    // private Car car; // 할당만 하고 안에 내용이 없어서 겉으론 에러가 없지만 막상 참조 하면 Null 이라고 뜨고 에러가 난다.

    /*
    * 시동을 거는 메서드
    * @return void
    * */
    public void startUp(){
        car.startUp();
    }

    /*
    * this.car go 메서드를 호출하여 앞으로 가는 기능
    * @return void;
    * */
    public void stepAccelator(){
        car.go(); //this를 쓰면 전역 변수, 안쓰면 지역 변수에 쓴다
    }

    /*
    * this.car.stop() 메소드를 호출하여 자동차를 멈춘다.
    * */
    public void setUpBreak(){
        car.stop();
    }

    /**
     * this.car.turnoff() 메서드를 호출하여 시동을 끈다.
      */

    public void turnOff(){
        car.turnOff();
    }


}
