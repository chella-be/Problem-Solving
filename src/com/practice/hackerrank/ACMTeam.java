package com.practice.hackerrank;

import java.math.BigInteger;

public class ACMTeam {

    static int[] acmTeam(String[] topic) {

        int max = 0;
        int count = 0;
        for (int i = 0; i < topic.length; i++) {
            for (int j = i + 1; j < topic.length; j++) {
                BigInteger num1 = new BigInteger(topic[i], 2);
                BigInteger num2 = new BigInteger(topic[j], 2);
                BigInteger result = num1.or(num2);
                int temp = result.bitCount();

                if (temp > max) {
                    max = temp;
                    count = 1;
                } else if (max == temp) {
                    count++;
                }
            }
        }

        return new int[]{max, count};
    }

}
