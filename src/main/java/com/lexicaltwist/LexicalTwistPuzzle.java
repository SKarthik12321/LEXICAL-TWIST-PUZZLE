package com.lexicaltwist;

import java.util.Scanner;

public class LexicalTwistPuzzle {

    static int vowels(String s){
        int c=0;
        for(char ch: s.toUpperCase().toCharArray())
            if("AEIOU".indexOf(ch)>=0) c++;
        return c;
    }

    static int consonants(String s){
        int c=0;
        for(char ch: s.toUpperCase().toCharArray())
            if(Character.isLetter(ch) && "AEIOU".indexOf(ch)<0) c++;
        return c;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String w1 = sc.nextLine();
        String w2 = sc.nextLine();

        String combined = (w1 + w2).toUpperCase();

        System.out.println("Combined = " + combined);
        System.out.println("Vowels = " + vowels(combined));
        System.out.println("Consonants = " + consonants(combined));
    }
}
