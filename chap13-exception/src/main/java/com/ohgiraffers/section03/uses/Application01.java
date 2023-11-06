package main.java.com.ohgiraffers.section03.uses;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application01 {

    public static void main(String[] args){

        BufferedReader in = null;

        try {
            in = new BufferedReader(new FileReader("test.dat"));//test.dat이란 파일을 FileReader로 불러와  BufferedReader 에 담음
            String s;

            while ((s = in.readLine()) !=null){
                System.out.println(s);
            }
        } catch (FileNotFoundException e) { // 파일을 찾을 수 없을 때
            e.printStackTrace();
        } catch (IOException e) {//파일 읽지 못할 때
            e.printStackTrace();
        }finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                e.printStackTrace();

            }
        }
    }
}
