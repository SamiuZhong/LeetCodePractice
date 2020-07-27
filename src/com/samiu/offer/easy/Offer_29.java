package com.samiu.offer.easy;

/**
 * 剑指Offer 29：顺时针打印矩阵
 * https://leetcode-cn.com/problems/shun-shi-zhen-da-yin-ju-zhen-lcof/
 *
 * @author Samiu 2020/7/23
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public class Offer_29 {

    /**
     * 时间复杂度 O(mn)
     *
     * @param matrix
     * @return
     */
    private int[] spiralOrder(int[][] matrix) {
        if (matrix.length == 0)
            return new int[0];

        int left = 0, top = 0, x = 0;
        int right = matrix[0].length - 1, bottom = matrix.length - 1;
        int[] res = new int[(right + 1) * (bottom + 1)];

        while (true) {
            for (int i = left; i <= right; i++)
                res[x++] = matrix[top][i];          //left to right
            if (++top > bottom) break;

            for (int i = top; i <= bottom; i++)
                res[x++] = matrix[i][right];        //top to bottom
            if (left > --right) break;

            for (int i = right; i >= left; i--)
                res[x++] = matrix[bottom][i];       //right to left
            if (top > --bottom) break;

            for (int i = bottom; i >= top; i--)
                res[x++] = matrix[i][left];         //left to right
            if (++left > right) break;
        }
        return res;
    }
}
