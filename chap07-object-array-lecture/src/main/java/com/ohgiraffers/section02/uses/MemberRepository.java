package main.java.com.ohgiraffers.section02.uses;

public class MemberRepository {

    private final static Member[] members;
    private static int count; //

    static {
        members = new Member[10];
    }


    public static boolean store(Member[] newMembers){// no==1 - 9  전달 받는 Member[]를 newMembers에 대입한다.
        //no==1 -10  member의 길이만큼 반복문을 실행 한다.
        for (int i = 0; i < newMembers.length; i++) {
            //members에 [count++]가 들어가는 이유
            //현재 members는 static 변수이다. 이 이야기는 모든 MemberRepository의 인스턴스가 members 배열을 공유하게 된다.
            // 여기서 members의 길이는 10으로 고정이 되어 있기 때문에 members[i]를 대입하게 되면 매번 호출 시 i는 0으로 시작하게 된다.
            //이러한 오류를 해결하기 위해 모든 MembersRepository의 인스턴스가 배열의 인덱스 members[index]를 공유하기 위해서
            // count 라는 static 변수를 참조하여 배열의 인덱스에 접근하게 하여 전달 받은 newMembers[i]를 대입하는 것이다.
            members[count++] = newMembers[i];
            //count 대신 i 넣으면 0,1,2,3,4 이후 두번째 실행 때 다시 0번째 부터 시작한다. count 넣어서 이어하기 가능
        }
        //위의 대입하는 과정 종료 후 true를 반환한다.
        return true;
    }

    public static Member[] findAllMembers(){ //((no==2시)-5)members 객체 배열을 호출한다 ->다시 findAllMembers

        /*select *(전체) from member 생략*/
        return members;
    }
}
