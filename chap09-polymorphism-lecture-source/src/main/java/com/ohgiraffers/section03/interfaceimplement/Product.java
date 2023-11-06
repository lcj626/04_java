package main.java.com.ohgiraffers.section03.interfaceimplement;

import java.io.Serializable;

public class Product extends Object implements InterProduct {
    //인터페이스 : 추상 메서드 묶음 implements->인터페이스 상속 받는 키워드
    //추상 메소드라 무조건 구현 의무
    //프로덕트 자식들이 전부 동일한 속성을 가지지 않는다 그래서 공통되서 쓰는 메서드 정의 해놓고 별도로 상속시킨다.

    /*
    *클래스에서 인터페이스를 상속 받을 때에는 implements 키워드를 사용 한다.
    * 또한 인터페이스는 여러 개르 상속 받을 수 있으며,
    * extends로 다른 클래스를 상속 받는 경우에도 그것과 별개로 인터페이스도 추가 상속이 가능 해진다.
    * 단, extends 키워드를 앞에 작성하고 implements를 뒤에 작성 한다ㅣ.(순번 변경 시 에러)
    * */

    /*
    * 인터페이스에 추상 메서드는 구현 책임의 원칙으로 인하여 전부 구현해야 한다.
    * 단, default 메서드의 재정의는 선택이며 static은 재정의가 불가능하다.
    * */
    @Override
    public void nonStaticMethod(){
        System.out.println("interproduct의 nonstaticMethod 오버라이딩 메소드 호출");
    }

    @Override
    public void abstMethod(){
        System.out.println("interproduct의 abstNethod 오버라이딩 메소드 호출");
    }

//    @Override static 메서드의 경우 재정의 불가능
//    public void staticMethod(){}

    @Override
    public void defaultMethod(){
        System.out.println("default Method의 오버라이딩 호출");
    }

}
