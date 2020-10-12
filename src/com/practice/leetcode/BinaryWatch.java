package com.practice.leetcode;

import java.util.ArrayList;
import java.util.List;

public class BinaryWatch {

    public static List<String> readBinaryWatch(int num) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 60; j++) {
                if (Integer.bitCount(i) + Integer.bitCount(j) == num) {
                    if (j < 10) {
                        list.add(String.format("%d:0%d", i, j));
                    } else {
                        list.add(String.format("%d:%d", i, j));
                    }
                }
            }
        }

        return list;
    }
}
