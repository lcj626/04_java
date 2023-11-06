package main.java.com.ohgiraffers.section02.uses;

public class MemberRegister {


    public void regist(Member[] members){//(no==5) -5
        System.out.println("회원을 등록합니다.");
        // 전달 받은 매개변수 members에서 각 인덱스(위치) 값을 한 개씩 꺼내고 member 변수에 대입한다.
        for(Member member: members){
            // member 클래스에 선언된 getInfo() 메서드를 호출한다. 이후 흐름 getInfo 클릭
            System.out.println(member.getInfo() +
                    /*(no==1)-7 member.getInfo()에서 전달 받은 문자열과 뒤에 문자열을 합치고 사용자 화면에 보여 준다.*/
                    "님을 회원 등록에 성공했습니다.");// Member 클래스에서 넘어옴. 이 값은 넘길 때 println(String_name) 실행
            //System.out.println(member); // 넘길 때 println(Object_obj) 실행
            //클래스는 오브젝트의 후손
            //Object obj = member; // 상속 규칙, 자식은 부모를 받을 수 없다 부모는 자식을 받을 수 있다.

        }
        //(no==1) - 8  MemberRepository.store 메서드의 매개변수로 Member[]을 전달하고 호출 한다. 그리고 store 클릭하고 넘어감
        if(MemberRepository.store(members)){//store에서 반환 받은 값이 true이면 아래의 내용을 출력 한다.
            System.out.println("총 " + members.length + "명의 회원 등록에 성공 했습니다.");
        }


    }

}
