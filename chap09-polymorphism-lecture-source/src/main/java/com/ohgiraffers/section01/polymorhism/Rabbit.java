package main.java.com.ohgiraffers.section01.polymorhism;

public class Rabbit extends Animal{

    @Override
    public void eat() {// 부모 Animal에서 가져온 거니까 오버라이딩
        System.out.println("토끼가 풀을 뜯어 먹고 있습니다.");
       //super.eat();//super 키워드 : 부모, this 키워드 내 자신(만약 super 대신 this 넣으면 입력 시엔 오류가 안나지만 실행 시 오류 남 ->stack 오버플로우
    }

    @Override
    public void run() {
        System.out.println("토끼가 달려갑니다. 깡총 깡총~~~`");
        //super.run();
    }

    @Override
    public void cry() {
        System.out.println("토끼가 울음소리를 냅니다.");
        //super.cry();
    }

    public void jump(){//Rabbit 고유의 메소드
        System.out.println("토끼가 점프를 합니다.");
    }
}
