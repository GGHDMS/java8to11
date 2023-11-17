package com.example.java8to11.section4;

import java.util.ArrayList;
import java.util.Optional;

public class App {

    public static void main(String[] args) {
        ArrayList<OnlineClass> springClasses = new ArrayList<>();

        springClasses.add(new OnlineClass(1, "spring boot", true));
        springClasses.add(new OnlineClass(2, "spring data jpa", true));
        springClasses.add(new OnlineClass(3, "spring mvc", false));
        springClasses.add(new OnlineClass(4, "spring core", false));
        springClasses.add(new OnlineClass(5, "rest api development", false));

        OnlineClass springBoot = new OnlineClass(1, "spring boot", true);

        Optional<Progress> progress = springBoot.getProgress();

        progress.ifPresent(
                c -> System.out.println(c.getStudyDuration())
        );

    }
}
