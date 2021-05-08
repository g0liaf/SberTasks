package com.sberhomework.part1.fibonacci;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        long input = -1;
        String wrongInputMessage = "Please provide whole number from 0 to (2^63 - 1)!";

        System.out.println("Enter whole number from 0 to (2^63 - 1)");
        while (input < 0) {
            while (!scanner.hasNextLong()) {
                System.out.println(wrongInputMessage);
                scanner.next();
            }
            input = scanner.nextLong();
            if (input < 0) {
                System.out.println(wrongInputMessage);
            }
        }
        scanner.close();

        if (input == 0) {
            System.out.println(0);
            return;
        }

        // По формуле Бине
        double ln5d2 = Math.log(5) / 2;
        double lnf1 = Math.log(1 + Math.sqrt(5) )- Math.log(2);
        long index;
        long f1;
        long f2;
        var list = new ArrayList<Long>();
        while (input > 0) {
            index = Math.round((ln5d2 + Math.log(input)) / lnf1);
            f1 = Math.round(Math.exp((index - 1) * lnf1 - ln5d2));
            f2 = Math.round(Math.exp(index * lnf1 - ln5d2));
            if (f2 <= input) {
                input -= f2;
                list.add(index - 2);
            } else {
                input -= f1;
                list.add(index - 3);
            }
        }
        for (long i = list.get(0); i >= 0 ; i--) {
            System.out.print(list.contains(i) ? 1 : 0);
        }
        System.out.println();
    }
}
