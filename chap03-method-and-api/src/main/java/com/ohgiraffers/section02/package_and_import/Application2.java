package main.java.com.ohgiraffers.section02.package_and_import;

import main.java.com.ohgiraffers.section01.method.Caculator;
import static main.java.com.ohgiraffers.section01.method.Caculator.maxNumberOf;

public class Application2 {

    public static void main(String[] args){

        /* 임포트란?
        *   서로 다른 패키지에서 존재하는 클래스를 사용하는 경우 패키지명을 포함한 풀 클래스 이름을 사용해야 한다.
        *   하지만 매번 다른 클래스의 패키지명까지 기술하기에는 번거롭다.
        *   그래서 패키지명을 생략하고 사용할 수 있도록 한 구문이 import 구분이다
        *   import는 package 선언문과 class 선언문 사이에 작성하며
        *   어떠한 패키지 내에 있는 클래스를 사용할 것인지에 대해 미리 선언하는 효과를 가진다.
        * */

        Caculator cal = new Caculator();
        int min = cal.minNumberOf(1,2);
        System.out.println(min);

        int max = maxNumberOf(1,2);
        System.out.println(max);
        //import static main.java.com.ohgiraffers.section01.method.Caculator.maxNumberOf; 추가시키면 maxNumber 관련해선 Caculator 안 쳐도 됨
    }
}
