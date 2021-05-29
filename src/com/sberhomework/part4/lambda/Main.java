package com.sberhomework.part4.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class Main {
    static <T, R> List<R> map (List<T> origin, Function<T, R> mapper) {
        var newList = new ArrayList<R>();

        for (T elem : origin) {
            newList.add(mapper.apply(elem));
        }

        return newList;
    }

    static <T> void forEach(List<T> origin, Consumer<T> consumer) {
        for (T elem : origin) {
            consumer.accept(elem);
        }
    }

    static <T> List<T> filter(List<T> origin, Predicate<T> predicate) {
        var filtered = new ArrayList<T>();

        for (T elem : origin) {
            if (predicate.test(elem)) {
                filtered.add(elem);
            }
        }
        return filtered;
    }

    static <T> int count(List<T> origin, Predicate<T> predicate) {
        return filter(origin, predicate).size();
    }

    static <T> T foldLeft(List<T> origin, BinaryOperator<T> operator) {
        if (origin == null || origin.size() == 0) {
            return null;
        }
        T result = origin.get(0);

        for (int i = 1; i < origin.size(); i++) {
            result = operator.apply(result, origin.get(i));
        }
        return result;
    }

    static <T> T foldRight(List<T> origin, BinaryOperator<T> operator) {
        if (origin == null || origin.size() == 0) {
            return null;
        }
        T result = origin.get(origin.size() - 1);

        for (int i = origin.size() - 2; i >= 0; i--) {
            result = operator.apply(result, origin.get(i));
        }
        return result;
    }

    public static void main(String[] args) {
        var intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(2);
        intList.add(3);

        System.out.println(map(intList, Double::valueOf));
        forEach(intList, i -> System.out.println(i * i));
        System.out.println(filter(intList, i -> i % 2 == 0));
        System.out.println(count(intList, i -> i > 0));
        System.out.println(foldLeft(intList, (left, right) -> (left + left) * right));
        System.out.println(foldRight(intList, (right, left) -> (left + left) / right));
    }
}
