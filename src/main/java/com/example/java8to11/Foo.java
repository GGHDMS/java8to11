package com.example.java8to11;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Foo {
    public static void main(String[] args) {

        System.out.println(new Plus10().apply(10));
        Function<Integer, Integer> plus10 = n -> n + 10;
        Function<Integer, Integer> multiply2 = n -> n * 2;

        System.out.println(plus10.apply(10));

        System.out.println(plus10.compose(multiply2).apply(10));

        System.out.println(plus10.andThen(multiply2).apply(3));

        Consumer<Integer> printT = i -> System.out.println(i);
        printT.accept(10);

        Supplier<Integer> get10 = () -> 10;

        System.out.println(get10);

        Predicate<String>startsWithSeokmun = s -> s.startsWith("Seokmun");
        System.out.println(startsWithSeokmun.test("Seokmun"));

    }


}
