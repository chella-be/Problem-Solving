package com.practice.leetcode.array;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {

    public static boolean isValidSudoku(char[][] board) {

        Set<String> set = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                if (board[i][j] == '.') continue;

                if (!set.contains(board[i][j] + "row" + i)) {
                    set.add(board[i][j] + "row" + i);
                } else return false;

                if (!set.contains(board[i][j] + "col" + j)) {
                    set.add(board[i][j] + "col" + j);
                } else return false;

                int square = 3 * (i / 3) + j / 3;
                if (!set.contains(board[i][j] + "square" + square)) {
                    set.add(board[i][j] + "square" + square);
                } else return false;

            }
        }

        return true;
    }

}
