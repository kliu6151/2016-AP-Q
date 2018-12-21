package com.company;

public class RandomLetterChooser extends RandomStringChooser {
    public RandomLetterChooser(String str) {
        super(RandomLetterChooser.getSingleLetters(str));
    }

    public static String[] getSingleLetters(String str) {
        return str.split("");
    }
}

