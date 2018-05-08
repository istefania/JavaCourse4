package com.example.stef.javacourse4;

import java.math.BigInteger;

public class Pb4 {
    public static void main(String[] args) {
        for (int i = 1; i < 31; i++) {
            System.out.println(i + ":" + factorial(i));

        }

    }

    static BigInteger factorial(int n) {
        BigInteger factorial = BigInteger.valueOf(1);
        for (int i = 1; i < n + 1; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }
}
