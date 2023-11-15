package com.example.java8to11;

// 추상 메소드 하나면 함수형 인터페이스
@FunctionalInterface
public interface RunSomething {

    int doIt(int number);

    static void printName() {
        System.out.println("Seokmun");
    }

    default void printAge() {
        System.out.println("25");
    }
}
