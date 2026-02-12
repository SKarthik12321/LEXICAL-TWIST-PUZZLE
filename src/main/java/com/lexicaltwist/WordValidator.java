package com.lexicaltwist;

public class WordValidator {
    public static boolean isSingleWord(String w) {
        return !w.contains(" ");
    }
}
