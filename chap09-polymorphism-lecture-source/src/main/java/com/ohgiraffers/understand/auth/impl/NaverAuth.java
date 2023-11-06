package main.java.com.ohgiraffers.understand.auth.impl;

import main.java.com.ohgiraffers.understand.auth.SnsAuth;
import main.java.com.ohgiraffers.understand.dto.MemberDTO;

public class NaverAuth implements SnsAuth{//auth 인증을 담당하는 패키지
    @Override
    public boolean login(MemberDTO memberDTO) {
        MemberDTO naverMember = new MemberDTO("naver", "pass");

        if(!naverMember.getId().equals(memberDTO.getId())){
            System.out.println("네이버 회원의 아이디가 같지 않습니다.");
            return false;
        }else{
            if(!naverMember.getPwd().equals(memberDTO.getPwd())){
                System.out.println("네이버 회원의 비밀번호가 같지 않습니다.");
                return false;
            }
        }

        return true;
    }

}
