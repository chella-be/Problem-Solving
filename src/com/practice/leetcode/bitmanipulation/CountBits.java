package com.practice.leetcode.bitmanipulation;

/**
 * Problem : 338. Counting Bits
 */
public class CountBits {

    public static int[] countBits(int n) {
        int[] result = new int[n+1];
        for (int i =0,j=0;i<=n;i++){
            result[j++]=countBitsForGivenNumber(i);
        }
        return result;
    }

    private static int countBitsForGivenNumber(int num){
        int count = 0;
        while (num!=0){
            if ((num&1)==1) count++;
            num >>=1;
        }
        return count;
    }

    public static int[] countBitOptimize(int n){
        if (n==0) return new int[]{0};
        if (n==1) return new int[]{0,1};
        int[] result = new int[n+1];

        result[0] = 0;
        result[1] = 1;
        for (int i=2;i<=n;i++){
            int idx = i>>1;
            result[i] = (i&1)==0?result[idx]:1+result[idx];
        }
        return result;
    }
}
