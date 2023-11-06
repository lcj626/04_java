package main.java.com.ohgiraffers.test.login;

public class MemberInfo {

    boolean tr;


    public void MemberInfo(String id, int pwd){

        if (id == "lcj626" && pwd == 123456){
            tr = true;
            System.out.println("이창주님 환영합니다.");
        }else if(id != "lcj626") {
            System.out.println("아이디를 잘 못 입력 하셨습니다.");
        }else{
            System.out.println("비밀 번호를 확인 해 주세요");
        }

    }




}
