package com.samiu.offer.easy;

/**
 * 剑指Offer 42：https://leetcode-cn.com/problems/lian-xu-zi-shu-zu-de-zui-da-he-lcof/
 *
 * @author Samiu 2020/7/25
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public class Offer_42 {

    private int maxSubArray(int[] nums) {
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i] += Math.max(nums[i - 1], 0);
            res = Math.max(res, nums[i]);
        }
        return res;
    }
}
