package com.lexicaltwist;

public class LexicalAnalyzer {

    public static boolean isReverse(String a, String b) {
        return new StringBuilder(a).reverse().toString().equalsIgnoreCase(b);
    }

    public static int vowelCount(String s){
        int c=0;
        for(char ch: s.toUpperCase().toCharArray())
            if("AEIOU".indexOf(ch)>=0) c++;
        return c;
    }

    public static int consonantCount(String s){
        int c=0;
        for(char ch: s.toUpperCase().toCharArray())
            if(Character.isLetter(ch) && "AEIOU".indexOf(ch)<0) c++;
        return c;
    }
}
