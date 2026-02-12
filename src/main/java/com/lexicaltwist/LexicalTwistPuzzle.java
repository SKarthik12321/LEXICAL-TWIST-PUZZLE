package com.lexicaltwist;

import java.util.Scanner;

public class LexicalTwistPuzzle {

    static boolean isSingleWord(String w) {
        return !w.contains(" ");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String word1 = sc.nextLine();

        System.out.print("Enter second word: ");
        String word2 = sc.nextLine();

        if (!isSingleWord(word1) || !isSingleWord(word2)) {
            System.out.println("Invalid input — only single words allowed");
            return;
        }

        System.out.println("Valid inputs accepted");
    }
}
