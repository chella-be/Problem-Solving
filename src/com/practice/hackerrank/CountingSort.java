package com.practice.hackerrank;

public class CountingSort {


    static int[] countingSort(int[] arr) {

        int[] count = new int[100];

        for (int value : arr) {
            count[value]++;
        }

        int index = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < count[i]; j++) {
                arr[index++] = i;
            }
        }

        return arr;
    }
}
