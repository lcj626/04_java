package main.java.com.ohgiraffers.understand;

import main.java.com.ohgiraffers.understand.auth.impl.GoogleAuth;
import main.java.com.ohgiraffers.understand.auth.impl.KakaoAuth;
import main.java.com.ohgiraffers.understand.auth.impl.NaverAuth;
import main.java.com.ohgiraffers.understand.dto.MemberDTO;
import main.java.com.ohgiraffers.understand.service.MemberService;

import java.util.Scanner;

public class Application01 {

    public static void main(String[] args){

        MemberService memberService; //사용자가 로그인 한다고 다시 만들 필요는 없음

        do{
            MemberDTO memberDTO = new MemberDTO();//초기화를 위해서 do 안에 넣는다
            System.out.println("--------사용자 인증 프로그램 입니다.-----");
            System.out.println("1. google 로그인");
            System.out.println("2. naver 로그인");
            System.out.println("3. 카카오 로그인");
            System.out.println("9.프로그램 종료");
            System.out.println("로그인 한 인증 수단을 선택해 주세요 : ");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            scanner.nextLine();
            System.out.println("아이디를 입력해 주세요 : ");
            memberDTO.setId(scanner.nextLine());
            System.out.println("비밀번호를 입력해 주세요 : ");
            memberDTO.setPwd(scanner.nextLine());
            boolean result;
            String type;
            switch (choice){
                case 1 : memberService = new MemberService(new GoogleAuth());
                        result = memberService.findMember(memberDTO);
                        if(result){
                            System.out.println("google 로그인에 성공 하였습니다. " + memberDTO.getId());
                        }
                        break;
                case 2 : memberService = new MemberService(new NaverAuth());
                        result = memberService.findMember(memberDTO);
                        if(result){
                            System.out.println("naver 로그인에 성공 하였습니다 " + memberDTO.getId());
                        }
                        break;
                case 3 : memberService = new MemberService(new KakaoAuth());
                    result = memberService.findMember(memberDTO);
                    if(result){
                        System.out.println("kakao 로그인에 성공 하였습니다 " + memberDTO.getId());
                    }
                    break;
                case 9 :
                    System.out.println("로그인을 종료합니다."); return;
            }

        }while (true);




/*
        System.out.println("로그인 방식을 선택하세요 : 1. 구글 2. 네이버 3. 카카오");

        int sns = scanner.nextInt();

        System.out.println("아이디를 입력하세요.");
        String id = scanner.nextLine();
        System.out.println("비밀번호를 입력하세요.");
        String pass = scanner.nextLine();

        MemberService memberService = new MemberService();*/







    }
}
