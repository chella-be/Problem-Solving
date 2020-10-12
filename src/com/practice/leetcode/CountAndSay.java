package com.practice.leetcode;

public class CountAndSay {
    public static String countAndSay(int n) {

        if (n <= 0) {
            return null;
        }

        String str = "1";
        String result = str;

        int i = 1;
        int count;
        while (i < n) {
            StringBuilder builder = new StringBuilder();
            str = result;
            count = 1;
            int j;
            for (j = 1; j < str.length(); j++) {
                if (str.charAt(j) == str.charAt(j - 1)) {
                    count++;
                } else {
                    builder.append(count);
                    builder.append(str.charAt(j - 1));
                    count = 1;
                }
            }
            builder.append(count);
            builder.append(str.charAt(j - 1));
            result = builder.toString();
            i++;
        }

        return result;
    }
}
