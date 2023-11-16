package com.example.java8to11.section2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.Spliterator;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();

        name.add("seokmun");
        name.add("whiteship");
        name.add("toby");
        name.add("foo");

        name.forEach(System.out::println);

        Spliterator<String> spliterator = name.spliterator();
        Spliterator<String> spliterator2 = spliterator.trySplit();

        while (spliterator.tryAdvance(System.out::println)) ;
        System.out.println("============================");
        while (spliterator2.tryAdvance(System.out::println)) ;

        long s1 = name.stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("S"))
                .count();
        System.out.println(s1);

        Set<String> s2 = name.stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("S"))
                .collect(Collectors.toSet());

        name.removeIf(s -> s.startsWith("s"));

        System.out.println("======================");
        name.forEach(System.out::println);

        Comparator<String> compareToIgnoreCase = String::compareToIgnoreCase;
        name.sort(compareToIgnoreCase.reversed().thenComparing(compareToIgnoreCase));


        name.forEach(System.out::println);
    }
}
