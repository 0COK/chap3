package com.ohgiraffers.section01.method;

public class Application6 {

    public static void main(String[] args) {

        /* 수업목표. 메소드 리턴값을 이해하고 활용할 수 있다. */

        System.out.println("main() 메소드 시작함...");

        /* 목차 1. 메소드 리턴값 확인 */
        Application6 app6 = new Application6();
        app6.testMethod();

        String returnText = app6.testMethod();                 // 무조건 변수에 담는건 아니고 담아서 보여준 것
        System.out.println("returnText = " + returnText);

        System.out.println(app6.testMethod());                // 이렇게 출력 구문으로도 할 수 있음

    }

    public String testMethod() {

        return "hello world!";
        //리턴을 해줘야하는 이유는 보이드는 반환이 있는데 스트링은 반환겠다고 말하는 것?
    }

}
