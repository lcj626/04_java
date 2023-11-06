package main.java.com.ohgiraffers.section03.map.run;

import java.util.*;

public class Application01 {

    public static void main(String[] args){

        /*
        * Map 인터페이스 특징
        * Collection 인터페이스와는 다른 저장 방식을 가진다.
        * 키(key)와 값 (Value)를 하나의 쌍을 ㅗ저장하는 방식을 사용한다.
        *
        * key(키)란?
        * 값(value)를 찾기 위한 이름 역할을 하는 객체를 의미 한다.
        * 1. 요소의 저장 순서를 유지하지 않는다.
        * 2. 키는 중복을 허용하지 않지만, 키가 다르면 중복 되는 값은 저장 가능하다.
        *
        * hashMap, HashTable, TreeMap 등의 대표적인 클래스가 있다.
        * HashMap이 가장 많이 사용되며 Hashtable은 jdk 1.0부터 제공되며
        * HashMap과 동일하게 동작한다. 하위 호환을 위해 남겨 놓았기 때문에 가급적이면 HashMap을 사용하는 것이 좋다
        * */

        /*
        * HashMap
        * jdk 1.2부터 제공되는 클래스로 해시 알고리즘을 사용하여 검색 속도가 매우 빠르다
        *
        * */

        HashMap hmap = new HashMap();// 기본적으로 제네릭스 타입 타입 지시할 수 있음
        //Map hmap2 = new HashMap(); <- 보통 이 방식을 더 많이 씀

        hmap.put("one", new Date());
        hmap.put(12, "red Apple");
        hmap.put(33, 123);

        System.out.println(hmap);

        hmap.put(12, "yellow");
        System.out.println(hmap);

        System.out.println("===============================================================================");

        //hmap.remove(12); // key -> yellow를 지우겠다
        System.out.println(hmap);


        System.out.println(hmap.get(33));
       // hmap.remove(33);
        System.out.println(hmap.get(33));


        Collection<String> values = hmap.values();

        for (Object obj : values) {
            System.out.println(obj);
        }

        Iterator valueIter = values.iterator();

        while(valueIter.hasNext()){
            System.out.println("iter : " + valueIter.next());
        }




    }
}
