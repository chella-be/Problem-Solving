package com.practice.hackerrank;

public class JumpingOnClouds {

    static int jumpingOnClouds(int[] c) {

        int count = 0;
        int i = 0;
        while (i < c.length - 1) {

            if (i + 2 < c.length && c[i + 2] != 1) {
                count++;
                i += 2;
            } else if (i + 1 < c.length && c[i + 1] != 1) {
                count++;
                i++;
            }

        }

        return count;
    }
}
