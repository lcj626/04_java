package main.java.com.ohgiraffers.understand.auth.impl;

import main.java.com.ohgiraffers.understand.auth.SnsAuth;
import main.java.com.ohgiraffers.understand.dto.MemberDTO;

public class GoogleAuth implements SnsAuth {// 인터페이스 SnsAuth에게서 상속 받음

    @Override
    public boolean login(MemberDTO memberDTO) {
        MemberDTO googleMember = new MemberDTO("google", "pass");//MemberDTO의 toString

        if(!googleMember.getId().equals(memberDTO.getId())){//googleMember Id값이 memberDTO Id 값과 같지 않다면
            System.out.println("구글 회원의 아이디가 같지 않습니다.");
            return false;
        }else{
            if(!googleMember.getPwd().equals(memberDTO.getPwd())){
                System.out.println("구글 회원의 비밀번호가 같지 않습니다.");
                return false;
            }
        }

        return true;
    }

}
