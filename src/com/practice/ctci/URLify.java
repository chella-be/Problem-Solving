package com.practice.ctci;

public class URLify {

    //1.3
    public static String urlEncode(String input) {
        if (input.length() == 0) return "";
        char[] array = input.trim().toCharArray();
        StringBuilder builder = new StringBuilder();
        for (char c : array) {
            if (c == ' ') {
                builder.append("%20");
            } else {
                builder.append(c);
            }
        }
        return builder.toString();
    }
}
