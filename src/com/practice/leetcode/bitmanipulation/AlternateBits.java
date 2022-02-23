package com.practice.leetcode.bitmanipulation;

/**
 * 693. Binary Number with Alternating Bits
 */
public class AlternateBits {
    public boolean hasAlternatingBits(int n) {
        byte nextBit = (byte) ((n&1) ==1?0:1);
        n>>=1;
        while (n!=0){
            if ((n&1)==nextBit){
                nextBit = (byte) ((n&1)==1?0:1);
                n>>=1;
            } else {
                return false;
            }
        }
       return true;
    }
}
