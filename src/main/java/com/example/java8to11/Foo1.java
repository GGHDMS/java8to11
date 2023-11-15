package com.example.java8to11;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.Supplier;

public class Foo1 {

    public static void main(String[] args) {
        Supplier<Integer> get10 = () -> 10;
        BinaryOperator<Integer> sum = (n1, n2) -> n1 + n2;

        Foo1 foo1 = new Foo1();
        foo1.run();
    }

    private void run() {
        //final 로 생각함
        int baseNumber = 10;

        // 로컬 클래스
        class LocalClass {
            void printBaseNumber() {
                int baseNumber = 100;
                System.out.println(baseNumber);
            }
        }

        // 익명 클래스
        Consumer<Integer> integerConsumer = new Consumer<Integer>() {
            int baseNumber = 100;

            @Override
            public void accept(Integer integer) {
                System.out.println(baseNumber);
            }
        };


        IntConsumer printInt = i -> {
//            int baseNumber = 100; 불가능
            System.out.println(i + baseNumber);
        };

        printInt.accept(10);

//        baseNumber++;
    }
}
