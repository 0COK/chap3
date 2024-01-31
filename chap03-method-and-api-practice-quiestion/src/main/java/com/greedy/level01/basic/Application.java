package com.greedy.level01.basic;

public class Application {

    public static void main(String[] args) {

    Application app1 = new Application();
    app1.checkMethodA();
    app1.checkMethodB();





    }

    public void checkMethodA() {

        checkMethodA();

        System.out.println("checkMethodA() 호출함...");

        System.out.println("checkMethodA() 종료됨...");


    }

    public void checkMethodB() {

        System.out.println("checkMethodB() 호출함...");

        System.out.println("checkMethodB() 종료됨...");





    }



}
