package com.practice.hackerrank;

public class KarprekNumberModified {

    static void kaprekarNumbers(int p, int q) {

        boolean isContain = false;

        for (long i = p; i <= q; i++) {

            long num = i * i;

            long l = 0, r;
            String temp = num + "";
            if (temp.length() >= 2) {
                l = Long.parseLong(temp.substring(0, temp.length() / 2));
                r = Long.parseLong(temp.substring(temp.length() / 2));
            } else {
                r = num;
            }

            if (l + r == i) {
                System.out.print(i+" ");
                isContain = true;
            }
        }

        if (!isContain) {
            System.out.println("INVALID RANGE");
        }

    }

}
