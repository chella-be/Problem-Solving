package com.practice.leetcode.string;

public class FindTheDifference {

    public char findTheDifference(String s, String t) {

        int[] first = new int[26];

        for (int i = 0; i < s.length(); i++) {
            first[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            if (--first[t.charAt(i) - 'a'] < 0) return t.charAt(i);
        }

        return ' ';
    }
}
