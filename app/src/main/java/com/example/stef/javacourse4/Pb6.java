package com.example.stef.javacourse4;

import java.util.ArrayList;

public class Pb6 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("anna");
        words.add("Hannah");
        words.add("nnnbb");
        getStringFromArray(words);

    }

    static void isDoubloon(String s) {

        int size = 0;
        String wordToCheck = s.toLowerCase();
        for (int j = 0; j <= wordToCheck.length(); j++) {
            j = 1;
            String firstLetter = wordToCheck.substring(0, 1);
            String newWord = wordToCheck.replace(firstLetter, "");
            size = newWord.length();
            if ((wordToCheck.length() - newWord.length()) == 2) {
                wordToCheck = newWord;
            } else {
                System.out.println("False," + s + " is not a doubloon");
                return;
            }
        }
        if (size == 0) {
            System.out.println("True," + s + " is a doubloon");
        }
    }


    static void getStringFromArray(ArrayList<String> words) {
        for (int i = 0; i < words.size(); i++) {
            String wordToCheck = words.get(i);
            isDoubloon(wordToCheck);
        }

    }


}
