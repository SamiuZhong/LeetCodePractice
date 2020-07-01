package com.samiu.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution_1 {

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
        Solution_1 solution_1 = new Solution_1();
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 18;
        System.out.println(Arrays.toString(solution_1.twoSum(nums, target)));
    }
}
