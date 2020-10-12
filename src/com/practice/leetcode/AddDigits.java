package com.practice.leetcode;

public class AddDigits {

    public static int addDigits(int num) {

        int result = 0;

        while (true) {
            while (num != 0) {
                result += num % 10;
                num /= 10;
            }
            if (result <= 9) return result;
            num = result;
            result = 0;
        }
    }

    public static int addDigits1(int num) {

        if (num == 0) return 0;
        if (num % 9 == 0) return 9;

        return num % 9;
    }

}
