package com.samiu.offer.medium;

/**
 * 剑指Offer 16：数值的整数次方
 * https://leetcode-cn.com/problems/shu-zhi-de-zheng-shu-ci-fang-lcof/
 *
 * @author Samiu 2020/7/23
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public class Offer_16 {

    public static void main(String[] args) {
        Offer_16 offer_16 = new Offer_16();
        System.out.println(offer_16.myPow(2.0, -2));
    }

    private double myPow(double x, int n) {
        if (x == 0) return 0;

        long b = n;
        double res = 1.0;

        if (b < 0) {
            b = -b;
            x = 1 / x;
        }

        while (b > 0) {
            if ((b & 1) == 1)
                res *= x;
            x *= x;
            b >>= 1;
        }
        return res;
    }
}
