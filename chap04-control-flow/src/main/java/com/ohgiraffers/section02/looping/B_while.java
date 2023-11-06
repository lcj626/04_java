package main.java.com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class B_while {

    public void testSimpleWhileStatement(){

        /*
        * [while 표현식]
        * while(조건식){
        *
        * }
        * */

        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine(); // 문자열을 배열로서 취급  "1234567890".charAt(0)=1 charAt(3)=4

        int i = 0;
        while (i<=value.length() ){
            i++;
           if(i%2 == 0){
                continue;
            } else if (i == 11){
                break;
            }
            System.out.println(i);
        }

        boolean isTrue = false;

        /*
        * do while [표현식]
        * do{
        *
        * }while(조건식);
        * */
        do {
            System.out.println("메뚜기 월드 게임");
            System.out.println("시작을 원하면 true, 시작을 원하지 않으면 false를 입력해 주세요");
            isTrue = scanner.nextBoolean();

        } while (isTrue);

    }
    public void gugudan2(int num1){

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("단을 입력해 주세요");
        int num1 = scanner.nextInt();*/
        int i =0;
        do {
            i++;
            System.out.println(num1 + " * " + i + "=" + i*num1);
            if(num1<6){
                continue;
            }else if(num1==6){
                break;
            }

        }while(i<=8);

    }

}
