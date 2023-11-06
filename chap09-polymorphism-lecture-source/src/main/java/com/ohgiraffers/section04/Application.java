package main.java.com.ohgiraffers.section04;

import main.java.com.ohgiraffers.section04.use2.DatabaseSaveProvider;
import main.java.com.ohgiraffers.section04.use2.FileSaveProvider;
import main.java.com.ohgiraffers.section04.use2.Person;
import main.java.com.ohgiraffers.section04.use3.Dicer;
import main.java.com.ohgiraffers.section04.use3.HellDice;
import main.java.com.ohgiraffers.section04.use3.SuperDice;

public class Application {

    public static void main(String[] args){
        //use2 파트 부분
        /*Person person = new Person(new DatabaseSaveProvider());
        Person person1 = new Person(new FileSaveProvider());
        person1.doSomething();
        person.doSomething();//위에 person1이랑 person.doSomething은 다르다 person1은 DatabaseSaveProvider에서 person은 FileSaveProvider에서 온 것*/

        Dicer dicer = new Dicer();
        dicer.throwDice(new HellDice());//4만큼 고정적 이동
        dicer.throwDice(new SuperDice());//랜덤 이동
        //둘이 어떻게 보면 상관 없지만 동일하게 취급할 수 있다

    }
}
