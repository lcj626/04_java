package main.java.com.ohgiraffers.section01;

public class RabbitFarm <T extends Rabbit>{//T는 Rabbit의 후손

    private T animal;

    public RabbitFarm(){

    }

    public RabbitFarm(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {//T는 Rabbit의 후손
        this.animal = animal;
    }
}
