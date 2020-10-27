package com.practice.ctci;

public class UniqueCharacterString {


    //CTCI 1.1
    public static boolean hasUniqueCharacters(String string) {

        int flag = 0;
        char[] chars = string.toCharArray();

        for (char c : chars) {
            int val = c - 'a';

            if ((flag & (1 << val)) > 0) {
                return false;
            }

            flag |= (1 << val);
        }

        return true;

    }
}
