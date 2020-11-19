package com.practice.ctci;

public class StringRotation {

    //1.9
    public static boolean stringRotation(String s1, String s2) {
        int sIndex = findStartIndex(s1, s2);
        if (sIndex < 0) return false;

        for (int i = sIndex + 1, j = 1; sIndex != i; i++, j++) {
            i = i % s1.length();
            if (s2.charAt(i) != s1.charAt(j)) return false;
        }

        return true;
    }

    private static int findStartIndex(String s1, String s2) {
        char firstChar = s1.charAt(0);
        for (int i = 0; i < s2.length(); i++) {
            if (firstChar == s2.charAt(i)) return i;
        }
        return -1;
    }
}
