package com.practice.hackerrank;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class GameOfThrones {

    static String gameOfThrones(String s) {

        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                int count = map.get(c);
                map.put(c, ++count);
            } else {
                map.put(c, 1);
            }
        }

        boolean isEven = s.length() % 2 == 0;

        Iterator<Character> iterator = map.keySet().iterator();

        if (isEven) {
            while (iterator.hasNext()) {
                if (map.get(iterator.next()) % 2 != 0) {
                    return "NO";
                }
            }
        } else {
            int more = 0;
            while (iterator.hasNext()) {
                if (map.get(iterator.next()) <= 1) {
                    more++;
                    if (more > 1) {
                        return "NO";
                    }
                }
            }
        }


        return "YES";
    }
}
