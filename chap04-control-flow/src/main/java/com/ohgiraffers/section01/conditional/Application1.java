package main.java.com.ohgiraffers.section01.conditional;

public class Application1 {

    public static void main(String[] args){


       /* A_if app1 = new A_if();
       app1.testSimpleIfStatement();


        B_ifElseIf aif2 = new B_ifElseIf();
        aif2.testNestedIfElseIfStatement();*/

        D_switch d = new D_switch();
        //d.testSimpleSwitchStatement();

        String result = d.testSwitchVendingMachine();
        System.out.println(result);
    }
}
