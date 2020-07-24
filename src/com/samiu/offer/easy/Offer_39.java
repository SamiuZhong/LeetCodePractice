package com.samiu.offer.easy;

import java.util.HashMap;

/**
 * 剑指Offer 39：https://leetcode-cn.com/problems/shu-zu-zhong-chu-xian-ci-shu-chao-guo-yi-ban-de-shu-zi-lcof/
 *
 * @author Samiu 2020/7/24
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public class Offer_39 {

    /**
     * HashMap统计法
     * 时间复杂度 O(n)
     * 空间复杂度 O(n)
     *
     * @param nums
     * @return
     */
    private int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int res = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int count = map.get(nums[i]);
                if (++count > nums.length >> 1) {
                    res = nums[i];
                    break;
                } else
                    map.put(nums[i], count);
            } else
                map.put(nums[i], 1);
        }
        return res;
    }

    /**
     * 摩尔投票法
     * 时间复杂度 O(n)
     * 空间复杂度 O(1)
     *
     * @param nums
     * @return
     */
    private int majorityElement2(int[] nums) {
        int x = 0, votes = 0, count = 0;
        for (int num : nums) {
            if (votes == 0)
                x = num;
            votes += num == x ? 1 : -1;
        }
        for (int num : nums)
            if (num == x)
                count++;
        return count > nums.length >> 1 ? x : 0;
    }
}
