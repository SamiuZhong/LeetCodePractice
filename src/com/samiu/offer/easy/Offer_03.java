package com.samiu.offer.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 剑指Offer 03：https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/
 *
 * @author Samiu 2020/7/21
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public class Offer_03 {

    public static void main(String[] args) {
        Offer_03 offer_03 = new Offer_03();
        int[] array = new int[]{2, 3, 1, 0, 2, 5, 3};
        System.out.println(offer_03.findRepeatNumber(array));
    }

    /**
     * 时间复杂度 O(n)
     * 空间复杂度 O(n)
     *
     * @param nums
     * @return
     */
    private int findRepeatNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        int result = 0;
        for (int i = 0; i < nums.length; i++)
            if (map.containsKey(nums[i])) {
                result = nums[i];
                break;
            } else map.put(nums[i], i);
        return result;
    }
}