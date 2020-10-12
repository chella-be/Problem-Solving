package com.practice.leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {


    public boolean wordPattern(String pattern, String str) {

        char[] chars = pattern.toCharArray();
        String[] strArray = str.split(" ");
        if (chars.length != strArray.length) return false;

        Map<Character, String> map = new HashMap<>();

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (map.containsKey(c) || map.containsValue(strArray[i])) {
                if (map.get(c) == null || !map.get(c).equals(strArray[i])) return false;
            } else {
                map.put(c, strArray[i]);
            }
        }

        return true;
    }

}
