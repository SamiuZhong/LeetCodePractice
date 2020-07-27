package com.samiu.offer.easy;

/**
 * 剑指Offer 15：二进制中1的个数
 * https://leetcode-cn.com/problems/er-jin-zhi-zhong-1de-ge-shu-lcof/
 *
 * @author Samiu 2020/7/22
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public class Offer_15 {

    public static void main(String[] args) {
        Offer_15 offer_15 = new Offer_15();
    }

    /**
     * 位运算
     * 时间复杂度 O(logn)
     *
     * @param n
     * @return
     */
    private int hammingWeight(int n) {
        int res = 0;
        while (n != 0) {
            res += n & 1;
            n >>>= 1;
        }
        return res;
    }

    /**
     * 时间复杂度 O(M)
     *
     * @param n
     * @return
     */
    private int hammingWeight2(int n) {
        int res = 0;
        while (n != 0) {
            res++;
            n &= n - 1;
        }
        return res;
    }
}
