package section05.typecasting;

public class test1 {

    public static void main(String[] args){

        /*5명의 반 학생이 있으며 학생들의 키는 아래와 같다

        178.5
        179.3
        190.7
        188.678
        160.8
        이다.

                우리는 학생의 평균 키를 구해서 화면에 보여주고자 한다. (소수자리 절삭)
        화면에 보여지는 양식은 다음과 같다.

        1반 학생 5명의 키의 평균은 000cm이다*/

        double height1 = 178.5;
        double height2 = 179.3;
        double height3 = 190.7;
        double height4 = 188.678;
        double height5 = 160.8;

        int floorHeight = (int) height1;
        int floorHeight2 = (int) height2;
        int floorHeight3 = (int) height3;
        int floorHeight4 = (int) height4;
        int floorHeight5 = (int) height5;

        System.out.println("1반 학생 5명의 키의 평균은 " + (floorHeight+floorHeight2+floorHeight3+floorHeight4+floorHeight5)/5 + "cm이다");

        System.out.println("====================================");

        /*문자 z에 대응하는 숫자를 화면에 출력해 주세요

        &
        long lnum = 10L
        int num = 190;

        아래의 연산의 차이를 옆사람에게 설명해주세요
        int sum = (int)num + num;
        int sum2 = (int)(num + lnum)*/

        char letter = 'z';
        int text = (int) letter;



        long lnum = 10L;
        int num = 190;

        int sum = (int)num + num;
        int sum2 = (int)(num + lnum);

        System.out.println("===================================");

        /*사업을 시작한 홍길동님은 10월 18일 매출에서 부가세(10%)를 제외한 소득을 알고 싶다

        10-18의 매출은 다음과 같다.

        150400원
        1400원
        25000원
        30000원

        여기서 부가세 10%는 변하지 않는 값이라는 점에 유의하자*/













    }
}
