package main.java.com.ohgiraffers.section01.object.book;

import java.util.Objects;

public class Book {


    private int number;
    private String title;
    private String author;
    private int price;

    public Book(){

    }

    public Book(int number, String title, String author, int price) {
        this.number = number;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "number=" + number +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object obj) {//같은지 안같은지 확인하는 메소드
        //인스턴스 - 클래스를 통해서 생성된 객체
        //Book 클래스는 하나의 자료형이다.
        //그렇기 때문에 여기서 이야기를 하는 this는 Book 클래스를 통해 생성된 인스턴스를 의미 한다.
        // 인스턴스의 this는 heap에 할당된 주소 공간을 즉 인스턴스 자기 자신을 반환 한다.

        if(this == obj){//this -> 이 공간에 할당된 주소값 (붕어빵 틀 안의 붕어빵) this 주소값과 매개변수로 전달 받은 obj 주소값이 같은지 비교
            return true;
        }//this -> 생성된 인스턴스를 가리키는 녀석

        //obj가 null이라고 하는 것은 heap 생성되지 않았다는 것을 의미 한다.
        //혹은 생성이 되어도 null로 초기화 되어 더 이상 참조 하지 않는 상태이다.
        if(obj == null){
            return false;
        }
        //전달 받은 obj를 book으로 형변환 한다.
        Book other = (Book) obj;

        if(this.number != other.number){//Book클래스에서 사용된 인스턴스  other- 매개변수 obj에서 넘겨 받았을때
            return false;
        }

        if (this.title == null){
            if(other.title != null){
                return false;
            }
        }else if(!this.title.equals(other.title)){
            return false;
        }

        if(this.price != other.price){
            return false;
        }
        return true;//결론 주소가 달라고 값이 같으면 같다고 보는 것
    }

    @Override
    public int hashCode() {

        int result = 1;
        final int PRIME = 31;
        result = PRIME * result + this.number;

        result = PRIME * result + this.title.hashCode();
        result = PRIME * result + this.author.hashCode();//String 툴에 정의 되어 있는 거라 인스턴스가 달라도 값이 같음
        result = PRIME * result + this.price;

        return result;

    }


}
