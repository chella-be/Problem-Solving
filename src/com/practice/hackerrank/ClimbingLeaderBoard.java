package com.practice.hackerrank;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.binarySearch;
import static java.util.stream.IntStream.range;

public class ClimbingLeaderBoard {

    public static int[] climbingLeaderboard(int[] scores, int n, int[] alice) {

        List<Integer> integers = new ArrayList<>();
        int[] array = range(0, n).map(i -> scores[n - i - 1]).distinct().toArray();
        int index = 0;
        for (int score : alice) {
            index = binarySearch(array, index < 0 ? 0 : index, array.length, score);
            if (index < 0) index = -index - 2;
            integers.add(array.length - index);
        }

        return integers.stream().mapToInt(Integer::intValue).toArray();
    }

}
