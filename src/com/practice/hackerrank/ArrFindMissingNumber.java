package com.practice.hackerrank;

public class ArrFindMissingNumber {

    //If its not sorted
    private static int findMissingNum(int[] arr) {

        int total = 0;
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            total += num;
            if (max < num) {
                max = num;
            }
        }

        int sum = (max * (max + 1)) / 2;

        return sum - total;
    }

    //If its sorted
    private static int find(int[] arr) {

        int a = 0;
        int b = arr.length - 1;
        int mid = 0;
        while ((b - a) > 1) {
            mid = (a + b) / 2;
            if ((arr[a] - a) != (arr[mid] - mid)) {
                b = mid;
            } else if ((arr[mid] - mid) != (arr[b] - b)) {
                a = mid;
            }
        }

        return arr[mid] + 1;
    }

}
