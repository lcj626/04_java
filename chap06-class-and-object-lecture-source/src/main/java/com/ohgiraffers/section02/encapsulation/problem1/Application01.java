package main.java.com.ohgiraffers.section02.encapsulation.problem1;

public class Application01 {

    public static void main(String[] args){

        Monster monster = new Monster();
        System.out.println(monster.hashCode());
        //93122545.hp
        monster.name = "두차"; //93122545.name
        monster.hp = 200; // 93122545.hp
        //Monster.name = "두차";
        System.out.println("monster name : " + monster.name);
        System.out.println("monster hp : " + monster.hp);


        System.out.println("================================================");



        Monster monster2 = new Monster();
        //monster2 == 주소값
        System.out.println(monster2.hashCode());
        //2083562754.hp
        monster2.name = "뿌꾸"; // 주소값.name = "뿌꾸"
        monster2.hp = -200; // 주소값.hp = "-200"
        System.out.println("monster2의 name " + monster2.name); //null이 나온거로 봤을때 위의 식과 밑의 식은 별개
        System.out.println("monster2의 hp : " + monster2.hp);

        System.out.println("====================================================");

        Monster monster3 = new Monster();
        monster3.name = "드라큘라";
        monster3.setHp(-200);
        System.out.println("monster3의 name " + monster3.name);
        System.out.println("monster3의 hp : " + monster3.hp);


        System.out.println("=======================================================");

        Monster monster4 = new Monster();
        monster4.name = "프랑켄슈타인";
        monster4.setHp(1000);
        System.out.println("monster4의 name " + monster4.name);
        System.out.println("monster4의 hp : " + monster4.hp);

    }

}
