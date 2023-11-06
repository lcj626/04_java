package main.java.com.ohgiraffers.section02;

public class SubClass extends SuperClass{

    // 메소드 이름을 변경 하면 에러가 발생 된다.
    // 아래의 경우 오버라이드가 아닌 다른 함수로 취급
    /*@Override
    public void method1(int num) {
        super.method(num);
    }*/

    //메소드 리턴타입 변경되면 에러
    /*@Override
    public void method(int num) {
        return num;
    }*/

    //3. 메서드의 시그니쳐가 달라도 오류가 발생
    // 아래의 경우 오버로딩
//    @Override
//    public void method(int num, int num2) {
//        super.method(num);
//    }

    /*@Override
    public void method1(int num) {
        System.out.println("dafkjfa;dj");
    }*/

    //4. ㅔ걒ㅁㅅㄷ 접근 제한자는 자신만 접근할 수 있기 때문에 오류
    //5. final 메소드의 경우
    /*@Override
    public final void finalMethod(){

    }*/





    @Override
    public void method(int num) {
        super.method(num);
    }


    //7. 부모 메소드의 접근제한자와 같거나 더 넓은 범위로 오버라이딩이 가능
    //더 좁은 범위는 불가능
    // 같은 범위는 가능
    /*@Override
    void protectedMethod() {
        super.protectedMethod();
    }*/

    @Override
    public void protectedMethod(){}

    /*@Override
    protected void protectedMethod() {
        super.protectedMethod();
    }*/
}
