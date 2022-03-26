package com.samiu.labuladong.cap313;

import java.util.LinkedList;
import java.util.List;

public class LeetCode_39 {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (candidates.length == 0) return lists;
        backtrack(candidates, 0, target);
        return lists;
    }

    private final List<List<Integer>> lists = new LinkedList<>();
    private final LinkedList<Integer> track = new LinkedList<>();
    private int trackSum = 0;

    private void backtrack(int[] nums, int start, int target) {
        if (trackSum == target) {
            lists.add(new LinkedList<>(track));
            return;
        }
        if (trackSum > target) return;
        for (int i = start; i < nums.length; i++) {
            trackSum += nums[i];
            track.add(nums[i]);
            backtrack(nums, i, target);
            trackSum -= nums[i];
            track.removeLast();
        }
    }
}
