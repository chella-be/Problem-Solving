package com.practice.free;

public class CountBits {

    /**
     * Method to count all the set bits from 1 to n
     *
     * @param x input n
     * @return total count bits
     */
    public int countBits(int x) {

        int[] num = new int[x + 1];

        for (int i = 1; i <= x; i++) {
            if (i % 2 != 0) {
                num[i] = 1 + num[i / 2];
            } else {
                num[i] = num[i / 2];
            }
        }
        int result = 0;
        for (int n : num) {
            result += n;
        }
        return result;
    }
}
