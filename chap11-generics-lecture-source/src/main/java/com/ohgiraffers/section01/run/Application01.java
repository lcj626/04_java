package main.java.com.ohgiraffers.section01.run;

import main.java.com.ohgiraffers.section01.*;

import javax.xml.datatype.Duration;
import java.util.ArrayList;
import java.util.List;

public class Application01 {

    public static void main(String[] args){

        //
        //RabbitFarm<Animal> farm1 = new RabbitFarm<>(); <- Rabbit의 자손들만 가능하도록 설정되었기 때문에(Rabbit 본인도 가능 상속은 자기자신부터) 부모인 Animal 자료형 생성하는건 불가능
        //RabbitFarm 클래스의 extends Rabbit 만 없애고 <T> 있으면 어떤 타입이던 설정 가능

        RabbitFarm<Rabbit> farm4 = new RabbitFarm<>();
        RabbitFarm< Bunny> farm5 = new RabbitFarm<>();
        RabbitFarm<DrunkenBunny> farm6 = new RabbitFarm<>();

//        RabbitFarm<?> farm7 = new RabbitFarm();
//        farm7.setAnimal(new Snake()); //T는 Rabbit의 후손이 아니다. extends Rabbit 으로 제한이 걸려있는 상황. 그냥 T만 있으면 어떤것이건 다 가능

        farm4.setAnimal(new Rabbit());
        ((Rabbit) farm4.getAnimal()).cry();//제네릭 타입 ->타입을 모르는 것 타입을 꺼내와야지 Rabbit의 참조자료형이 되기때문에 farm4만으론 안되고 get.Animal 설치
//        Object test = new Object();
//        ((Rabbit)test).cry();

        // Rabbit의 후손 타입만 허용할 수 있도록 제네릭스의 제한을 걸어 두었기 때문에
        // <T extends Rabbit> 형변환이 생각 가능 하다.
        // 이유 T이 결정되어도 T의 값은 Rabbit의 후손일 것이기 때문에
        farm5.setAnimal(new Bunny());
        farm5.getAnimal().cry();

        farm6.setAnimal(new DrunkenBunny());
        ((Bunny) farm6.getAnimal()).cry();


        List<? super Rabbit> parents = new ArrayList<>();
        parents.add(new Rabbit());
        //parents.add(new Mammal());





    }
}
