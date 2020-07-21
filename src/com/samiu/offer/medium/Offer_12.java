package com.samiu.offer.medium;

/**
 * 剑指Offer 12：https://leetcode-cn.com/problems/ju-zhen-zhong-de-lu-jing-lcof/
 *
 * @author Samiu 2020/7/21
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public class Offer_12 {

    public static void main(String[] args) {
        Offer_12 offer_12 = new Offer_12();
        char[][] board = new char[][]{
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}};
        String word = "ABCCED";
        System.out.println(offer_12.exist(board, word));
    }

    /**
     * 深度优先搜索 DFS
     * 时间复杂度 O(3^k * m * n)
     * 空间复杂度 O(k)
     *
     * @param board
     * @param word
     * @return
     */
    private boolean exist(char[][] board, String word) {
        int row = board.length;
        int column = board[0].length;
        char[] words = word.toCharArray();
        for (int i = 0; i < row; i++)
            for (int j = 0; j < column; j++)
                if (dfs(board, words, i, j, 0))
                    return true;
        return false;
    }

    private boolean dfs(char[][] board, char[] word, int i, int j, int k) {
        if (i >= board.length || i < 0 | j >= board[0].length || j < 0 || board[i][j] != word[k])
            return false;
        if (k == word.length - 1)
            return true;

        char temp = board[i][j];
        board[i][j] = '/';
        boolean res = dfs(board, word, i + 1, j, k + 1) || dfs(board, word, i - 1, j, k + 1) ||
                dfs(board, word, i, j + 1, k + 1) || dfs(board, word, i, j - 1, k + 1);
        board[i][j] = temp;
        return res;
    }
}
