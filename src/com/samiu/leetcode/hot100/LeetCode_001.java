package com.samiu.leetcode.hot100;

import java.util.HashMap;

public class LeetCode_001 {

    private final HashMap<Integer, Integer> map = new HashMap<>();

    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int compute = target - nums[i];
            if (map.containsKey(compute)) {
                res[0] = map.get(compute);
                res[1] = i;
                return res;
            }
            map.put(nums[i], i);
        }
        return res;
    }
}
