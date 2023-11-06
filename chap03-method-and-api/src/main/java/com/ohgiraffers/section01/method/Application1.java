package main.java.com.ohgiraffers.section01.method;

public class Application1 {

    public static void main(String[] args){
        //위 문장이 메인 메서드
        //static - 프로그램 실행 시킬 때 미리 적재 시키는 것

        /*
        *  메소드란?
        * 메소드(method)는 어떤 특정 작업을 수행하기 위한 명령문의 집합이라고 할 수 있다.
        * */

        System.out.println("main()메서드 시작됨....");

        //새로운 함수를 만든다
        Application1 app1 = new Application1();//클래스 생성 - methodB와 C 다 동시에 쓸 수 있음. 메모리에서 존재 하는 상태
        app1.methodA();

        //Ex)
        /*Applicaton1 app1;
        app1= new Application1();
        app1.num = 10;
        System.out.println(app1.num);
        System.out.println("hashCode : " + app1.hashCode());

        Application1 app2 = new Application1();
        System.out.println(app2.num);
        System.out.println("hashCode : " + app2.hashCode());*/

        //Application app1=  : 변수 이름 메모리 주소 공간을 확보
        //app1= new Application : app1이 가진 주소에다 Application이 가진 속성을 할당함(생성됨)
        //app2 를 만들면 그건 app1과 다른 주소 공간이라 동일한 것을 참조해도 값이 다르게 나옴
        //if class에서 public int num = 0; 으로 설정시 (app1.num)은 10이고 (app2.num)은 0이 나올 것.

    }


    public void methodA(){
        //public = 접근 제어자 , void = '반환할 게 없다', ..methodA = 함수 이름

        System.out.println("methodA() 호출......");

        methodB();

        System.out.println("methodA() 종료...");
    }
    //메서드를 정의 한다. 정의만 하고 아직 영역에 자리잡지 못 함. 메모리에 아직 안 올림

    public void methodB(){

        System.out.println("methodB() 호출......");

        methodC();

        System.out.println("methodB() 종료.......");
    }

    public void methodC(){

        System.out.println("methodC 호출");
        System.out.println("methodC 종료");

    }


}
