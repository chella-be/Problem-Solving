package com.practice.leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

    public static boolean isIsomorphic(String s, String t) {

        Map<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char first = s.charAt(i);
            char second = t.charAt(i);

            if (map.containsKey(first) || map.containsValue(second)) {
                if (map.get(first) == null || map.get(first) != second) return false;
            } else {
                map.put(first, second);
            }
        }

        return true;
    }
}
