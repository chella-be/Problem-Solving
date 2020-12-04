package com.practice.free;

public class CrossWord {

    /**
     * Method to print the word by cross diagonally. If the input is Geeks, then the output will be
     * G   s
     *  e k
     *   e
     *  e k
     * G   s
     *
     * @param input any string
     * @param low   lowest index of the currently processed string
     * @param high  highest index of the currently processed string
     */
    public void printCross(String input, int low, int high) {
        System.out.println();
        if (low > high) return;
        for (int i = 0; i < input.length(); i++) {
            if (i == low || i == high) System.out.print(input.charAt(i));
            else System.out.print(" ");
        }
        printCross(input, low + 1, high - 1);
        if (low == high) return;
        for (int i = 0; i < input.length(); i++) {
            if (i == low || i == high) System.out.print(input.charAt(i));
            else System.out.print(" ");
        }
        System.out.println();
    }
}
