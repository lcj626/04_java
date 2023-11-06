package main.java.com.ohgiraffers.section02.uses;

import java.util.Scanner;

public class Application01 {

    public static void main(String[] args){
        //프로그램 실행 시킬 때 가장 먼저 실행되는 메소드 -main

        /*
        * 시스템 요구사항
        * 1. 여러 명의 회원 정보를 받아 한 번에 여러 회원 정보를 등록
        * 2. 전체 회원 조회 시 여러 명의 회원 정보를 반환
        *
        * 1. MemberRepository에 static 필드로 회원 정보들을 관리
        * 2. 회원 정보는 최대 10명까지 저장할 수 있다.
        * */


        // 사용자의 입력을 받을 수 있도록 scanner 객체를 생성함
        // 반복문 내부에서 생성시 반복문 실행마다 새로운 인스턴스를 생성해야 하기 때문에
        // 메모리 낭비가 발생될 수 있으며 컴퓨터 리소스가 낭비됨
        Scanner scanner = new Scanner(System.in); //스캐너 부터 생성

        //memberService 객체를 heap에 생성하여 메서드를 실행할 수 있도록 준비함
        MemberService memberManager = new MemberService();// 스캐너 이후 멤버 서비스 생성

        while (true){
            System.out.println("========회원 관리 프로그램==========");
            System.out.println("1. 회원 등록");
            System.out.println("2. 회원 전체 조회");
            System.out.println("9. 프로그램 종료");
            System.out.println("메뉴 선택 : ");
            // 사용자에게 이용하고자 하는 서비스의 번호를 입력 받음(입력 값은 정수형)
            int no = scanner.nextInt();

            switch (no){ // 입력값이 아래와 같을 경우 해당 되는 서비스를 실행 해 줌
                // 사용자 입력값이 == 1 이면 memberService 클래스에 있는 signUpMembers() 메서드를 호출함
                // 호출 시 stack 영역에서 동작이 된다. 참고(no==1시 실행 ->mem) -1
                case 1 : memberManager.signUpMembers(); break;
                // 호출 시 stack 영역에서 동작이 된다. 참고((no==2시)-1) -> showallmembers
                case 2 : memberManager.showAllmembers(); break;
                case 9 : System.out.println("프로그램을 종료합니다");break;
                default : System.out.println("잘못 된 번호를 입력 하셨 습니다.");


            }
        }

    }
}
