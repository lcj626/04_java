package main.java.com.ohgiraffers.section01.user_type;

import java.util.Scanner;

public class Application01 {

    public static void main(String[] args){

        String id = "user01";
        String pwd = "pass01";
        String name = "기유";
        int age = 20;
        char gender = '남';
        String[] hoddys = new String[] {"축구", "볼링", "테니스"};

        print(id,pwd,name,age,gender,hoddys);
        System.out.println("===============1년이 지나고===================");
        age = modifyAge(age);

        print(id,pwd,name,age,gender,hoddys);


      /*  System.out.println(id + " 님이 " + pwd +" 로그인을 하셨습니다.");
        System.out.println("로그인한 사용자 이름은 " + name + " 나이는 : " + age + " 성별은 " +gender + " 취미는 : ");*/

        for (String hobby : hoddys){
            System.out.println(hobby + " ");
        }
        System.out.println(" 입니다. ");
        //멤버가 많아지면 일일이 추가하는거 어떻게?


        System.out.println("================================================================");

        String id1 = "user02";
        String pwd1 = "pass02";
        String name1 = "민식";
        int age1 = 21;
        char gender1 = '남';
        String[] hoddys1 = new String[] {"축구", "볼링", "테니스"};
        print(id1,pwd1,name1,age1,gender1,hoddys1);

       /* System.out.println(id1 + " 님이 " + pwd1 +" 로그인을 하셨습니다.");
        System.out.println("로그인한 사용자 이름은 " + name1 + " 나이는 : " + age1 + " 성별은 " +gender1 + " 취미는 : ");

        for (String hobby : hoddys1){
            System.out.println(hobby + " ");
        }
        System.out.println(" 입니다. ");*/


        System.out.println("==============================================================");
        /* 위와 같이 변수를 개별적으로 활용 해서 생기는 문제점
        * 1. 변수명을 다 관리 해야 하는 어려움이 생긴다
        * 2. 모든 회원정보를 인자로 메소드 호출 시 값을 전달 해야 하면 너무 많은 값들을 인자로 전달 해야 해서 눈에 안 들어온다
        * 3. 리턴은 1개의 값만 가능하기 때문에 회원정보를 묶어서 리턴 값으로 사용할 수 없다.(자료형이 서로 다르기 때문)
        * */

        Member kiyu = new Member();
        kiyu.name = "기유";
        kiyu.age = 20;
        kiyu.id = "kiyu";
        kiyu.pwd = "pass";
        kiyu.hobby = new String[]{"축구", "헬스", "농구"};
        System.out.println(kiyu.toString());
        System.out.println("=======================1년이 지나고==============================");
        kiyu = modifyMember(kiyu);
        System.out.println(kiyu.toString());

        Member minsik = new Member();
        minsik.name = "민식";
        minsik.age = 20;
        minsik.pwd = "pass";
        minsik.gender = '남';
    }

    public static void print(String id, String pwd, String name, int age, char gender, String[] hoddys){

        System.out.println(id + " 님이 " + pwd +" 로그인을 하셨습니다.");
        System.out.println("로그인 한 사용자 이름은 " + name + " 나이는 : " + age + " 성별은 " +gender + " 취미는 : ");

        for (String hobby : hoddys){
            System.out.println(hobby + " ");
        }
        System.out.println(" 입니다. ");

    }

    public static int modifyAge(int age){
        if(age < 0 ){
            return 0;
        }

        return age + 1;
    }


    public static Member modifyMember(Member member){
        member.age = member.age+1;
        return member;

    }


}
