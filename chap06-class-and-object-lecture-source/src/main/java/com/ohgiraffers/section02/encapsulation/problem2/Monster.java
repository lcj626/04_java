package main.java.com.ohgiraffers.section02.encapsulation.problem2;

public class Monster {


    String name;
    int hp;
    public void setHp(int hp){
        if(hp > 0){
            /*
            * this 는 인스턴스가 생성되었을 때 자신의 주소를 저장하는 레퍼런스 변수이다.
            * 지역변수와 전역변수의 이름이 동일한 경우 지역변수를 우선적으로 접근하기 때문에
            * 전역변수에 접근하기 위해서는 this.을 명시해야 한다.
            * */
            System.out.println("양수값이 입력되어 몬스터의 체역을 입력한 값으로 변경합니다.");
            this.hp = hp;//원래는 같은 변수는 공존 x but 전역에 있는 변수(보라색 hp)와 지역변수의 차이로 공존 //monster2의 경우 this == 주소값
        }else{
            System.out.println("0보다 작거나 같은 값이 입력되어 몬스터의 체력을 0으로 설정합니다.");
            this.hp = 0;
        }
    }

}
