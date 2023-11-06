package main.java.com.ohgiraffers.section01.polymorhism;

public class Tiger extends Animal{

    @Override//부모 Animal 에서 가져온 요소들은 오버라이딩
    public void eat() {
        System.out.println("호랑이가 고기를 먹습니다.");
        //super.eat();
    }

    @Override
    public void run() {
        System.out.println("호랑이가 사냥을 위해 달려 갑니다.");
        //super.run();
    }

    @Override
    public void cry() {
        System.out.println("호랑이가 울부 짖습니다.");
        //super.cry();
    }

    public void bite(){//Tiger에서 새로 만든 메소드
        System.out.println("호랑이가 물어 뜯습니다.");
    }

}
