package main.java.com.ohgiraffers.section01.list.run;

import main.java.com.ohgiraffers.section01.list.comparator.AscendingPrice;
import main.java.com.ohgiraffers.section01.list.dto.BookDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Application02 {

    public static void main(String[] args){

        List<BookDTO> bookList = new ArrayList<>();//참조 타입 사용자 정의용
        bookList.add(new BookDTO(1,"홍길동전","허균",50000));
        bookList.add(new BookDTO(2,"목민심서","정약용",30000));
        bookList.add(new BookDTO(3,"동의보감","허준",40000));
        bookList.add(new BookDTO(4,"삼국사기","김부식",46000));
        bookList.add(new BookDTO(5,"삼국유사","일연",58000));

        for (BookDTO book: bookList) {
            System.out.println(book);
        }

        //Comparator 구현체를 구현하지 않아서 실행이 안됨>?
        /*
        * Comparator 인터페이스를 상속 받아 정렬의 기준을 정해준 뒤 list의 default 메소드인 sort() 메소드의 인자로
        * 정렬 기준이 되는 인스턴스를 넣어 주게 되면 내부적으로 우리가 오버라이딩 한 메소드가 동작 하게 되며
        * 그것을 정렬 기준으로 삼는다.
        * */
       // Collections.sort(bookList); // 오류 주소값 가지고 정렬할 순 없기 때문에 정렬 기준을 사용자가 정해라

        System.out.println("=======================================================================");
        //Collections.sort(bookList, new AscendingPrice()); ->오류 안 남 (sort ()안에 들어가는건 정렬 방식)
        //프리미티브 타입은 직관적으로 정해져 있다 그러니 비교가 쉽다.
        List<Integer> iList = new ArrayList<>();
        iList.add(1);
        iList.add(2);
        iList.add(3);
        iList.add(4);
        Collections.sort(iList);
        System.out.println(iList);



        System.out.println("====================================================================================");
        //AscendingPrice ac = new AscendingPrice();
        System.out.println();
        bookList.sort(new AscendingPrice());//우리가 구현해 온 AscendingPrice 구현체를 sort를 통해 호출
        for (BookDTO book: bookList) {
            System.out.println(book);
        }

//        bookList.sort(new Comparator<BookDTO>() {
//            @Override
//            public int compare(BookDTO o1, BookDTO o2) {
//                return 0;
//            }
//        });

        System.out.println("---------------------------------가격 내림 차순 정렬 ---------------");
        bookList.sort(new Comparator<BookDTO>() {
            @Override
            public int compare(BookDTO o1, BookDTO o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });
        System.out.println("===========책 제목을 오름 차순으로 정렬===============");
        for (BookDTO bo: bookList) {
            System.out.println(bo);
        }

        System.out.println("============================================================");
        bookList.sort((BookDTO b1, BookDTO b2) -> b2.getTitle().compareTo(b1.getTitle()));
        //원본 배열에 영향을 줌- 람다 표현식 위 new Comparator을 축약한 느낌으로 보면 됨
        for (BookDTO book: bookList) {
            System.out.println(book);
        }




    }
}
