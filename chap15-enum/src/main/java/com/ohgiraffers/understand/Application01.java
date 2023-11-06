package main.java.com.ohgiraffers.understand;

import main.java.com.ohgiraffers.understand.type.Htype;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application01 {

    public static void main(String[] args) {

        //회원 제한은 없으며 체력을 관리해아 한다.
        //10명의 회원 유형도 자율이다.

        List<MemberDTO> members = new ArrayList<>();
        members.add(new MemberDTO("허생원", 50));
        members.add(new MemberDTO("홍길동", 70));
        members.add(new MemberDTO("허균", 40));
        members.add(new MemberDTO("임꺽정", 80));
        members.add(new MemberDTO("장보고", 70));
        members.add(new MemberDTO("이순신", 80));
        members.add(new MemberDTO("왕건", 70));
        members.add(new MemberDTO("궁예", 70));
        members.add(new MemberDTO("견훤", 80));

        Scanner scanner = new Scanner(System.in);
        String[] value = scanner.nextLine().split(" ");


        for (int i = 0; i < members.size(); i++) {
            String result = value[i];
            //members.get(i).setType();
        }
        System.out.println(value);


        Kiyu trainer = new Kiyu();

        if(trainer.getHp()>0){


        }




    }

}
