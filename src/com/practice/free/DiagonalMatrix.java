package com.practice.free;

public class DiagonalMatrix {

    /**
     * Print the matrix diagonally
     * input :
     * 1   2   3   4   5
     * 6   7   8   9   10
     * 11  12  13  14  15
     * <p>
     * output:
     * 1
     * 6 2
     * 11 7 3
     * 12 8 4
     * 13 9 5
     * 14 10
     * 15
     *
     * @param array integer array
     */
    public void printDiagonal(int[][] array) {
        int row = 0;
        int column = 0;
        while (row >= 0) {
            for (int j = column, i = row; i >= 0 && j < array[0].length; j++, i--) {
                System.out.print(array[i][j] + " \t");
            }
            row++;
            if (row >= array.length) {
                row = array.length - 1;
                column++;
            }

            if (column >= array[0].length) break;
        }
    }
}
