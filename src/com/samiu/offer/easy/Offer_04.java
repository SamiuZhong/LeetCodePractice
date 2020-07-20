package com.samiu.offer.easy;

/**
 * 剑指Offer 04：https://leetcode-cn.com/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof/
 *
 * @author Samiu 2020/7/21
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public class Offer_04 {

    public static void main(String[] args) {
        Offer_04 offer_04 = new Offer_04();
        int[][] matrix = new int[][]{
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        System.out.println(offer_04.findNumberIn2DArray(matrix, 5));
    }

    /**
     * 时间复杂度 O(m*n)
     * 空间复杂度 O(1)
     *
     * @param matrix
     * @param target
     * @return
     */
    private boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return false;

        int rows = matrix.length;
        int columns = matrix[0].length;
        int row = 0, column = columns - 1;
        while (row < rows && column >= 0) {
            int num = matrix[row][column];
            if (num == target)
                return true;
            else if (num > target)
                column--;
            else
                row++;
        }
        return false;
    }
}
