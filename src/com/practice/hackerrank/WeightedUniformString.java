package com.practice.hackerrank;

import java.util.HashSet;
import java.util.Set;

public class WeightedUniformString {

    static String[] weightedUniformStrings(String s, int[] queries) {

        String[] result = new String[queries.length];

        int weight = 0;
        char previous = ' ';
        Set<Integer> set = new HashSet<>();
        for (char letter : s.toCharArray()) {
            if (letter != previous)
                weight = letter - 'a' + 1;
            else
                weight += letter - 'a' + 1;

            previous = letter;
            set.add(weight);
        }

        for (int i = 0; i < queries.length; i++) {
            if (set.contains(queries[i])) {
                result[i] = "Yes";
            } else {
                result[i] = "No";
            }
        }

        return result;

    }

}
