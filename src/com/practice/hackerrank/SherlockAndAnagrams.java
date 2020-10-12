package com.practice.hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SherlockAndAnagrams {

    static int sherlockAndAnagrams(String s) {
        Map<String, Integer> map = new HashMap<>();

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String substring = s.substring(i, j);

                char[] chars = substring.toCharArray();
                Arrays.sort(chars);
                substring = String.valueOf(chars);

                int value = map.getOrDefault(substring, 0);
                if (value > 0) {
                    count += value;
                }
                map.put(substring, ++value);
            }
        }
        return count;
    }
}
