package com.example.java8to11.section3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Seokmun");
        names.add("whiteship");
        names.add("toby");
        names.add("foo");

        // 중개 operator 은 종료안하면 작동 안함
        List<String> collect = names.stream().map(s -> {
            System.out.println(s);
            return s.toUpperCase();
        }).collect(Collectors.toList());

        System.out.println("====================");

        collect.forEach(System.out::println);

        System.out.println("====================");
        names.forEach(System.out::println);

        System.out.println("====================");

        for (String name : names) {
            if (name.startsWith("S")) {
                System.out.println(name.toUpperCase());
            }
        }

        System.out.println("====================");

        List<String> collect2 = names.parallelStream().map(s -> {
                    System.out.println(s + " " + Thread.currentThread().getName());
                    return s.toUpperCase();
                })
                .collect(Collectors.toList());

        collect2.forEach(System.out::println);

    }
}
