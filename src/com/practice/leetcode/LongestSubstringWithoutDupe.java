package com.practice.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutDupe {

    public static int lengthOfLongestSubstring(String s) {

        Set<Character> set = new HashSet<>();

        int max = 0;
        int i = 0;
        int j = 0;

        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                j++;
                max = Math.max(set.size(), max);
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }

        return max;
    }
}
