package com.practice.leetcode.string;

public class ImplementIndexOf {

    public static int strStr(String haystack, String needle) {

        if (needle.isEmpty()) {
            return 0;
        }

        int hLen = haystack.length();
        int nLen = needle.length();

        for (int i = 0; i <= hLen - nLen; i++) {
            if (haystack.substring(i, i + nLen).equals(needle)) {
                return i;
            }
        }

        return -1;
    }

    public static int indexOf(String haystack, String needle) {

        if (needle.isEmpty()) {
            return 0;
        }

        int hLen = haystack.length();
        int nLen = needle.length();

        if (hLen < nLen) {
            return -1;
        }
        for (int i = 0; i <= hLen - nLen; i++) {
            int j;
            for (j = 0; j < nLen; ++j) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }
            if (j == nLen) {
                return i;
            }
        }

        return -1;
    }
}
