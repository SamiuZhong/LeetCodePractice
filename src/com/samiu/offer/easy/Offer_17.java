package com.samiu.offer.easy;

import java.util.Arrays;

/**
 * 剑指Offer 17：打印从1到最大的n位数
 * https://leetcode-cn.com/problems/da-yin-cong-1dao-zui-da-de-nwei-shu-lcof/
 *
 * @author Samiu 2020/7/23
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public class Offer_17 {

    public static void main(String[] args) {
        Offer_17 offer_17 = new Offer_17();
        System.out.println(Arrays.toString(offer_17.printNumbers(5)));
    }

    private int[] printNumbers(int n) {
        int end = (int) Math.pow(10, n) - 1;
        int[] res = new int[end];
        for (int i = 0; i < end; i++) {
            res[i] = i + 1;
        }
        return res;
    }
}
