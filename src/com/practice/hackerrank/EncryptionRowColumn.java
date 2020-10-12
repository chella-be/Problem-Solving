package com.practice.hackerrank;

public class EncryptionRowColumn {


    static String encryption(String s) {

        s = s.replace(" ", "");

        int length = s.length();
        int column = (int) Math.ceil(Math.sqrt(length));

        StringBuilder builder = new StringBuilder();

        int index = 0;
        for (int i = index; index < column; ) {

            builder.append(s.charAt(i));
            i += column;
            if (i >= s.length()) {
                i = ++index;
                builder.append(" ");
            }
        }

        return builder.toString();
    }

}
