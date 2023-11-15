package com.example.java8to11;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class App {
    public static void main(String[] args) {
        Function<Integer, String> intToString = i -> "number";
        Greeting greeting = new Greeting();

        UnaryOperator<String> hi = string -> "hi";
        Function<String, String> hi2 = Greeting::hi;

        Function<String, String> hello = greeting::hello;

        Supplier<Greeting> greetingSupplier = Greeting::new;

        Function<String, Greeting> greetingFunction = Greeting::new;

        String[] names = {"seokumn", "whiteship", "toby"};

        //임이의 객체 참조
        Arrays.sort(names, String::compareToIgnoreCase);

        System.out.println(Arrays.toString(names));
    }

}
