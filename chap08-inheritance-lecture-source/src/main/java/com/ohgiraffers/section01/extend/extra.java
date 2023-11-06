package main.java.com.ohgiraffers.section01.extend;

public class extra {

    public static void main(String[] args){


    Car car = new Car();//생성자 바로 호출 /*2083562754*/
        System.out.println(car.hashCode());

    Car car2 = returnCar();//Car을 변환할 수 있는 car2
    //Car car2; -> 선언만 했기 때문에 주소값 x
    //car2 = returnCar(); -> 주소값 생성
        System.out.println(car2.hashCode());//car2도 heap 영역에 생성

    //Car car2 = car; <-car와 car2와 같은 주소값 갖는 방법 /*2083562754*/

    // 밑에 함수 public static Car returnCar(Car car){
    // return car;}
    //Car car3 = returnCar(car);<-역시 car와 같은 주소값 /*2083562754*/


        System.out.println("=================================================");

    String test = "test";
    String test1 = "test";

        System.out.println(test.hashCode());
        System.out.println(test1.hashCode());
    test1 +="1";
        System.out.println(test);
        System.out.println(test.hashCode());

}

    public static Car returnCar(){//반환타입 Car 타입 참조자료형
        //Car car = this.car;
        //car.hashCode();/*2083562754*/
        return new Car();
    }

}
