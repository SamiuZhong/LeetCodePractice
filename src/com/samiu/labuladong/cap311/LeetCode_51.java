package com.samiu.labuladong.cap311;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_51 {

    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for (char[] c : board)
            Arrays.fill(c, '.');
        backtrack(board, 0);
        return lists;
    }

    private final List<List<String>> lists = new ArrayList<>();

    private void backtrack(char[][] board, int row) {
        if (row == board.length) {
            lists.add(chatToList(board));
            return;
        }

        int length = board[row].length;
        for (int col = 0; col < length; col++) {
            if (!isValid(board, row, col))
                continue;
            board[row][col] = 'Q';
            backtrack(board, row + 1);
            board[row][col] = '.';
        }
    }

    private boolean isValid(char[][] board, int row, int col) {
        int length = board.length;
        // 检查列（正上方）否有皇后冲突
        for (int i = 0; i < length; i++)
            if (board[i][col] == 'Q')
                return false;

        // 检查左上方（左斜）是否有皇后冲突
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 'Q')
                return false;

        // 检查右上方（右斜）是否有皇后冲突
        for (int i = row - 1, j = col + 1; i >= 0 && j < length; i--, j++)
            if (board[i][j] == 'Q')
                return false;

        return true;
    }

    private List<String> chatToList(char[][] board) {
        List<String> list = new ArrayList<>();
        for (char[] c : board)
            list.add(String.copyValueOf(c));
        return list;
    }
}
