package com.sberhomework.part4.lambda.swimmer;

import java.util.Locale;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        var swimmer = new Swimmer("Oleg", 30);

        swimmer.swim(x -> System.out.println(x.toUpperCase(Locale.ROOT)));

        Supplier<String> getName = swimmer::getName;
        System.out.println(getName.get());

        BiConsumer<String, Integer> consumer = (name, age) -> {
            swimmer.setName(name);
            swimmer.setAge(age);
        };

        consumer.accept("Ivan", 16);

        swimmer.swim(System.out::println);
    }
}
