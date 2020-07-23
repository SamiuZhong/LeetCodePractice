package com.samiu.offer.medium;

/**
 * 剑指Offer 14：https://leetcode-cn.com/problems/jian-sheng-zi-lcof/
 *
 * @author Samiu 2020/7/23
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public class Offer_14 {

    public static void main(String[] args) {
        Offer_14 offer_14 = new Offer_14();
        System.out.println(offer_14.cuttingRope(5));
    }

    private int cuttingRope(int n) {
        if (n <= 3)
            return n - 1;
        int a = n / 3, b = n % 3;
        if (b == 0)
            return (int) Math.pow(3, a);
        else if (b == 1)
            return (int) (Math.pow(3, a - 1) * 4);
        else
            return (int) (Math.pow(3, a) * 2);
    }
}
