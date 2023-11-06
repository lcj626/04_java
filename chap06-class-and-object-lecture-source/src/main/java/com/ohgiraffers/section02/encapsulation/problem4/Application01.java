package main.java.com.ohgiraffers.section02.encapsulation.problem4;

public class Application01 {

    public static void main(String[] args){

        /*접근 제어자의 필요성*/

        Monster monster = new Monster();
        monster.setKind("프랑켄슈타인");
        monster.setHp(500);
        System.out.println(monster.getHp() + " " + monster.getKind());
        System.out.println(monster instanceof Object); // 얘랑 얘랑 자료형이 같은지 판별. 팥붕어빵이랑 크림 붕어빵이랑 같은 붕어빵인 느낌
        System.out.println(monster);//원래는 monster 뒤에 자동으로 .toString 있음 그래서 Monster의 toString에 연결됨
    }
}
