package main.java.com.ohgiraffers.section01.list.run;

import java.util.*;

public class Application01 {

    public static void main(String[] args){

        /*
        * 컬렉션 프레임워크(Collection Framework)
        * 자바에서 컬렉션 프레임워크는 여러 개의 다양한 데이터들을 쉽고 효과적으로 처리할 수 있도록
        * 표준화 된 방법을 제공하는 클래스들의 집합을 의미
        * 즉, 데이터는 효율적으로 저장하는 자료구조와 데이터를 처리하는 알고리즘을 미리 구현해 놓은 클래스를 말한다.
        *
        * Collection Framwork 는 크게 3가지 인터페이스 중 한 가지를 상속 받아 구현해 놓았다.
        * 1. list 인터페이스
        * 2. set 인터페이스
        * 3. map 인터페이스
        *
        * list 인터페이스와 set 인터페이스의 공통 부분을 collection 인터페이스에서 정의하고 있다.
        * 하지만 Map은 구조상 차이로 Collection 인터페이스에서 정의하고 있지 않다.
        *
        * 각 인터페이스 별 특징
        * 1. list 인터페이스
        *   - 순서 있는 데이터의 집합으로 데이터의 중복 저장을 허용 한다.
        *   - Vector, ArrayList, LinkedList, Stack, Queue 등이 있다.
        *
        * 2. set 인터페이스
        *   - 순서가 없는 데이터의 집합으로 데이터의 중복을 허용 하지 않는다.
        *   - hashMap, TreeSet 등이 있따.
        *
        * 3. Map 인터페이스
        *   - 키와 값 한 쌍으로 이루어지는 데이터의 집합이다.
        *   - key를 set 방식으로 관리하기 때문에 데이터의 순서를 관리하지 않고 중복된 key를 허용 하지 안흔ㄴ다.
        *   - value는 중복된 값을 저장 할 수 있다.
        *   - hashMap, TreeMap, Hashtable, Properties 등이 있다.
        *
        * */

        /*
        * list 인터페이스를 구현한 모든 클래스는 요소의 저장 순서가 유지 되며, 중복 저장을 허용한다.
        * ArrayList, LinkedList, Vector, Stack 이 있다.
        *
        * ArrayList
        * 가장 많이 사용되는 컬렉션 클래스이다.
        * jdk1.2부터 제공되고 있다.
        * 내부적으로 배열을 이용하여 요소를 관리하며 인덱스를 이용해 배열 요소에 빠르게 접근할 수 있다
        *
        * ArrayList는 배열의 단점을 보완하기 위해 만들어 졌다.
        * 배열은 크기를 변경할 수 없고, 요소 추가, 삭제, 정렬 등이 복잡하다는 단점을 가지고 있다.
        * ArrayList는 저러한 배열의 단점을 보완 하고자
        * 크기 변경(새로운 더 큰 배열을 만들고 옮기기), 요소의 추가, 삭제, 정렬 기능들을 미리 메소드로 구현하여 제공한다.
        * 자동적으로 수행 되는 것이지 속도가 빨라지는 것은 아니다.
        * */

        ArrayList arrayList = new ArrayList();
        Collection clist = new ArrayList();
        arrayList.add("apple"); // 사이즈 정하지 않고 요소를 추가 하는 형식 값을 동적으로 선언
        arrayList.add(1);
        arrayList.add(1.2);
        arrayList.add(new Date());

        System.out.println("arrayList " + arrayList);
        System.out.println(arrayList.size());

        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));

        }

        System.out.println("==========================================");
        arrayList.add(1,"banana");//1번째 요소에다 banana 라는 값을 추가 한 것

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));

        }

        System.out.println("=========================================");
        arrayList.remove(2);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));

        }// 두번째 꺼 ("1") 이 사라짐

        System.out.println("=========================================================");

        arrayList.set(1, "mango");
        System.out.println(arrayList); // banana가 망고ㅗ 바뀜

        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("mango");
        stringList.add("orange");
        stringList.add("grape");
        //stringList.add(1234);<-String이라 숫자 넣으면 오류
        //stringList.add(String.valueOf(1234)); -> 문자열로 바꿔 줌

        System.out.println("===================================================================");

        System.out.println();
        System.out.println(stringList);
        Collections.sort(stringList);
        System.out.println(stringList);


        System.out.println("==============================================================");
        stringList = new LinkedList<>(stringList);
        Collections.sort(stringList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.charAt(0) < o2.charAt(0)){
                    return +1;
                }else{
                    return -1;
                }
            }
        });
        System.out.println(stringList);

        System.out.println("==============================================================================");

        Collections.sort(stringList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.charAt(0) < o2.charAt(0)){
                    return -1;
                }else{
                    return +1;
                }
            }
        });
        System.out.println(stringList);


        System.out.println("=================================================================================");
        /*
        * Iterator란
        * Collection 인터페이스의 iterator() 메소드를 이용하여 인스턴스를 생성할 수 있다.
        * 컬렉션에서 값을 읽어오는 방식을 통일된 방식으로 제공하기 위해 사용 한다.
        * 반복자라고 불리우며, 반복문을 이용하여 목록을 하나씩 꺼내는 방식으로 사용하기 때문이다.
        * 인덱스로 관리되는 컬렉션이 아닌 경우에는 반복문을 사용해서 요소에 하나씩 접근할 수 없기 때문에
        * 인덱스를 사용하지 않고도 반복문을 사용하기 위한 목록을 만들어 주는 역할이라고 보면 된다.
        * hasNext() : 다음 요소를 가지고 있는 경우 true, 더 이상 요소가 없는 경우 false
        * next() : 다음 요소를 반환
        * */
        Iterator<String> dIter = ((LinkedList<String>) stringList).descendingIterator();
       /* while ((dIter.hasNext())){
            System.out.println(dIter.next());
        }
        while ((dIter.hasNext())){
            System.out.println(dIter.next());
        }*///한번 밖에 출력이 안됨 요소를 하나 출력하면 소멸 1회성으로 씀 다음 요소를 가지고 있는지 판별에서 요소가 소멸해 버렸기 때문에 hasNext 성립 안 됨

        List<String> descList = new ArrayList<>();
        while (dIter.hasNext()){
            descList.add(dIter.next());
        }
        System.out.println(dIter.hashCode());
        System.out.println(descList);



    }
}
