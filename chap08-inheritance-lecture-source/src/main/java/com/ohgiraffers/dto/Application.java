package main.java.com.ohgiraffers.dto;

public class Application {

    public static void main(String[] args){

        UseService useService = new UseService();

        String userId = "testId";
        String pwd = "1234";
        String name = "길동";

        useService.userMethod(name, userId, pwd);

        System.out.println("==========================================");
        TestDTO test = new TestDTO();
        useService.userDTOtest(test);
    }
}
