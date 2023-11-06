package main.java.com.ohgiraffers.section02.uses;

public class MemberFinder {


    public Member[] findAllMembers(){// ((no==2시)-4) MemberRepository 클래스를 참조하여 findAllmembers(); 메소드 값을 호출한다 ->findAllMembers();
        return MemberRepository.findAllMembers();//((no==2시)-6) findAllmembers()로 받은 members를 다시 반환한다.
    }
}
