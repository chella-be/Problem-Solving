package com.practice.leetcode.string;

public class ReverseVowels {

    public static String reverseVowels(String s) {
        int start = 0;
        int end = s.length() - 1;
        String vowels = "aeiouAEIOU";
        char[] chars = s.toCharArray();

        while (start < end) {
            while (start < end && !vowels.contains(chars[start] + "")) {
                start++;
            }
            while (start < end && !vowels.contains(chars[end] + "")) {
                end--;
            }
            if (chars[start] != chars[end]) {
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;
            }
            start++;
            end--;
        }

        return new String(chars);
    }
}
