package com.example.stef.javacourse4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Pb1 {
    public static void main(String[] args) {
        String input = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book";
        frequenceyCount(input);

    }

    private static void frequenceyCount(String input) {

        Map<Character, Integer> hashCount = new HashMap<>();
        Character c;
        for (int i = 0; i < input.length(); i++) {
            c = input.charAt(i);
            if (hashCount.get(c) != null) {
                hashCount.put(c, hashCount.get(c) + 1);
            } else {
                hashCount.put(c, 1);
            }
        }
        Iterator it = hashCount.entrySet().iterator();
        System.out.println("char : frequency");
        while (it.hasNext()) {
            Map.Entry pairs = (Map.Entry) it.next();
            System.out.println(pairs.getKey() + " : " + pairs.getValue());
            it.remove();
        }

    }

}
