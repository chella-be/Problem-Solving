package com.practice.leetcode;

public class PlusOne {

    public static int[] plusOne(int[] digits) {

        int length = digits.length;

        digits[length - 1] = digits[length - 1] + 1;

        for (int i = length - 1; i > 0; i--) {
            if (digits[i] > 9) {
                digits[i] = 0;
                digits[i - 1] = digits[i - 1] + 1;
            }
        }

        int[] res = new int[digits.length + 1];

        if (digits[0] > 9) {
            res[0] = 1;
            return res;
        }
        return digits;
    }
}
