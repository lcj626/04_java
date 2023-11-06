package main.java.com.ohgiraffers.section01.exception;

public class ExceptionText {

    public void checkEnoughMoney(int price, int money) throws Exception{ //throw는 예외 발생을 알려주는 거지 catch 한 것은 아니다
        System.out.println("가지고 있는 돈은 " + money + "원 입니다.");

//        try {
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }

        if(money >= price){
            System.out.println("상품을 구입하기 위한 금액이 충분합니다.");
        }else{
            throw new Exception(); //위에 메소드에 throw Exception 추가 or try-catch 문 - 나를 호출한 쪽에서 처리 시킬 건지 내가 처리를 할 건지
        }
        System.out.println("즐쇼~");
    }

}
