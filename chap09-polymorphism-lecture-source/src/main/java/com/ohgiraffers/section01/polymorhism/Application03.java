package main.java.com.ohgiraffers.section01.polymorhism;

public class Application03 {

    public static void main(String[] args){

        Animal animal = new Rabbit();
        Animal animal1 = new Tiger();

        //Animal animal = animal; ->Rabbit
        Application03.feed(animal);//feed 메소드는 매개변수로
        Application03.feed(animal1);

        System.out.println("===============================================================");

        Rabbit rabbit = new Rabbit();
        Tiger tiger = new Tiger();

        feed(rabbit);
        feed(tiger);

        feed(new Tiger());
        feed(new Rabbit());//어차피 생성자 호출 순간 heap에 주소값 창출

    }

    public static void feed(Animal animal){

        animal.eat();
    }
}
