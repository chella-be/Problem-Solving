package com.practice.leetcode;

import java.util.Locale;

public class PalindromeString {

    public static boolean isPalindrome(String s) {

        s = s.replace(" ", "").toUpperCase(Locale.getDefault());

        int low = 0;
        int high = s.length() - 1;

        char[] array = s.toCharArray();

        while (low <= high) {

            if (!Character.isLetterOrDigit(array[low])) {
                low++;
            } else if (!Character.isLetterOrDigit(array[high])) {
                high--;
            } else {
                if (array[low] != array[high]) {
                    return false;
                } else {
                    low++;
                    high--;
                }
            }
        }

        return true;
    }
}
