package com.sberhomework.part4.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void first() {
        var random = new Random();
        var numberStream = random.ints(-100, 100);

        var set = numberStream.filter(n -> n % 2 == 1)
                .peek(n -> System.out.print(n + " "))
                .map(n -> n * 2)
                .peek(System.out::println)
                .limit(15)
                .boxed()
                .collect(Collectors.toSet());
        System.out.println(set);
        System.out.println("Sum " + set.stream().reduce(0, Integer::sum));
    }

    public static void second() {
        var names1 = Arrays.asList("Саша", "Маша", "Саша", "Маша");
        var names2 = Arrays.asList("Viktor", "Natasha", "Natasha", "Natasha");
        var names3 = Arrays.asList("Gregory", "Dmitriy", "Ivan", "Rose");
        var names4 = Arrays.asList("Fiona", "Alina", "Regina", "Fiona");

        var uniqueNames = Stream.of(names1, names2, names3, names4)
                .flatMap(Collection::stream)
                .collect(Collectors.toSet());
        System.out.println(uniqueNames);
    }

    public static void third() {
        var map = new HashMap<String, Double>();

        map.put("Monkey", 6.7);
        map.put("Car", 1958.56);
        map.put("Human", 87.5);
        map.put("Baby", 6.77);

        Double middle = map.values()
                .stream()
                .reduce(0.0, (aDouble, aDouble2) -> aDouble + aDouble2 / map.size());
        System.out.println(middle);
    }

    public static void fourth() {
        var names1 = Arrays.asList("Viktor", "Natasha", "Ivan", "Gregory");
        var names2 = Arrays.asList("Gregory", "Dmitriy", "Ivan", "Rose");

        Set<String> result = names1
                .stream()
                .distinct()
                .filter(names2::contains)
                .collect(Collectors.toSet());
        System.out.println(result);
    }

    public static void main(String[] args) {
        first();
        second();
        third();
        fourth();
    }
}
