package main.java.com.ohgiraffers.section07.kindofvariable;

public class KindsOfVariable {

    /*
    * 클래스 영역에 작성 하는 변수를 필드라고 한다.
    * 필드 === 멤버 변수 (클래스가 가지는 멤버라는 의미) == 전역 변수(클래스 전역에서 사용할 수 있는 변수라는 의미)
    *
    * */

    //non-static field 를 인스턴스 변수 라고 한다.

    private int globalNum;

    //statci field를 정적필드(클래스 변수)라고 한다. (정적(클래스) 영역에 생성 되는 변수라는 의미이다.

    private static int staticNum;

    private void testMethod(int num){

        /*
        * 메소드 영역에서 작성하는 변수를 지역 변수라고 한다.
        * 메소드의 괄호 안에 선언하는 변수를 매게 변수라고 한다.
        * 매개 변수도 일종의 지역 변수로 생각하면 된다.
        * 지역변수와 매개변수 모두 메소드 호출 시 stack 을 할당받아 stack 생성 된다.
        * */

        int localNum;
        System.out.println(num); //int num 매개변수라 존재
        //System.out.println(localNum); // 지역변수는 반드시 초기화를 해줘야 한다. 어떤 쓰레기 값이 존재하는지 모르기 때문에(heap 영역이라면 0으로 기본 초기화)
        System.out.println(globalNum); // 전역 변수는 기본값으로 초기화가 된다.
        System.out.println(staticNum);
    }


    public void testMethod2(){
        //System.out.println(localNum);
        System.out.println(globalNum);
        System.out.println(staticNum);
    }
}
