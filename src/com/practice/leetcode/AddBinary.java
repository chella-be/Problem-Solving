package com.practice.leetcode;

public class AddBinary {

    public static String addBinary(String a, String b) {

        int n = a.length() - 1;
        int m = b.length() - 1;

        StringBuilder builder = new StringBuilder();
        int carry = 0;
        while (n >= 0 || m >= 0) {

            int sum = carry;

            if (n >= 0) {
                sum += a.charAt(n) - '0';
            }
            if (m >= 0) {
                sum += b.charAt(m) - '0';
            }

            builder.append(sum % 2);
            carry = sum / 2;

            n--;
            m--;
        }

        return builder.reverse().toString();
    }

}
