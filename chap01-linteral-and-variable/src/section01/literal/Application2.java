package section01.literal;

public class Application2 {

    public static void main(String[] args){
        /*수업 목표. 정수 리터럴 형식의 값을 연산한다.*/

        /*
         *1. 123(리터럴) + 456(리터럴)
         *2. 123 - 456
         *3. 123 * 456
         *4. 40/10
         *5. 10 % 2
         */

        System.out.println(234+456);
        System.out.println(123-456);
        System.out.println(10 % 2);
        // % 표시: 나눗셈 이후 나머지 표시 남은게 없으면 0 -> 짝수인 거 구분할 때 많이 씀


        /* 실수와 실수 리터럴 연산(리터럴:변수에 넣기 전 값 그 자체) */
        /*
         *1. 1.23 + 1.23
         *2. 1.23 - 1.23
         *3. 1.23 * 1.23
         *4. 1.23 / 1.23
         *5. 1.23 % 1.23
         */

        System.out.println(1.23 + 1.23);
        System.out.println(1.23 - 1.23);
        System.out.println(1.23 * 1.23);
        System.out.println(1.23 / 1.23);
        System.out.println(1.23 % 1.23);



        System.out.println("-----------");
        /* 정수와 실수 연산 */
        /*
         *1. 1 + 0.5
         *2. 1 - 0.5
         *3. 1 * 0.5
         *4. 1 / 0.5
         *5. 1 % 0.5
         */

        System.out.println(1 + 0.5);
        System.out.println(1 - 0.5);
        System.out.println(1 * 0.5);
        System.out.println(1 / 0.5);
        System.out.println(1 % 0.5);
        // 정수 + 실수 할 때 실수가 더 넓으 므로 실수 값으로 출력 된다(if 정답 2=>2.0)


        System.out.println("===============문자와 문자의 연산 ================");
        /*목차. 2. 문자의 연산*/
        /* 목차. 2-1. 문자와 문자의 연산*/
        /* 필기. 문자끼리의 연산도 사칙연산에 mod 연산까지 가능하다. */
        /* 설명. 지금은 계산 결과가 왜 이렇게 나왔는지 보다 연산이 사용 가능하다는 것에 집중하자!! */

        // ('a' + 'b')
        // ('a' - 'b')
        // ('a' * 'b')
        // ('a' / 'b')
        // ('a' % 'b')

        System.out.println('a' + 'b');
        // a=97, b=98 컴퓨터는 문자에 대응되는 아스키코드표가 있다.
        System.out.println('a' - 'b');
        System.out.println('a' * 'b');
        System.out.println('a' / 'b');
        System.out.println('a' % 'b');

        //컴퓨터는 모든걸 0과 1 로 구분. 문자는 컴퓨터가 숫자로 변환




        System.out.println("========문자와 정수의 연산========");
        System.out.println('a' + 1);
        System.out.println('a' - 1);
        System.out.println('a' * 2);
        System.out.println('a' / 2);
        System.out.println('a' % 2);

        /*목차. 3-2 문자열과 다른 형태의 값 연산*/
        /*필기. 문자열과의 연산은 '+' 연산만 가능하다. */
        /* 필기. 연산 결과는 다른 형태의 값들도 문자열로 취급하여 문자열 이어붙이기(문자열 합치기) 결과가 나오게 된다. */
        System.out.println("문자와 다른 형태의 값 연산=========");
        System.out.println("helloworld" + 1004);
        /* 목차. 3-2-1. 문자열과 정수의 연산 */
        System.out.println("helloworld" + 123.456);
        /* 목차. 3-2-2. 문자열과 실수의 연산 */
        System.out.println("helloworld" + 'a');
        /* 목차. 3-2-3. 문자열과 문자의 연산 */
        System.out.println("helloworld" + true);
        /* 목차. 3-2-4. 문자열과 논리값의 연산 */
        // 데이터 타입이 일치하지 않을 경우 숫자를 문자열로 바꿔서 더함

        System.out.println("===============");
        System.out.println("123"+"456");

        /* 논리값 연산 */
        /* 4-1 논리값과 논리값 연산 */
        //System.out.println(true + false);
        //System.out.println(true + 1);
        //위에 것 두개 불가능
        System.out.println(true + "false");
        System.out.println("안녕" + 'f'+'a'+'l'+'s'+'e');
    }
}
