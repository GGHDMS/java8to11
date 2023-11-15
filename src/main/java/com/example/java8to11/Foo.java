package com.example.java8to11;

public class Foo {
    public static void main(String[] args) {

        // 익명 내부 클래스 anonymous inner Clss
/*
        RunSomething runSomething = new RunSomething() {
            @Override
            public void doIt() {
                System.out.println("Hello");
            }
        };
*/
        RunSomething runSomething = n -> n + 10;

        System.out.println(runSomething.doIt(10));

    }


}
