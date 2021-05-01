package com.sberhomework.part2.balda;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Balda {
    public static void main(String[] args) {
        try (var reader = new BufferedReader(new InputStreamReader(System.in))) {
            String newWord;
            String initialWord;
            var uniqueWords = new HashSet<String>();
            int playerOneScore = 0;
            int playerTwoScore = 0;
            boolean playerOneInGame = true;
            boolean playerTwoInGame = true;
            var alphabet = new HashSet<Character>();

            System.out.println("Enter game word");
            initialWord = reader.readLine();

            if (initialWord.isBlank()) {
                System.out.println("Blank word. Game over!");
                return;
            }

            uniqueWords.add(initialWord);

            for (char c : initialWord.toCharArray()) {
                alphabet.add(c);
            }

            boolean playerOneTurn = true;
            System.out.print("Player1 guess: ");
            while (playerOneInGame || playerTwoInGame) {
                while (!(newWord = reader.readLine()).isBlank()) {
                    boolean wrong = false;
                    for (Character c : newWord.toCharArray()) {
                        if (!alphabet.contains(c)) {
                            System.out.println("Wrong character " + c);
                            wrong = true;
                            break;
                        }
                    }
                    if (!wrong) {
                        if (uniqueWords.contains(newWord)) {
                            System.out.println("Already guessed word");
                        } else {
                            System.out.println("Nice word! Try more.");
                            if (playerOneTurn) {
                                playerOneScore++;
                                System.out.print("Player2 guess: ");
                                playerOneTurn = !playerTwoInGame && false;
                            } else {
                                playerTwoScore++;
                                System.out.print("Player1 guess: ");
                                playerOneTurn = playerOneInGameInGame && true;
                            }
                            uniqueWords.add(newWord);
                        }
                    }
                }
                if (playerOneTurn) {
                    System.out.println("Nice game Player1! Words matched: " + playerOneScore);
                    playerOneInGame = false;
                } else {
                    System.out.println("Nice game Player2! Words matched: " + playerTwoScore);
                    playerTwoInGame = false;
                }
            }

        } catch (IOException ignored) {

        }
    }
}
