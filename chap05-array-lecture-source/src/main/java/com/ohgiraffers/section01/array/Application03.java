package main.java.com.ohgiraffers.section01.array;

public class Application03 {

    public static void main(String[] args){


        /*
        * 값의 형태 별 기보값
        * 정수 : 0
        * 실수 : 0.0
        * 논리 : false
        * 문자 : \u0000
        * 참조 : null
        * */

        // new ->>> heap 주소를 할당 -> 기본값으로 초기화
        int[] iarr = new int[5];

        System.out.println(iarr[0]);
        System.out.println(iarr[1]);
        System.out.println(iarr[2]);
        System.out.println(iarr[3]);
        System.out.println(iarr[4]);


        System.out.println("===============================");
        for (int i =0; i<iarr.length; i++){
            System.out.println("i array [" + i + "] = " + iarr[1]);
        }

        //int[] iarr2 = new int[5];
        //위 내용과 동일하다
        int[] iarr2 = {10,20,30,40,50};

        //String[] array = {"안녕", "hi", "니하오"}
    }
}
