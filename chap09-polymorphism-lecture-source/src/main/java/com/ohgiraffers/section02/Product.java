package main.java.com.ohgiraffers.section02;

public abstract class Product {


    public Product(){

    }

    public void nonStaticMethod(){
        System.out.println("Product 클래스의 NonStaticMethod를 호출함");
    }
    public static void staticMethod(){
        System.out.println("Product 클래스의 Static Method");
    }

    public abstract void abstractMethod();// abstract는 함수 몸체 부분{} 구현 X ->나중에 상속받는 애들이 구현
    // 자식들이 무조건 만들어야 함. 만약 부모가 몸체를 만들면 자식 소스에서 까먹을 수 있지만 몸체만 만들면 자식이 필수적으로 만들어야 하기 때문에 까먹지 못함
    // 재정의를 안하면 작동 자체를 안하게 함 강제적 상속(자식들이 자체적 구현)
    // ex) 식품(부모) 에는 다양한 종류가 있고 각각의 다른 유통기한이 있기에 부모에선 유통기한 몸체만 만들고 자식들이 알아서 유통기한 설정한다.
}
