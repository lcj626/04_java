package section02.variable;

public class test {
    public static void main(String[] args){

        int salary;

        System.out.println("김대리는 " + (salary=100) + "만원의 월급과 " + (int)(salary*0.5)+"만원의 보너스를 받아 총 " + (int)(salary+salary*0.5) + "만원을 받았다");
        System.out.println("과장은 " + (salary=120) + "만원의 월급과 " + (int)(salary*0.5)+"만원의 보너스를 받아 총 " + (int)(salary+salary*0.5) + "만원을 받았다");
        System.out.println("부장은 " + (salary=130) + "만원의 월급과 " + (int)(salary*0.5)+"만원의 보너스를 받아 총 " + (int)(salary+salary*0.5) + "만원을 받았다");
        System.out.println("차장은 " + (salary=150) + "만원의 월급과 " + (int)(salary*0.5)+"만원의 보너스를 받아 총 " + (int)(salary+salary*0.5) + "만원을 받았다");





        System.out.println("================");
        //김대리가 월급이 매월 10만원씩 늘어났다면?

        System.out.println("[100부터 10씩 증가하는 for 반복문 작성 실시 및 합계 계산]");

        int sum = 100;

        for(int i=1; i<=10; i++) {
            sum += 10;
            System.out.println(i + "월 김대리님 월급 : "+sum);
        }

        System.out.println("==================================================");
        ////F=ma, 힘 = F, 질량 = m, 가속도 = a, 지구 중력 가속도 = 9.81, 달의 중력 가속도 = 1.63(질량이 100kg인 사람이
        // 지구에서 받는 힘과 달에서 받는 힘의 몫 연산값을 구하고 정수로만 표현하시오.)

        int m = 100;

        System.out.println("지구에서 받는 힘: " + (int)(m*9.81));
        System.out.println("달에서 받는 힘: " + (int)(m*1.63));
        System.out.println("지구에서 받는 힘과 달에서 받는 힘의 몫 연산값 : " + (int)((m*9.81) % (m*1.63)));






    }
}
