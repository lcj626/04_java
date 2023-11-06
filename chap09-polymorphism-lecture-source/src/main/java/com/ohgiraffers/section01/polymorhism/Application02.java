package main.java.com.ohgiraffers.section01.polymorhism;

public class Application02 {

    public static void main(String[] args){

        Animal[] animals = new Animal[5];
        animals[0] = new Rabbit();
        animals[1] = new Tiger();
        animals[2] = new Rabbit();
        animals[3] = new Tiger();
        animals[4] = new Rabbit();

        for (int i = 0; i < animals.length; i++) {
            animals[i].cry();
        }//Animal에 있는 cry 호출 but 실행시켜 보니 Rabbit이었더라 -> 동적 바인딩


        System.out.println("==============================================================");
        //Animal animal = animals[0];와 같다
        for (Animal animal: animals) {
            if(animal instanceof Rabbit){//동작된 시점 보니 얘 Rabbit 이었네 (부모 Animal 시점엔 쓸 수 없었지만 형변환 해서 Jump 활성화)
                ((Rabbit)animal).jump();
            }else {
                ((Tiger) animal).bite();
            }
        }
    }


}
