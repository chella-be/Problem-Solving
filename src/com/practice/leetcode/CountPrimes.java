package com.practice.leetcode;

public class CountPrimes {

    public static int countPrimes(int n) {

        int count = 0;
        boolean[] prime = new boolean[n + 1];

        for (int i = 0; i <= n; i++) {
            prime[i] = true;
        }

        for (int i = 2; i * i < n; i++) {
            for (int j = i; i * j < n; j++) {
                prime[i * j] = false;
            }
        }

        for (int i = 2; i < n; i++) {
            if (prime[i]) count++;
        }

        return count;
    }
}
