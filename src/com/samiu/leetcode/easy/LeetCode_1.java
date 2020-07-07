package com.samiu.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Samiu 2020/7/1
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public class LeetCode_1 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]))
                return new int[]{
                        map.get(target - nums[i]), i
                };
            else
                map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        LeetCode_1 leetCode_1 = new LeetCode_1();
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 18;
        System.out.println(Arrays.toString(leetCode_1.twoSum(nums, target)));
    }
}
