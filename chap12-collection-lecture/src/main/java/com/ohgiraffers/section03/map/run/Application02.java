package main.java.com.ohgiraffers.section03.map.run;

import java.io.*;
import java.util.EmptyStackException;
import java.util.Properties;
import java.util.Stack;

public class Application02 {

    public static void main(String[] args) {

        /*
        * Properties란
        * hashMap을 구현하여 사용 용법이 거의 유사하지만 key 와 value 모두 문자열만 사용할 수 있는 자료구조이다.
        * 설정 파일의 값을 읽어서 어플리케이션에 적용할 때 사용 한다.
        * */

        Properties prop = new Properties();

        prop.setProperty("driver", "oracle.jdbc...driver.OracleDriver");
        prop.setProperty("url", "localhost");
        prop.setProperty("user", "user");
        prop.setProperty("pass", "pass");

        System.out.println(prop);

       /* try{ // 예외가 발생될 수 있는 코드를 묶는다.
            //ex)엄마가 고기를 사오라고 했다
        }catch (*//*엄마 카드에 돈이 없는 경우*//*){  //catch -대상 예외에 해당되면 아래의 코드 블럭에서 처리한다.
            //내 카드로 결제 ->내가 예외 처리
        }catch(*//*편의점을 못 찾는 경우*//*){
            //인터넷으로 주문
        }catch(*//* 엄마 카드와 내 카드 모두 돈이 없는 경우*//*){
            //계산취소 =null
        }*/

        try{
            prop.store(new FileOutputStream("driver.dat"), "jdbcDriver");//store => 존재하는지 보는것 -> 오류 안나면 존재함
            prop.store(new FileWriter("driver.txt"), "jdbc driver");
            prop.storeToXML(new FileOutputStream("driver.xml"), "jdbc driver");
            System.out.println("아무거나");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

//        Stack<Integer> integerStack = new Stack<>();
//
//        try{
//            integerStack.push(1);
//            integerStack.pop();
//            integerStack.pop();
//            integerStack.pop();
//
//        }catch (EmptyStackException e){
//            e.printStackTrace();
//            System.out.println("testtest");
//
//        }
//        System.out.println("testtestset");


        System.out.println("========================================================================");

        Properties pror2 = new Properties();

        try {
            pror2.load(new FileInputStream("driver.dat"));
            pror2.load(new FileReader("driver.txt"));
            pror2.loadFromXML(new FileInputStream("driver.xml"));


            pror2.list(System.out);
            System.out.println(pror2.getProperty("driver"));
            System.out.println(pror2.getProperty("url"));
            System.out.println(pror2.getProperty("user"));
            System.out.println(pror2.getProperty("password"));

        } catch (IOException e) {// 모든 예외가 Exception 후손이기 때문에 그냥 Exception 이라고만 해도 된다. but 상세한 오류 알기가 어렵기 때문에 각각에 맞는 방식으로 함
            throw new RuntimeException(e);
        }


    }

}
