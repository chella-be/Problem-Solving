package com.practice.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class ArrUnionIntersection {

    private static int[] union(int[] arr1, int[] arr2) {

        int i = 0;
        int j = 0;
        int n = arr1.length;
        int m = arr2.length;
        List<Integer> unionList = new ArrayList<>();

        while (i < n && j < m) {
            if (arr1[i] == arr2[j]) {
                unionList.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] > arr2[j]) {
                unionList.add(arr2[j]);
                j++;
            } else {
                unionList.add(arr1[i]);
                i++;
            }
        }

        while (i < n) {
            unionList.add(arr2[i]);
            i++;
        }
        while (j < m) {
            unionList.add(arr2[j]);
            j++;
        }

        return unionList.stream().mapToInt(Integer::intValue).toArray();

    }

    private static int[] intersection(int[] arr1, int[] arr2) {

        int i = 0;
        int j = 0;
        int n = arr1.length;
        int m = arr2.length;

        List<Integer> intersectionList = new ArrayList<>();

        while (i < n && j < m) {
            if (arr1[i] == arr2[j]) {
                intersectionList.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }

        return intersectionList.stream().mapToInt(Integer::intValue).toArray();

    }

}
