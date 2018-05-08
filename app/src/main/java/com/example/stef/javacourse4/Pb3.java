package com.example.stef.javacourse4;

import java.util.Random;

public class Pb3 {
    public static void main(String[] args) {

        randomInt(100, 10);

    }

    static void randomInt(int High, int Low) {

        Random r = new Random();
        int Result = r.nextInt(High - Low) + Low;
        System.out.println(Result);
    }
}
