package com.samiu.labuladong.cap112;

import java.util.Arrays;

public class LeetCode_370 {

    public static void main(String[] args) {
        LeetCode_370 leetCode_307 = new LeetCode_370();
        int length = 5;
        int[][] updates = new int[][]{
                {1, 3, 2},
                {2, 4, 3},
                {0, 2, -2}
        };
        System.out.println(Arrays.toString(leetCode_307.getModifiedArray(length, updates)));
    }

    public int[] getModifiedArray(int length, int[][] updates) {
        // nums 初始化为全 0
        int[] nums = new int[length];
        // 构造差分解法
        Difference df = new Difference(nums);
        for (int[] update : updates) {
            int i = update[0];
            int j = update[1];
            int val = update[2];
            df.increment(i, j, val);
        }
        return df.result();
    }
}
