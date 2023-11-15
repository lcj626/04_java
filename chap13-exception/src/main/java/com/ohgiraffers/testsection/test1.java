package main.java.com.ohgiraffers.testsection;

import java.util.Scanner;

public class test1 {

    public static void main(String[] args){

        /*문제: 사용자로부터 두 개의 정수를 입력 받아 나눗셈을 수행하고, 예외 처리를 통해 오류를 처리 하는 프로그램을 작성 하세요.

        문제 설명:
        사용자로부터 두 개의 정수를 입력 받아 나눗셈을 수행 하는 프로그램을 작성 해야 합니다.
        그러나 사용자가 0으로 나누 려고 시도하거나 유효 하지 않은 입력을 제공 하는 경우, 이러한 상황에 대한 예외 처리를 수행 해야 합니다.

        요구사항:

        -사용자로부터 정수 A와 B를 입력받습니다.
        -A를 B로 나누고 결과를 출력합니다.
        -만약 B가 0이거나 유효하지 않은 입력이라면, 예외 처리를 통해 적절한 오류 메시지를 출력합니다.
        -예외 처리는 try-catch 블록을 사용하여 수행합니다.
        -사용자가 유효하지 않은 입력을 제공한 경우, InputMismatchException을 잡아서 처리합니다.
        -사용자가 0으로 나누려고 시도한 경우, ArithmeticException을 잡아서 처리합니다.
        -프로그램은 정상적으로 종료되어야 합니다.


        예시 실행:

        Copy code

        두 개의 정수를 입력하세요:
        10
        0
        나눗셈 결과: 유효하지 않은 입력입니다.

        두 개의 정수를 입력하세요:
        12
        4
        나눗셈 결과: 3


        이 문제는 사용자 입력, 예외 처리, 예외 클래스의 활용에 대한 기본적인 이해를 확인하기 위한 예제입니다. 정수를 나누는 동안 발생할 수 있는 예외 상황을 처리하고 적절한 메시지를 출력하는 방법을 학습할 수 있습니다.*/

        Scanner scanner = new Scanner(System.in);

        ExceptionText et = new ExceptionText();

        try{
            System.out.println("숫자 두 개를 입력해 주세요");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            int result = num1/num2;
            System.out.println("나눗셈 결과 : " + result);

        }catch (ArithmeticException e){
            e.printStackTrace();
        }




    }
}
