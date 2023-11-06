package main.java.com.ohgiraffers.section04.constructor;

public class Application01 {


    public static void main(String[] args){

        /*
        * 생성자란?
        * 인스턴스를 생성할 때 초기 수행할 명령이 있는 경우 미리 작성해 두고, 인스턴스를 생성할 때 호출된다.
        * 생성자 함수에 매개변수가 없는 생성자를 기본 생성자(default constructor)라고 하며,
        * 기본 생성자는 compiler에 의해 자동으로 추가되기 때문에 지금까지 명시적으로 작성하지 않고 사용하였다.
        * (인스턴스 생성 시 별도로 수행할 명령이 없었기 때문에 아무 것도 작성하지 않은 것이다.)
        * */


        //원시 자료형===기본 자료형===프리미티브 타입
        //ex) int a ->변수를 선언한다. ->jvm 영역에서 stack 영역이라고 인식
        //변수==주소==값 - 키보드에서 a를 눌렀을때 a가 나옴
        //int a; -> 변수를 선언한다
        //a =10; ->a를 10으로 초기화 한다.



        User user;//<-변수를 선언한다 heap 영역에 생성
        //User= 참조 자료형 === 레퍼런스 타입 ==== 사용자 정의
        // 변수(주소값)->주소값 말하기 어려우니 변수
        //변수==주소==속성 -> 키보드
        //jvm이 heap 영역이라고 인식(heap 내에서 변수가 생김)
        //stack 과 heap의 차이 = stack은 정적 heap은 동적(메모리 용량이 동적으로 줄었다 늘었다 할 수 있음 stack은 실행 시점에 정해짐 - ex) int num or 배열 중간에 변하지 못함)
        //System.out.println(user.hashCode()); <- 이 시점에 주소값 X

        user = new User();//<-주소값 가지는 순간 // 변수를 초기화(생성) 한다.
        //System.out.println(user.hashCode());

//User user1 = new User

        System.out.println();



    }
}
