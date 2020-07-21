package com.samiu.offer.easy;

/**
 * 剑指Offer 10：https://leetcode-cn.com/problems/qing-wa-tiao-tai-jie-wen-ti-lcof/
 *
 * @author Samiu 2020/7/21
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public class Offer_10 {

    public static void main(String[] args) {
        Offer_10 offer_10 = new Offer_10();
        int n = 2;
        System.out.println(offer_10.numWays(n));
    }

    /**
     * 动态规划
     * 时间复杂度 O(n)
     * 空间复杂度 O(1)
     *
     * @param n
     * @return
     */
    private int numWays(int n) {
        if (n < 2)
            return 1;
        else {
            int i = 1, j = 1;
            while (n-- >= 2) {
                j = i + j;
                i = j - i;
            }
            return j;
        }
    }
}
