package com.samiu.offer.easy;

/**
 * 剑指Offer 11：https://leetcode-cn.com/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof/
 *
 * @author Samiu 2020/7/21
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public class Offer_11 {

    public static void main(String[] args) {
        Offer_11 offer_11 = new Offer_11();
        int[] array = new int[]{3, 4, 5, 1, 2};
        System.out.println(offer_11.minArray(array));
    }

    private int minArray(int[] numbers) {
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            int m = (i + j) / 2;
            if (numbers[m] > numbers[j])
                i = m + 1;
            else if (numbers[m] < numbers[j])
                j = m;
            else
                j--;
        }
        return numbers[i];
    }
}
