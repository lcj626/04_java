package main.java.com.ohgiraffers.section01.polymorhism;

public class Application01 {

    public static void main(String[] args){

        /*
        * 다형성
        * 다형성이란 하나의 인스턴스가 여러 가지 타입을 가질 수 있는 것을 의미 한다.
        * 그렇기 때문에 하나의 타입으로 여러 타입의 인스턴스를 처리할 수 있기도 하고
        * 하나의 메소드 호출로 객체 별로 각기 다른 방법으로 동작하게 할 수 있다.
        *
        * 다형성은 객체지향 프로그래밍 3대 특징 (캡슐화, 상속, 다형성) 중 하나이며,
        * 객체지향 프로그래밍의 꽃이라고 불리울 정도로 활용성이 높고 장점이 많다.
        * 하지만 학습하기 어렵다는 단점을 가지고 있다.
        *
        * #캡슐화 - 외부에서 나를 모르고, 나한테 엑세스 할 수 없어 내가 제공해주는 엑세스로만 접근 할 수있게 하는것
        *
        *
        * 다형성의 장점
        * 1. 여러 타입의 객체를 하나의 타입으로 관리할 수 있기 때문에 유지 보수성과 생산성이 증가 된다.
        * 2. 상속을 기반으로 한 기술이기 때문에 상속관계에 있는 모든 객체는 동일한 메세지를 수신할 수 있다.
        *    이러한 동일한 메세지를 수신 받아 처리하는 내용을 객체별로 다르게 할 수 있다는 장점을 가지고 있다.
        *    (다양한 기능을 사용 하는데 있어서 관리 해야 할 메세지 종류가 줄어 들게 된다.)
        *    하나의 호출로 여러 가지 동작을 수행할 수 있다는 측면에서는 오버로딩을 다형성으로 보기도 한다.
        *    다형성을 이해 하기 쉬운 가장 좋은 예 이기도 하다.
        *    하지만 이 부분은 이견이 많이 존재 하기 때문에 다형성을 이해 하는데 참고로만 사용 한다.
        * 3. 확장성이 좋은 코드를 작성할 수 있다.
        * 4. 결합도를 낮춰서 유지 보수성을 증가 시킬 수 있다.
        * */

        System.out.println("Animal 생성----------------");
        Animal animal = new Animal();
        animal.eat();
        animal.cry();
        animal.run();

        System.out.println();
        System.out.println("Rabbit 인스턴스 생성 -------");
        Rabbit rabbit = new Rabbit();
        rabbit.eat();
        rabbit.cry();
        rabbit.run();

        System.out.println();
        System.out.println("Tiger 인스턴스 생성 ---------");
        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.cry();
        tiger.run();

        Animal animal1 = new Rabbit(); // 그릇 Animal에 토끼 넣음 그걸 animal1
        Animal animal2 = new Tiger(); // Tiger를 Animal 이라는 그릇에 넣는다.

        //Rabbit r1 = new Animal(); <- 오류 부모가 독립한 자식 집에 마음대로 못오는 느낌
        //Rabbit r1 = (Rabbit) new Animal(); // Animal 형이 Rabbit으로 바뀌어서 jump도 가져올 수 있게 된다

        System.out.println("===============================================================");
        //런타임 단계
        System.out.println("동적 바인딩");
        System.out.println(animal1.getClass());
        animal1.cry();//클래스는 Animal이지만 컴파일 할땐 Animal이지만 실행시키면 Rabbit으로 됨. 실행 시 기능을 사용 실행 시 가져옴
        animal2.cry();

        //animal1.jump();//<-오류 우리가 실행 시킬 때 자바 클래스에서 발생하는 오류
        System.out.println("==================클래스 타입의 형변환 확인===========================");
        ((Rabbit)animal1).jump();//컴파일 단계-> 인스턴스 형식을 Animal에서 Rabbit으로 바꿔 주겠다(우선 순위 위해 Rabbit에 괄호 설정)
        // 형변환(동적 바인딩X)
        //컴파일 = 자바 언어를 컴퓨터가 읽을 수 있게 바꿔주는 단계
        ((Tiger) animal2).bite();

        System.out.println("=========================================================");
        System.out.println("형변환 오류");
//        ((Tiger)animal1).bite();
//        ((Rabbit) animal2).jump();//Rabbit 과 Tiger 바꿔도 생성시 오류 안남 컴파일은 속임. but 실행 런타임 시 오류 발견함

        System.out.println("=============instanceof 확인 =============");
        System.out.println("animal1 이 Tiger와 같은 지 확인 : " + (animal1 instanceof Tiger));
        System.out.println("animal1 이 Rabbit과 같은 지 확인 : " + (animal1 instanceof Rabbit));
        System.out.println("animal1 이 Animal과 같인 지 확인 : " + (animal1 instanceof Animal));

        System.out.println("animal이 Rabbit과 같은가 : " + (animal instanceof Rabbit));
        System.out.println("animal이 Tiger와 같은가 : " + (animal instanceof Tiger));//둘 다 false 자료형 크기가 다르다 Rabbit Tiger는 상속은 받았지만 Animal은 아니다

        /*
        * 클래스 형변환은 up-casting 과 down-casting으로 구분할 수 있다.
        * up-casting : 상위 타입으로 형 변환
        * down-casting : 하위 타입으로 형 변환
        * 또한 작성 여부에 따라 명시적과 묵시적 두 가지로 구분 된다.
        *
        * */

        Animal animal3 = (Animal) new Rabbit(); // up-casting 명시적 형변환 Animal이 Rabbit 포함 up casting
        Animal animal4 = new Rabbit(); //묵시적 형변환
        Rabbit rabbit1 = (Rabbit) new Animal();//down-casting 명시적 형변환 위에서 아래로 내려가는 경우
        //Rabbit rabbit2 = new Animal();//묵시적 형변환 but 에러

    }
}
