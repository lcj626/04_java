package main.java.com.ohgiraffers.section01.understand;
import main.java.com.ohgiraffers.section01.understand.car.Car;
import main.java.com.ohgiraffers.section01.understand.employee.Seller;
import main.java.com.ohgiraffers.section01.understand.car.ElectricCar;
import main.java.com.ohgiraffers.section01.understand.car.OldCar;

public class Application01 {


    public static void main(String[] args){

        System.out.println("자동차 판매 프로그램 입니다.");

        ElectricCar ionic = new ElectricCar("H", 1000, "ionic1", "1000km");
        ElectricCar ionic2 = new ElectricCar("H", 1500, "ionic2", "1500km");
        ElectricCar ionic3 = new ElectricCar("H", 2000, "ionic3", "2000km");
        ElectricCar kona = new ElectricCar("H", 2100, "kona", "2100km");

        System.out.println("내연 기관 자동차 ");
        OldCar porter = new OldCar("H", 1500, "porter", "diesel");
        OldCar avante = new OldCar("H", 1500, "avante", "gasoline");
        OldCar sonata = new OldCar("H", 2000, "sonata", "gasoline");

        System.out.println("영업 사원 입사 ");
        // 노홍철 사원이 입사를 함

        Seller seller = new Seller("노홍철");
        // 노홍철 사원이

        /*OldCar[] sellers = {porter, avante, sonata, porter};
        seller.oldCarSale(sellers);
        ElectricCar[] electricCars = {ionic2, ionic3, ionic, kona};

        seller.electricCarSale(electricCars);*/

        Car[] cars = {porter, kona, ionic2, sonata, avante};
        seller.sale(cars);

        System.out.println(seller);

        /*Car car = new Car("h", 100);
        System.out.println("car와 oldcar가 같은지 비교 " + (car instanceof OldCar));*/

        System.out.println("형 변환");
        Car car2 = kona;
        System.out.println(kona.hashCode());
        System.out.println(car2.hashCode());
        System.out.println("형 변환 후 다시 형 변환");
        kona = (ElectricCar)car2;
        System.out.println(kona.hashCode());
        System.out.println(car2.hashCode());//형변환 해도 주소값 잃지 않는다. but Car에서 상속받으면 Car에 없는 속성은 쓰지 못한다.

        //OldCar[] sale = {porter, porter, avante, sonata};
        //seller.oldCar(sale);


    }
}
