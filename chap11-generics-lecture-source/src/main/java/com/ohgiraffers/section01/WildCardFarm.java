package main.java.com.ohgiraffers.section01;

public class WildCardFarm {


    public void anyType(RabbitFarm<?> farm){
        farm.getAnimal().cry();
    }

    public void extendsType(RabbitFarm<? extends Bunny> farrm){
        farrm.getAnimal().cry();
    }

    public void superType(RabbitFarm<? super Bunny> faarm){
        faarm.getAnimal().cry();
    }
}
