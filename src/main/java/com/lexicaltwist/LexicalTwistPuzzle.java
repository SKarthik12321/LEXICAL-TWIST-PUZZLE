package com.lexicaltwist;

import java.util.Scanner;

public class LexicalTwistPuzzle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String w1 = sc.nextLine();
        String w2 = sc.nextLine();

        if (!WordValidator.isSingleWord(w1) || !WordValidator.isSingleWord(w2)) {
            System.out.println("Invalid input");
            return;
        }

        System.out.println("Reverse pair = " +
            LexicalAnalyzer.isReverse(w1, w2));

        String combined = (w1 + w2).toUpperCase();

        System.out.println("Vowels = " +
            LexicalAnalyzer.vowelCount(combined));

        System.out.println("Consonants = " +
            LexicalAnalyzer.consonantCount(combined));
    }
}
