package com.practice.free;

public class FindMaxProductPair {

    /**
     * Find a pair with maximum product in array of Integers
     *
     * @param array
     */
    public void findMaxProductPair(int[] array) {

        if (array.length <2){
            System.out.println("There is no enough element to form pair");
        }

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MAX_VALUE;
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int num : array) {
            if (num > firstMax) {
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax) {
                secondMax = num;
            }

            if (num < firstMin) {
                secondMin = firstMin;
                firstMin = num;
            } else if (num < secondMin) {
                secondMin = num;
            }
        }
        String result = (firstMax * secondMax) > (firstMin * secondMin) ? firstMax + ", " + secondMax : firstMin + ", " + secondMin;
        System.out.println(" Maximum product pair is " + result);
    }
}
