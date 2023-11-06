package main.java.com.ohgiraffers.section01.list.run;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Application05 {

    public static void main(String[] args){

        /*
        * Queue
        * queue는 선형 메모리 공간에 데이터를 저장하는 방식
        * 선입 선출(FiFO - First input First out)
        * Queue 인터페이스를 상속 받는  하위 인터페이스들은
        * Deque, BlockingQueue, BlockingDeque, TransferQueue 등 다양하지만
        * 대부분의 큐는 LinkedList 를 이용 한다.
        * */

        //queue 자체는 이넡페이스 이기 때문에 인스턴스 생성 불가능
        //Queue<String> que = new Queue<>();

        Queue<String> que = new LinkedList<>();
        que.offer("first");
        que.offer("second");
        que.offer("third");
        que.offer("fourth");
        que.offer("fifth");

        System.out.println(que);


        /*
        * peek() : 가장 처음에 들어온 요소를 반환 한다.
        * poll() : 가장 처음에 들어온 요소를 반환 후 제거 한다.
        * */
        System.out.println("peek() : " + que.peek());

        System.out.println("poll() : " + que.poll());

        System.out.println(que);




    }
}
