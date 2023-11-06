package main.java.com.ohgiraffers.section06.finalkeyword;

public class FinalFieldTest {

    /*
    * 필기
    * final
    * : final은 종단의 의미를 가지는 키워드이다.
    * final 키워드를 사용할 수 있는 위치는 다양한 편이며 의미가 약간 다르지만, 결국 변경은 불가의 의미이다.
    * 1. 지역 변수 : 초기화 이후 값 변경 불가 final String value = "final";
    * 2. 매개 변수 : 호출시 전달한 인자 변경 불가 method(final String value;)
    * 3. 전역 변수 : 인스턴스 생성 후 초기화 이후에 값 변경 불가
    * 4. 클래스 (static) 변수 : 프로그램 start 이후 값 변경 불가
    * 5. non-static 메소드 : 메소드 재작성(overriding) 불가
    * 6. static 메소드 : 메소드 재작성(overriding) 불가
    * 7. 클래스 : 상속 불가
    *
    * final은 변경 불가의 의미를 가진다.
    * 따라서 초기 인스턴스(생성된 객체)가 생성되고 나면 기본값 0이 필드에 들어가게 되는데,
    * 그 초기화 이후 값을 변경할 수 없기 때문에 선언하면서 바로 초기화를 해 주어야 한다.
    * 그렇지 않으면 compile error가 발생한다.
    * */

    //private final int nonStaticNuml; ->멤버의 필드값들은 생성하면 int 자료형은 기본값=0  에러나는 이유

    private final int NON_STATIC_NUM = 1; //상수필드 = 변하지 않는 고정값 다룰 때

    private final String NON_STATIC_NAME; //기본 생성자 자동 제공 X ->아래 생성자 없으면 오류 난다.

    public FinalFieldTest(String nonStaticName){
        this.NON_STATIC_NAME = nonStaticName;
    }

    //private static final int STATIC_NUM; //static 은 이미 메모리에 올려놓았기 이미 생성이 되었기 때문에 때문에 밑에 생성자를 생성해도 오류가 난다

    private static final int STATIC_NUM = 10; // 결국 처음부터 값을 설정해야 오류가 안남
    /*public FinalFieldTest(int nonStaticNum){
        this.STATIC_NUM = nonStaticNum;
    }*/

    private static final double STATIC_DOUBLE;

    static{
        STATIC_DOUBLE = 10.0;
    }
}
