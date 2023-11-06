package main.java.com.ohgiraffers.section06.singleton;

public class EagerSingleton {


    private static EagerSingleton eager = new EagerSingleton(); //자기 자신 호출 자기 자신에게 할당
    //이른 초기화 프로그램 실행할 때 자기 자신을 초기화 ->이른 초기화
    //싱긑톤 - 하나의 인스턴스를 만들어 놓을 때
    private EagerSingleton(){ //초기화 해놓고 시작
        System.out.println(" eager 실행 됨");

    }

    public static EagerSingleton getInstance(){ //


        return eager;
    }
}
