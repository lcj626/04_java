package main.java.com.ohgiraffers.section03.abstraction;

public class Car {

    private boolean isOn;
    private int speed;


    public void startUp(){
        if(isOn){
            System.out.println("이미 시동이 걸려 있습니다.");
        }else{
            this.isOn = true;
            System.out.println("시동이 걸렸습니다.");
        }
    }

    public void go() {

        if(isOn){

            if(speed == 0){
                System.out.println("자동차가 출발 합니다. ");
            }
            speed += 10;//밟을때마다 10씩 속도 증가
            System.out.println("현재 자동차의 시속은 " + speed +"km/h 입니다.");

        }else{
            System.out.println("자동차는 시동을 걸어야 출발이 가능합니다.");
        }
    }

    public void stop(){
        if (isOn) {
            if (this.speed > 0) {
                while (this.speed >= 0) {
                    --this.speed;
                    System.out.println("현재 속도 " + this.speed + "km/h ");
                }
                System.out.println(" 휴 자동차가 멈췄습니다. ");
            } else {
                System.out.println("이미 멈춰 있는 상태입니다. ");
            }
        }else{
            System.out.println("시동을 걸지 않은 경우 유압으로 인해 브레이크가 점점 무거워 집니다. ");
        }
    }

    public void turnOff(){
        if(isOn){
            if(speed > 0){
                System.out.println("달리는 상태에서는 시동을 끄는 것은 위험합니다.");
            }else{
                this.isOn = false;//밑에 문구보다 이걸 먼저
                System.out.println("시동을 끄겠습니다");
            }
        }else{
            System.out.println("이미 시동이 꺼져 있습니다.");
        }
    }
}
