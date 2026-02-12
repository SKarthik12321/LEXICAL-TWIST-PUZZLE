package com.lexicaltwist;

import java.util.Scanner;

public class LexicalTwistPuzzle {

    static boolean isReverse(String a, String b) {
        return new StringBuilder(a).reverse().toString().equalsIgnoreCase(b);
    }

    static String transform(String w) {
        return new StringBuilder(w)
                .reverse()
                .toString()
                .toLowerCase()
                .replaceAll("[aeiou]", "@");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String w1 = sc.nextLine();

        System.out.print("Enter second word: ");
        String w2 = sc.nextLine();

        if (isReverse(w1, w2)) {
            System.out.println("Transformed = " + transform(w1));
        } else {
            System.out.println("No transformation — not reverse pair");
        }
    }
}
