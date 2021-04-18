package com.sberhomework.part1.numberguess;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number = (new Random()).nextInt(4);
        var scanner = new Scanner(System.in);
        int tries = 1;

        System.out.println("Guess my number");
        int playerGuess = scanner.nextInt();
        while (playerGuess != number) {
            if (playerGuess > number) {
                System.out.println("Your number is higher");
            } else {
                System.out.println("Your number is lower");
            }
            playerGuess = scanner.nextInt();
            tries++;
        }
        System.out.println("You won with " + tries + " tries");
        scanner.close();
    }
}
