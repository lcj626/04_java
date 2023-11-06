package main.java.com.ohgiraffers.section03.uses;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application02 {

    public static void main(String[] args){

        /*
        * try-with-resource
        * jdk1.7에서 추가 된 문법으로
        * close 해야 하는 인스턴스의 경우 try 옆에 괄호 안에서 생성하면
        * 해당 try-catch 블럭이 완료될 때 자동으로 close를 처리 해준다.
        * */

        //BufferedReader - 참조 객체
        try(BufferedReader in = new BufferedReader(new FileReader("test...dat"))){//finally블록에 클로즈 하면 난잡해지니 try에서 자동으로 처리하는 문법
            String s;
            while((s = in.readLine()) !=null){
                System.out.println(s);
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
