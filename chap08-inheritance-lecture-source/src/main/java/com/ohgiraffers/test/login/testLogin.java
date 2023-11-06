package main.java.com.ohgiraffers.test.login;

import java.util.Scanner;

public class testLogin {

    public static void main(String[] args){

        String id = "lcj626";
        String pass = "1234";
        String name = "이창주";

        Scanner scanner = new Scanner(System.in);

        //2개의 String을 입력 받겠다는
        System.out.println("# id를 입력해주세요");
        String Id = scanner.next();
        System.out.println("# password를 입력해주세요");
        String Pass = scanner.next();

        if (id.equals(Id) && pass.equals(Pass)) {
            System.out.println(name + "님 환영합니다");
        } else if(!id.equals(Id)){
            System.out.println("아이디가 정확하지 안습니다");
        } else if(!id.equals(pass)){
            System.out.println("비밀번호가 정확하지 않습니다.");
        }
    }
}
