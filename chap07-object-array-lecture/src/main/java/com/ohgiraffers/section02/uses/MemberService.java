package main.java.com.ohgiraffers.section02.uses;

public class MemberService {//객체지향 프로그래밍

    //데이터베이스와 커넥션 하는 객체를 갖는 필드

    public void signUpMembers(){// (no ==1) -2
        //Member[] 배열의 사이즈를 5로 만들어줌
        Member[] members = new Member[5];
        // Member 배열에 Member 클래스를 생성하여 값을 넣어줌
        members[0] = new Member(1, "user01", "pass", "홍길동", 20, '남');
        members[1] = new Member(2, "user02", "pass", "유관순", 20, '여');
        members[2] = new Member(3, "user03", "pass", "이순신", 20, '남');
        members[3] = new Member(4, "user04", "pass", "신사임당", 20, '여');
        members[4] = new Member(5, "user05", "pass", "윤봉길", 20, '남');
        // ((no==1) -3) memberRegister를 생성함
        MemberRegister/*클래스*/ memberRegister = new MemberRegister();
        //((no==1) -4) memberREgist.regis()메서드에 Member[]을 매개변수로 전달하여 해당 매서드를 호출(실행)함
        memberRegister.regist(members);


    }

    public void showAllmembers(){
        MemberFinder finder = new MemberFinder();

        System.out.println("=====가입된 회원 목록==========");
        for (Member member : finder.findAllMembers()){//((no==2시)-3) finder를 참조하여 findAllMembers 메소드 값을 호출하여 member에 대입한다 ->findAllmembers
            if (member !=null){// ((no==2시)-7) member의 값이 null이 아니라면 member를 참조하여 getInfo를 호출한다. ->getInfo
                System.out.println(member.getInfo());//((no==2시)-9) getInfo에서 호출 받은 값을 실행한다.
            }
        }
        System.out.println("-------------회원 조회 완료---------------");
    }

}
