package main.java.com.ohgiraffers.section01.understand.employee;
import main.java.com.ohgiraffers.section01.understand.car.Car;
import main.java.com.ohgiraffers.section01.understand.car.ElectricCar;
import main.java.com.ohgiraffers.section01.understand.car.OldCar;

public class Seller {

    private String name;
    private int result;//result = 판매 수당

    public Seller(String name){
        this.name = name;
    }


    /*
    * 자동차 판매의 경우 내연 기관 자동차ㅇ와 전기차를 한번에 카의 타입으로 입력을 받고
    * 입력 받은 타입이 재정이 되 ㄴ 프라이스를 호출하여 하나의 메서드로 판매 가격을 책정할 수 있다.
    * 만약 위와 같이 하지 않는 경우 아래의 메서드 각각 구현을 해야 하며 이로 인해 별도의 속성을 갖게 된다
    * */
    public void sale(Car[] cars){//Car[]이라는 자료형에 있는 배열값들을 cars로 받아온다
        //형변환을 하였다고 해서 heap 생성된 값이 변환되는 것은 아니며 주소를 잃는 것도 아니다.
        //단지 해당 형에서 사용할 수 있는 기능만 사용할 수 있으며 그 외적인 기능은 쓰지 못하는 상태가 되는 것이다.
        //이를 통해 다형성의 이점을 누릴 수 있게 된다.
        for(Car car:cars) {//받아온 cars 값들에서 하나하나 꺼내서 car 에 대입한다.
            if(car instanceof ElectricCar){ // heap에 생성된 car의 자료형이 ElectricCar와 같은지를 비교함 car와 같지 않은 부분은 형변환 불가능 못 씀
                ElectricCar electricCar = (ElectricCar) car;
                System.out.println(electricCar.getBrand() + "사의 " + electricCar.getCarName() + "를 판매 하였습니다");
                //만약 상속받은 경우 부모 클래스(여기서는 Car)에 들어있는속성만 보여줄 수 있고 내 고유의 속성은 가지고만 있고 보여주질 못한다
                //즉 Car에 있는 brand와 price만 보일 수 있고 ElectricCars의 고유 속성인 carName,과 energy는 Car에게 상속 받는 순간 못쓰는건데
                //instanceof 를 써서 cars 를 ElectricCar로 변형 시키면 다시 쓰지 못했던 고유 속성들을 사용할 수 있게 되는 것이다.
                result +=(int)electricCar.getPrice();
            }else{
                OldCar oldCar = (OldCar) car;
                System.out.println(oldCar.getBrand() + "사의" + oldCar.getName() + "를 판매 하였습니다.");
                result +=(int)oldCar.getPrice();
                //System.out.println(car.getBrand() + "사의 " + " 판매 수수료는 " + car.getPrice() + "입니다.");
            }

        }
    }


    /*public void sale(){

    }*/

    /*
    * 만약 우리가 상속을 받지 않았다면 다음과 같이
    * 내연기관차(oldCar)를 판매하는 메서드와 전기차(electriCar)를 판매하는 메서드를 따로 만드렁 제공을 해야 할 것이다.
    * */

    public void oldCarSale(OldCar[] oldCar){
        for (OldCar car: oldCar) {
            System.out.println(car.getBrand() + "사의 " + car.getName() + " 를 판매하였습니다");
            result +=car.getPrice() * 0.1;//판매 수수료는 판매가의 10%
        }


        ;

        //for (OldCar car: oldCar) {
            //result += car.getPrice();
        }
        //result = oldCar.getPrice();

    public void electricCarSale(ElectricCar[] electricCar) {
        for (ElectricCar car : electricCar) {
            System.out.println(car.getCarName());
            result += car.getPrice()*0.15;
        }

    }
    @Override
    public String toString() {
        return name + " 사원의 이번 달 월급은 result = " + result + " 만원 입니다";
    }
}
