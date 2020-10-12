package com.practice.hackerrank;

public class RepeatedString {

    static long repeatedString(String s, long n) {

        long len = s.length();

        long count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                count++;
            }
        }

        long occur = (n / len) * count;

        long res = (n / len) * len;
        if (res == n) {
            return occur;
        } else {
            long remain = n - res;

            for (int i = 0; i < remain; i++) {
                if (s.charAt(i) == 'a') {
                    occur++;
                }
            }
        }

        return occur;
    }
}
