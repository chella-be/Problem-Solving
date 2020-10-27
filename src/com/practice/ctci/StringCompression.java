package com.practice.ctci;

public class StringCompression {

    //1.6
    public static String stringCompression(String input) {
        StringBuilder builder = new StringBuilder();
        int count = 1;
        char[] array = input.toCharArray();
        for (int i = 0; i + 1 < input.length(); i++) {
            if (array[i] != array[i + 1]) {
                builder.append(array[i]).append(count);
                count = 1;
            } else {
                count++;
            }
        }
        builder.append(array[array.length - 1]).append(count);
        return builder.toString();
    }
}
