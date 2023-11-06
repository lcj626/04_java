package main.java.com.ohgiraffers.section01.extend;

public class Car {


    private boolean runningStatus;//true or false 상황 설정

    public Car(){
        //super(); //Car는 직접적인 부모가 없지만 오브젝트는 모든 클래스의 공통부모이다. 오브젝트에 정의된 걸 Car에 집어넣는다
        System.out.println("car 클래스의 기본 생성자를 호출함");
    }

    public void run(){//자동차가 달린다는 상황
        runningStatus = true;//true니까 자동차가 달린다
        System.out.println("자동차가 달립니다");
    }

    public void soundHorn(){//경적울리는 메소드
        if(isRunning()) {//만약 달리는 중이라면
            System.out.println("빵빵");//경적울리기
        }else{//아니라면
            System.out.println("주행중이 아닌 상태에서는 경적을 울릴 수 없습니다");
        }
    }

    public boolean isRunning(){//위 if문 isRunning 설정
        return runningStatus;//isRunning을 runningStatus로 초기화
    }


    public void stop(){
        runningStatus = false;
        System.out.println("자동차가 멈춥니다.");
    }
}
