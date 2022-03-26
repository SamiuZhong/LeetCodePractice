package com.samiu.review;

import java.util.HashMap;

class Solution {

    public boolean canPartitionKSubsets(int[] nums, int k) {
        if (k > nums.length) return false;
        int sum = 0;
        for (int v : nums) sum += v;
        if (sum % k != 0) return false;

        int used = 0;
        int target = sum / k;
        return backtrack(k, 0, nums, 0, used, target);
    }

    private final HashMap<Integer, Boolean> map = new HashMap<>();

    private boolean backtrack(int k, int bucketSum, int[] nums, int start, int used, int target) {
        if (k == 0) return true;
        if (bucketSum == target) {
            boolean res = backtrack(k - 1, 0, nums, 0, used, target);
            map.put(used, res);
            return res;
        }

        if (map.containsKey(used))
            return map.get(used);

        for (int i = start; i < nums.length; i++) {
            if (((used >> i) & 1) == 1) continue;
            if (nums[i] + bucketSum > target) continue;

            used |= 1 << i;
            bucketSum += nums[i];
            if (backtrack(k, bucketSum, nums, i + 1, used, target))
                return true;
            used ^= 1 << i;
            bucketSum -= nums[i];
        }
        return false;
    }
}