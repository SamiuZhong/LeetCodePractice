package com.samiu.leetcode.medium;

import java.util.Arrays;

/**
 * 分类：动态规划
 * 零钱兑换：https://leetcode-cn.com/problems/coin-change/
 *
 * @author Samiu 2020/7/17
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public class LeetCode_322 {

    public static void main(String[] args) {
        LeetCode_322 leetCode_322 = new LeetCode_322();
        int[] coins = new int[]{1, 2, 5};
        int amount = 11;
        System.out.println(leetCode_322.coinChange(coins, amount));
    }

    /**
     * 时间复杂度 O(S*n)
     * 空间复杂度 O(S)
     *
     * @param coins
     * @param amount
     * @return
     */
    private int coinChange(int[] coins, int amount) {
        int max = amount + 1;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, max);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
}