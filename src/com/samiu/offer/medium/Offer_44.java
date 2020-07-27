package com.samiu.offer.medium;

/**
 * 剑指Offer 44：https://leetcode-cn.com/problems/shu-zi-xu-lie-zhong-mou-yi-wei-de-shu-zi-lcof/
 *
 * @author Samiu 2020/7/25
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public class Offer_44 {

    private int findNthDigit(int n) {
        int digit = 1;
        long start = 1;
        long count = 9;
        while (n > count) {
            n -= count;
            digit += 1;
            start *= 10;
            count = digit * start * 9;
        }
        long num = start + (n - 1) / digit;
        return Long.toString(num).charAt(n - 1) & digit - '0';
    }
}
