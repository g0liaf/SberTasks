package com.sberhomework.part4.lambda.functions;

import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        TriFunction<Double, Double, Double, Double> getVolume = (length, width, height) -> length * width * height;

        System.out.println(getVolume.apply(1.0, 2.0, 3.0));

        QuadFunction<String, Integer, String, Integer, String> tale = (name, enemyCount, weapon, enemyParts) ->
                String.format("The great hero %s were attacked by %d enemies, but no one can stand the %s...%d enemies part left on the field after battle.",
                        name, enemyCount, weapon, enemyParts);

        System.out.println(tale.apply("Viking", 50, "Father of all axes", 99));
    }
}
