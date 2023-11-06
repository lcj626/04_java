package main.java.com.ohgiraffers.understand.dto;

public class MemberDTO {

    private String id;
    private String pwd;

    public MemberDTO(){

    }

    public MemberDTO(String id, String pwd) {//MemberDTO의 객체 변수들을 초기화 해 조작
        this.id = id;
        this.pwd = pwd;
    }

    public String getId() {//게터 세터
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {//정보들을 문자열로 반환 ->오버라이드
        return "MemberDTO{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
