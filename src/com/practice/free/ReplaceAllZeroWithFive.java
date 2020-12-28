package com.practice.free;

public class ReplaceAllZeroWithFive {

    /**
     * Given an integer as input and replace all the ‘0’ with ‘5’ in the integer.
     *
     * @param num input
     */
    public int replaceAllZeroWithFive(int num) {

        int count = 0;
        int tempNumber = num;
        while (tempNumber != 0) {
            int lastDigit = tempNumber % 10;
            if (lastDigit == 0) {
                int digitPlace = 5 * (int) Math.pow(10, count);
                num += digitPlace;
            }
            count++;
            tempNumber /= 10;
        }

        return num;
    }

}
