package com.practice.hackerrank;

public class TaumAndBday {

    public static long taumBday(int b, int w, int bc, int wc, int z) {

        long res;
        if (bc > wc && (wc + z) < bc) {
            res = (b * wc) + (w * wc) + (b * z);
        } else if (wc > bc && (bc + z) < wc) {
            res = (b * bc) + (w * bc) + (w * z);
        } else {
            res = (b * bc) + (w * wc);
        }

        return res;
    }
}
