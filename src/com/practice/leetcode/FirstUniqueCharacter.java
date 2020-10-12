package com.practice.leetcode;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {

    public static int firstUniqueChar(String s) {

        if (s.length() == 0) {
            return -1;
        }

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                int num = map.get(s.charAt(i));
                map.put(s.charAt(i), ++num);
            } else {
                map.put(s.charAt(i), 1);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            int num = map.get(s.charAt(i));
            if (num == 1) {
                return i;
            }
        }

        return -1;
    }
}
