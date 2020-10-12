package com.practice.hackerrank;

public class CommonChild {

    static int commonChild(String s1, String s2) {

        int n = s1.length();
        int[] track = new int[n + 1];

        char[] first = s1.toCharArray();
        char[] second = s2.toCharArray();

        for (int i = 1; i <= first.length; i++) {
            int previous = 0;
            for (int j = 1; j <= second.length; j++) {
                int t = track[j];
                if (first[i - 1] == second[j - 1]) {
                    track[j] = previous + 1;
                } else {
                    track[j] = Math.max(track[j], track[j - 1]);
                }
                previous = t;
            }
        }
        return track[n];
    }
}
