package com.practice.ctci;

public class Rotate90Degree {

    //1.7
    public static void rotate90Degree(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array[i].length; j++) {
                swap(array, i, j);
            }
        }
    }

    private static void swap(int[][] array, int i, int j) {
        int temp = array[i][j];
        array[i][j] = array[j][i];
        array[j][i] = temp;
    }

}
