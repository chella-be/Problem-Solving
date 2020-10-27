package com.practice.ctci;

import java.util.HashSet;
import java.util.Set;

public class OneAway {

    //1.5
    public static boolean oneAway(String one, String two) {

        if (Math.abs(one.length() - two.length()) > 1) return false;
        Set<Character> set = new HashSet<>();

        for (char c : one.toCharArray()) {
            set.add(c);
        }
        int count = 0;
        for (char c : two.toCharArray()) {
            if (!set.contains(c)) {
                count++;
            }
        }

        return count <= 1;
    }
}
