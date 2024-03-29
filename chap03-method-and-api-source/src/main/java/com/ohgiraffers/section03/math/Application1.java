package com.ohgiraffers.section03.math;

public class Application1 {

    public static void main(String[] args) {

        /* 수업목표. Math 클래스에서 제공하는 static 메소드를 호출할 수 있다. */

        /* API란?
        * Application Programming Interface는 응용프로그램에서 사용할 수 있도록,
        * 운영체제나 프로그래밍 언어가 제공하는 기능을 제어할 수 있도록 만든 인터페이스를 뜻한다.
        * 쉽게 말해 우리가 구현할 수 없거나 구현하기 번거로운 기능들을 JDK를 설치하면 사용할 수 있도록 제공해놓은 소스코드(클래스나 인터페이스)들을 의미한다
        * 더 쉽게 말해 누가 작성해놓은 소스코드이니 가져다 쓰는 방법을 본다는 말이다.
        * 모든 코드를 우리가 다 외울 수 없으니 API문서를 별도로 제공해주고 있다. */

        /* java. lang.Math
        * Math 클래스는 수학에서 자주 사용하는 상수들과 함수 들을 미리 구현해놓은 클래스이다.
        * 모든 메소드는 static 메소드로 작성되어 있다.
        *
        * */

        /* 목차 1. 절대값 출력 */
        /* 목차 1-1. 클래스의 full-name을 다적은 경우 */
        System.out.println("-7의 절대값 : " + (java.lang.Math.abs(-7)));
        //컨트롤 클릭 누르면 관련된 정보로 넘어가서 볼수 있음 // 임포트를 하지않아도 쓸 수 있음 Math()
        /* 목차 1-2. import를 해서 사용 */
        System.out.println("-1.25의 절대값 : " + (Math.abs(-1.25)));

        /* 목차 2. 최대값, 최솟값 출력 */
        System.out.println(Math.min(10, 20));
        System.out.println(Math.max(20, 30));

        System.out.println(Math.PI);
        // 원주율(메스안에 이미 정의 되어있음)

        /* 목차 3. 난수 출력*/ // 0부터10까지 출력해주는걸 난수라고함
        System.out.println(Math.random());
        // Math 안에 있는 random 으로 출력하면 0~1까지 소수점형태로 출력됨 출력할때마다 바뀜


        /* */


    }
}

