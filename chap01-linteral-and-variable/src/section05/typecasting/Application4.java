package section05.typecasting;

public class Application4 {

    public static void main(String[] args){

        int inum = 290;
        byte bnum = (byte) inum; //int에서 byte 로 형변환
        System.out.println("inum : " + inum);
        System.out.println("bnum : " + bnum); //바로 앞부분의 손질로 인해 예측이 어렵다.

        double height = 178.5;
        int floorHeight = (int) height;
        System.out.println("height : " + height);
        System.out.println("floorHeight : " + floorHeight); // 소수점 밑은 없앰 의도적 다운캐스팅

    }
}
