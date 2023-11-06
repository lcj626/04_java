package main.java.com.ohgiraffers.section01.object.run;

import main.java.com.ohgiraffers.section01.object.book.Book;

public class Application01 extends Book {

    public static void main(String[] args){

        /*
        * equals() 메소드 오버라이딩
        * equals() 메소드는 매개변수로 전달 받은 인스턴스와 == 연산하여 true or false 를 반환한다.
        * 즉 동일한 인스턴스 인지를 비교하는 기능을 한다.
        *
        * 동일 객체와 동등객체
        * 동일객체 : 주소가 동일한 인스턴스를 동일 객체라고 한다.
        * 동등객체 : 주소는 다르더라도 필드 값이 동일한 객체를
        * */

        Book book = new Book(1, "홍길동전", "허균",5000);
        Book book1 = new Book(2, "목민심서", "정약용",5000);
        Book book2 = new Book(2, "목민심서", "정약용",5000);
        Book book3 = book;
        Application01 app = new Application01();


        System.out.println("동일객체 비교하기 " + (book =  book3));
        System.out.println("동일 객체 비교하기  " + (book1 ==  book2));
        System.out.println("다를 객체 비교하기 " + (book1 ==  book3));
    }
}
