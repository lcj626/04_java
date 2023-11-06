package section05.typecasting;

public class Application3 {

    public static void main(String[] args){

        /*
        * 자동 형변환과 강제 형변환을 이용한 다른 자료형끼리의 연산
        * 다른 자료형 끼리 연산은 큰 자료형으로 자동 형변환 후 연산처리 된다.
        * */

        int inum = 10;
        long lnum = 10L;

        /* 자바에서는 같은 자료형 끼리만 연산이 가능하다
        * 따라서 서로 자료형이 다른 두 자료를 연산 할 때 자료형이 같아지도록 형변환을 해주어야 한다
        * */

        int isum = inum + (int) lnum;
        // 1번 10 + (long) 10; -> 10 + (int) 10;

        isum = (int)(isum + lnum);
        // 10L + 10L = (int)20 -> long타입에서 결과만 int로 바뀜. 위에 것과 결과는 같아도 과정이 다름


        byte bnum = 1;
        short snum = 2;
        short snum2 = 3;
        short snum3 = 3;

        int result1 = bnum + snum2;
        //원래는 (short)bnum + snum2 여야 하지만 컴파일러가 자연스럽게 변환해준다. 그리고 결과 전체가 int로 된 것 (int)((short)bnum + snum2)
        // short 끼리의 더하기도 더하는 순간 기본적으로 int 로 변환해서 계산하기 때문에 앞에 short로 변환작업 필요
        // if short result1 = (short)((int)bnum + (int)snum2)
        int result2 = snum2 + bnum;
        int result3 = bnum + result1;




    }
}
