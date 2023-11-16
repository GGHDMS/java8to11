package com.example.java8to11.section2;

public interface Bar{

    default void printNameUpperCase() {
        System.out.println("Bar");
    }
}
