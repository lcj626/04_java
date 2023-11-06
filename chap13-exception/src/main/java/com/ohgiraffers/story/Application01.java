package main.java.com.ohgiraffers.story;

public class Application01 {

    public static void main(String[] args){

        /*
        * 개발 관련 목표가 없던 지올팍
        * 그는 강사에게 과제를 받았다.
        * 과제는 job에 대한 조사를 하는 것이다.
        * 생각보다 직업이 많아서 고민을 하던 지올팍
        * 배열을 가지고 직업 리스트를 만들기로 하였다.
        * */
        //처음 개발 관련 직군이 몇 개가 있는지 모르는 지올팍
        //ArrayList를 사용하는 것이 아직은 익숙하지 않아
        //상대적으로 접근하기 쉬운 배열로 관리하기로 하였다.

        //Jobs[] joblist = new Jobs[5];

        Jobs[] joblist = new Jobs[7];

        try{//발생 될 수 있는 예외를 묶어줌, 예외가 발생하기 전까지 동작이 됨

            joblist[0] = new Jobs(1,"백엔드");
            joblist[1] = new Jobs(2,"프론트 엔드");
            joblist[2] = new Jobs(3,"데브옵스");
            joblist[3] = new Jobs(4,"DBA");
            joblist[4] = new Jobs(5,"PM");
            //ArrayIndexOutOfBoundsException 가 발생됨에 따라서 프로그램이 동작을 멈춤
            joblist[5] = new Jobs(6,"PL");
            joblist[6] = new Jobs(7,"BigData");

        }catch (ArrayIndexOutOfBoundsException e){ // 이런 에러 잡으면 나한테 알려줘, 처리해 줘 //but catch에 해당되는거 아님 못 잡음 내가 잡을 수 있는 유형의 오류만
            e.printStackTrace(); //출력, 이거 안 쓰면 오류 표시 없이 그냥 뜨게 된다.
        }finally {
            System.out.println("무조건 실행됨"); //마지막으로 실행되는 녀석-> 예외 없음 제일 먼저 실행 예외 있음 예외 먼저 쓰고 마지막에 출력
        }


        for(int i = 0; i< joblist.length; i++){
            System.out.println(joblist[i]);
        }


    }
}
