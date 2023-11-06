package main.java.com.ohgiraffers.section01.extend;

public class FireCar extends Car{//extends 상속대상자 임을 표시 - Car를 상속을 받는것 Car가 부모

    public FireCar(){

        /*
        * 모든 생성자에는 맨 첫 줄에 super()를 컴파일러가 자동 추가한다.
        * 부모의 기본 생성자를 호출하는 구문이다.
        * 해당 생성자가 호출 될 시 가장 먼저 car() 클래스 호출 내용이 출력될 것이다.
        * 명시적, 묵시적 전부 사용 가능하다.
        * */

        super();//자바는 다중 상속 X Car에서만 상속 받음. but Car는 오브젝트에서 상속 받았기 때문에 FireCar는 Car가 상속받은 오브젝트 요소도 쓸 수 있음.



    }

    @Override // 부모가 가진 기능을 내가 재정의 하겠다 부고가 가진 접근자 제한타입 다 맞춰줘야함
    public void soundHorn(){
     if(isRunning()){//isRunning은 정의 안해줬지만 부모로부터 받았기 때문에 오류 x
         System.out.println("빠앙 빠앙");//isRunning은 runningStatus값을 가져온 것이므로 실행 시 달리는 상황 가정

     }else{
         System.out.println("소방차가 앖으로 갈 수 없습니다");
     }
    }

    public void sprayWater(){

        System.out.println("불난 곳을 발견했습니다. 물을 뿌립니다.");
    }
}
