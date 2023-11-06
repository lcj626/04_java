package main.java.com.ohgiraffers.section01.init;

import java.util.Scanner;

public class Application01 {

    public static void main(String[] args){

        /*
        * 객체 배열은 레퍼런스 변수에 대한 배열이다.
        * 생성한 인스턴스도 배열을 이용해서 관리하면
        * 동일한 타입의 여러 개 인스턴스를 각각 취급하지 않고 연속 처리할 수 있어서 유용하다.
        * 또한 반환값은 1개의 값만 반환할 수 있기 때문에
        * 동일한 타입의 여러 인스턴스를 반환해야 하는 경우가 객체배열을 이용할 수 있다.
        * */

        //Scanner scanner = new Scanner(System.in);

        Car car1 = new Car("페라리", 300); //괄호 안에 생성자의 매개 변수 꼭 입력
        Car car2 = new Car("람보르기니", 350);
        Car car3 = new Car("롤스로이스", 250);
        Car car4 = new Car("부가티베이론", 400);
        Car car5 = new Car("포터", 500);


        car1.driveMAxSpeed();
        car2.driveMAxSpeed();
        car3.driveMAxSpeed();
        car4.driveMAxSpeed();
        car5.driveMAxSpeed();

        Car[]/*레퍼런스 타입*/ carArray = new Car[5]; //[]안에 배열 길이 안 정해주면 에러남

        carArray[0] = new Car("페라리", 300); //carArray 배열 0번째에 새로운 Car 생성 "모델네임 페라리 맥스 스피드 300"
        carArray[1] = new Car("람보르기니", 350);
        carArray[2] = new Car("롤스로이스", 250);
        carArray[3] = new Car("부가티베이론", 400);
        carArray[4] = new Car("포터", 500);

        System.out.println("======================cararray===================================");

        for (int i=0; i<carArray.length; i++){
            /*String name = scanner.next();
            int speed = scanner.nextInt();
            System.out.println(name + speed);*/
            carArray[i].driveMAxSpeed();
        }

        System.out.println("=======carArrya2==============");

        Car[] carArray2 = {
                new Car("페라리", 300),
                new Car("티코", 12000),
                new Car("포터", 400)
        };


        for (Car car : carArray2 // carArray2 에서 받아서 0번째 인덱스 부터 car에서 쓰겠다
             ) {
            car.driveMAxSpeed();
        }//foreach -> 대상배열
        //if 2의 배수ㅢ 인덱스의 값만 변경하고자 하는 경우 foreach 문은 불편함
        //if(i%2 == 0){car.driveMAxSpeed;}

    }

}



//과제
// 바둑판 만들기 (2차원 배열을 사용)
//콘솔 프로그램(자판기, 계산기)
//객체지향 적으로
