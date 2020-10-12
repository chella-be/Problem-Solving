package com.practice.leetcode;

public class ExcelColumnToTitle {

    public static String convertToTitle(int n) {

        StringBuilder sb = new StringBuilder();

        while (n != 0) {
            --n;
            int idx = n % 26;
            sb.append((char) (idx + 'A'));
            n = n / 26;
        }

        return sb.reverse().toString();
    }

}
