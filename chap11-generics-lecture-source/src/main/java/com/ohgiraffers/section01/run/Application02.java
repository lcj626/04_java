package main.java.com.ohgiraffers.section01.run;

import main.java.com.ohgiraffers.section01.*;

public class Application02 {

    public static void main(String[] args) {


        /*
         * 와일드카드(WildCard)
         * 제네릭 클래스 타입의 객체를 메소드의 매개변수로 받을 때
         * 그 객체의 타입 변수를 제한할 수 있다.
         * <?> : 제한 없음
         * <? etends Type> : 와일드카드의 상한 제한 (Type과 Type의 후손을 이용해 생성한 인스턴스만 인자로 허용)
         * <? super Type> :  와일드 카드 하한 제한(Type과 Type의 부모를 이용해서 생성한 인스턴스만 인자로 허용)
         * */

        WildCardFarm wildCardFarm = new WildCardFarm();

//        wildCardFarm.anyType(new RabbitFarm<Mammal>(new Mammal()));
//        wildCardFarm.anyType(new RabbitFarm<Reptile>(new Reptile()));

        wildCardFarm.anyType(new RabbitFarm<>(new Rabbit()));
        //Rabbit 에게 상속(extends) 받았으므로 Rabbit 과 그의 자손들만 받을 수 있다
        wildCardFarm.anyType(new RabbitFarm<>(new Bunny()));
        wildCardFarm.anyType(new RabbitFarm<>(new DrunkenBunny()));

        System.out.println("===========================================================================");
//        wildCardFarm.extednsType(new RabbitFarm<Rabbit>(new Rabbit()));

        wildCardFarm.extendsType(new RabbitFarm<>(new Bunny()));
        //extends Bunny 했으므로 Bunny와 그 자손만 받을 수 있다. Bunny의 부모나 아예 상관없는건 받지 못한다

        wildCardFarm.extendsType(new RabbitFarm<>(new DrunkenBunny()));


        System.out.println("==============================================================================");

        wildCardFarm.superType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFarm.superType(new RabbitFarm<Bunny>(new Bunny()));
        // Bunny를 부모로 설정했으므로 Bunny 그 자신과 Bunny의 조상들만 받을 수 있다
        // but RabbitFarm 클래스에 Rabbit에게 상속 받았다 했으므로 Bunny~Rabbit 사이만 가능


        /*
        아래의 내용을 테스트 하기전
        RabbitFarm<T extends Rabbit> ->  RabbitFarm<T extends Object>
        // RabbitFarm<T extends Rabbit>으로 타입이 지정되어 있기 때문에
        // superType(RabbitFarm<? super Bunny>)로 정의를 하게 되면
        // 허용 범위가 Rabbit ~ Bunny 사이의 조상만 허용이 가능하게 된다.
        wildCardFarm.superType(new RabbitFarm<Mammal>(new Mammal()));


        // superType(RabbitFarm<? super Bunny>)로 정의가 되어 있기 때문에
        // Bunny와 관련이 없는 Reptile 타입을 지시할 수 없게 되는 것이다.
        wildCardFarm.superType(new RabbitFarm<Reptile>(new Snake()));
        */


        //        wildCardFarm.superType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));
    }
}
