package com.sberhomework.part3.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Comparator<Integer>  primeDivisor = new Comparator<Integer>() {
            int primeDivisorCount(Integer number) {
                int count = 1;

                for (int i = 2; i <= number; i++) {
                    if (number % i == 0) {
                        count++;
                    }
                }
                return count;
            }

            @Override
            public int compare(Integer o1, Integer o2) {
                return primeDivisorCount(o1) - primeDivisorCount(o2);
            }
        };

        Comparator<Integer>  uniqueNumberBaseTen = new Comparator<Integer>() {
            int baseTenLength(Integer number) {
                var baseTenSet = new HashSet<Integer>();

                while (number > 9) {
                    baseTenSet.add(number % 10);
                    number /= 10;
                }
                baseTenSet.add(number);

                return baseTenSet.size();
            }

            @Override
            public int compare(Integer o1, Integer o2) {
                return baseTenLength(o1) - baseTenLength(o2);
            }
        };

        var numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(22);
        numbers.add(12);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(9);
        numbers.add(111);
        numbers.add(102);
        numbers.add(8);
        numbers.add(200);
        numbers.add(989);

        System.out.println("Initial sort " + numbers);
        numbers.sort(primeDivisor);
        System.out.println("After prime divisor compare " + numbers);
        numbers.sort(uniqueNumberBaseTen);
        System.out.println("After base ten compare " + numbers);
    }
}
