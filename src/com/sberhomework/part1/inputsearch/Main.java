package com.sberhomework.part1.inputsearch;

/*
    На ввод подается n чисел не разделенных пробелом (строка вида 123235094659843).
    Вычислить k-тый символ строки. Целочисленный параметр k передается пользователем.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Wrong input");
            return;
        }
        String numbers = args[0];
        var scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        scanner.close();

        if (k < 0 || k > numbers.length() - 1) {
            System.out.println("Wrong index");
        } else {
            System.out.println(numbers.charAt(k));
        }
    }
}
