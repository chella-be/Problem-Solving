package com.practice.hackerrank;

public class QuickSort {

    public static int[] quickSort(int[] arr, int low, int high) {

        if (low < high) {
            int j = partition(arr, low, high);
            quickSort(arr, low, j - 1);
            quickSort(arr, j + 1, high);
        }

        return arr;
    }

    private static int partition(int[] arr, int low, int high) {

        int index = low;
        int pivot = arr[high];

        for (int i = low; i < high; i++) {
            if (arr[i] <= pivot) {
                swap(arr, index, i);
                index++;
            }
        }

        swap(arr, index, high);

        return index;
    }

    private static void swap(int[] arr, int i, int j) {
        int swap = arr[i];
        arr[i] = arr[j];
        arr[j] = swap;
    }
}
