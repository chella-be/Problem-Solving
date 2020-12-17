package com.practice.free;

import java.util.HashMap;
import java.util.Map;

public class IntToHex {

    public String intToHex(int num) {
        Map<Integer, Character> map = new HashMap<>();
        char number = '0';
        char character = 'a';
        for (int i = 0; i <= 15; i++) {
            if (i < 10) {
                map.put(i, number++);
            } else {
                map.put(i, character++);
            }
        }

        StringBuilder builder = new StringBuilder();
        if (num > 0) {
            while (num != 0) {
                builder.append(map.get(num % 16));
                num /= 16;
            }
        }
        return builder.toString();
    }

}
