package com.example.java8to11.section2;

public class App {

    public static void main(String[] args) {
        Foo foo = new DefaultFoo("seokmun");

        foo.printName();
        foo.printNameUpperCase();
        Foo.printAnything();
    }
}
