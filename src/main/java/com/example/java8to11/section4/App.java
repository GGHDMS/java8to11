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

        System.out.println("===============");

        Optional<OnlineClass> optionalOnlineClass = springClasses.stream()
                .filter(c -> c.getTitle().startsWith("spring"))
                .findFirst();

        boolean present = optionalOnlineClass.isPresent();
        System.out.println(present);

        if (optionalOnlineClass.isPresent()) {
            OnlineClass onlineClass = optionalOnlineClass.get();
            System.out.println(onlineClass.getTitle());
        }

        optionalOnlineClass.ifPresent(c -> System.out.println(c.getTitle()));

        OnlineClass onlineClass = optionalOnlineClass.orElseGet(App::getNewClass);

        System.out.println(onlineClass.getTitle());

        Optional<Optional<Progress>> progress1 = optionalOnlineClass.map(OnlineClass::getProgress);
        Optional<Progress> progress2 = optionalOnlineClass.flatMap(OnlineClass::getProgress);

    }

    //orElse 는 무조건 실행 그렇기 때문에 orElse 는 상수를 return 할때 사용? 그럴 때 말고는 orElseGet
    private static OnlineClass getNewClass() {
        System.out.println("creating new online class");
        return new OnlineClass(10, "New class", false);
    }


}

