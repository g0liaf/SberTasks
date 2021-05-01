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
                        uniqueWords.add(newWord);
                    }
                }
            }
            System.out.println("Nice game! Words matched: " + uniqueWords.size());
        } catch (IOException ignored) {

        }
    }
}
