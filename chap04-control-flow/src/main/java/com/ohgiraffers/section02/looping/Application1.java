package main.java.com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args){

        A_for a = new A_for();

        Scanner scanner = new Scanner(System.in);
        System.out.println("단을 입력해 주세요");
        int num1 = scanner.nextInt();
        //a.gugudan(num);

        B_while b = new B_while();
        //b.testSimpleWhileStatement();
        b.gugudan2(num1);


    }
}
