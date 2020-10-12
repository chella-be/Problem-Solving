package com.practice.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();

        if (numRows <= 0) return result;

        List<Integer> first = new ArrayList<>();
        first.add(1);
        result.add(first);

        for (int i = 1; i < numRows; i++) {
            List<Integer> current = new ArrayList<>();
            List<Integer> prev = result.get(i - 1);

            current.add(1);
            for (int j = 1; i < prev.size(); j++) {
                current.add(prev.get(j - 1) + prev.get(j));
            }
            current.add(1);
            result.add(current);
        }

        return result;
    }

    public static List<Integer> getRow(int rowIndex) {

        List<Integer> first = new ArrayList<>();
        first.add(1);

        if (rowIndex <= 0) return first;



        List<Integer> prev = first;
        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> current = new ArrayList<>();

            current.add(1);
            for (int j = 1; j < prev.size(); j++) {
                current.add(prev.get(j - 1) + prev.get(j));
            }
            current.add(1);
            prev = current;
        }

        return prev;
    }
}
