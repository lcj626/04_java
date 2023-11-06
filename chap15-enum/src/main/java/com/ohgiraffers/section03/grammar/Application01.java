package main.java.com.ohgiraffers.section03.grammar;

import java.util.EnumSet;
import java.util.Iterator;

public class Application01 {

    public static void main(String[] args){

        UserRole1 admin = UserRole1.ADMIN;
        System.out.println(admin); // 따로 UserRole1 에 생성자를 만들지 않았지만 이 과정으로 자동 생성됨

        System.out.println(admin.getNameToLowerCase());



        System.out.println("=================================================");

        UserRole2 consumer = UserRole2.CONSUMER;
        UserRole2 consumer2 = UserRole2.CONSUMER; // 값을 할당해 놓고 쓰고 싶을때 씀
        System.out.println(consumer == consumer2);//값을 자동으로 꺼내와서 인스턴스 타입 가지고 비교할 수 있게 함
        System.out.println(consumer2.hashCode());
        System.out.println(consumer.hashCode());

        System.out.println("==================================================================");

        Application01 app = new Application01();
        Application01 app2 = new Application01();
        System.out.println(app == app2);//주소값 가지고 비교
        System.out.println(app.hashCode());
        System.out.println(app2.hashCode());


        System.out.println("=============================================================");

        EnumSet<UserRole2> roles = EnumSet.allOf(UserRole2.class);
        Iterator<UserRole2> iter = roles.iterator();

        while (iter.hasNext()){
            System.out.println(iter.next().name());
        }

        System.out.println("=============================================================");

        EnumSet<UserRole2> notGuest = EnumSet.complementOf(EnumSet.of(UserRole2.GUEST)); // notGuest를 만들어 주고 GUEST 항목을 빼버림
        Iterator<UserRole2> notGuestIter = notGuest.iterator();

        while (notGuestIter.hasNext()){
            UserRole2 role2 = notGuestIter.next();
            System.out.println(role2.ordinal() + " " + role2.getDescription());
        }//ordinal - 얘가 지금 어떤 순서로 되어있나 순서 뽑기  getDescription ->UserRole2의 Description 가져옴


    }
}
