package com.practice.leetcode.array;

public class MergeTwoSortedArrays {

    /*
    Input:
    nums1 = [1,2,3,0,0,0], m = 3
    nums2 = [2,5,6],       n = 3

    Output: [1,2,2,3,5,6]
     */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;
        int j = n - 1;
        int end = nums1.length - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] >= nums2[j]) {
                nums1[end--] = nums1[i--];
            } else {
                nums1[end--] = nums2[j--];
            }
        }
        while (j >= 0) {
            nums1[end--] = nums2[j--];
        }
    }
}
