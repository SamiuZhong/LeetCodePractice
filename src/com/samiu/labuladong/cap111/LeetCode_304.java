package com.samiu.labuladong.cap111;

public class LeetCode_304 {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {3, 0, 1, 4, 2},
                {5, 6, 3, 2, 1},
                {1, 2, 0, 1, 5},
                {4, 1, 0, 1, 7},
                {1, 0, 3, 0, 5}
        };
        NumMatrix numMatrix = new NumMatrix(matrix);
        numMatrix.sumRegion(2, 1, 4, 3);
        numMatrix.sumRegion(1, 1, 2, 2);
        numMatrix.sumRegion(1, 2, 2, 4);
    }

    static class NumMatrix {

        private int[][] preSum;

        public NumMatrix(int[][] matrix) {
            int m = matrix.length, n = matrix[0].length;
            if (m == 0 || n == 0) return;
            preSum = new int[m + 1][n + 1];
            for (int i = 1; i <= m; i++) {
                for (int j = 1; j <= n; j++) {
                    preSum[i][j] = preSum[i - 1][j] + preSum[i][j - 1] + matrix[i - 1][j - 1] - preSum[i - 1][j - 1];
                }
            }
        }

        public int sumRegion(int row1, int col1, int row2, int col2) {
            return preSum[row2 + 1][col2 + 1] - preSum[row1][col2 + 1] - preSum[row2 + 1][col1] + preSum[row1][col1];
        }
    }
}
