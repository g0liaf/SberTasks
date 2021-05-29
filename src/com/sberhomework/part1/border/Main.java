package com.sberhomework.part1.border;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int width = scanner.nextInt();
        String word = scanner.next();
        scanner.close();
        int wordLength = word.length();

        if (length < 3 || wordLength > width - 2) {
            System.out.println("Ошибка");
            return;
        }

        String topBottom = String.format("%0" + width + "d", 0).replace('0', '*');
        String between = String.format("*%" + (width - 2) + "c*", ' ');
        int startWordSpaceWidth = (width - 2 - wordLength) / 2;
        int endWordSpaceWidth = width - 2 - wordLength - startWordSpaceWidth;
        var stringBuilder = new StringBuilder("*");

        if (startWordSpaceWidth != 0) {
            stringBuilder.append(String.format("%" + startWordSpaceWidth + "c", ' '));
        }
        stringBuilder.append(word);
        if (endWordSpaceWidth != 0) {
            stringBuilder.append(String.format("%" + endWordSpaceWidth + "c", ' '));
        }
        stringBuilder.append('*');
        word = stringBuilder.toString();
        int wordIndex = (length - 3) / 2;

        System.out.println(topBottom);
        for (int i = 0; i < length - 2; i++) {
            if (i == wordIndex) {
                System.out.println(word);
            } else {
                System.out.println(between);
            }
        }
        System.out.println(topBottom);
    }
}
