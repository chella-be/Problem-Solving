package com.practice.free;

public class HighestPowerOf2 {

    public int highestPowerOfTwo(int num) {

        int result = 1;
        int prev = 0;

        while (result < num) {
            prev = result;
            result = result << 1;
            if (result == num) return num;
        }
        return prev;
    }
}
