package com.samiu.labuladong.cap313;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LeetCode_40 {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        if (candidates.length == 0) return lists;
        Arrays.sort(candidates);
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
            if (i > start && nums[i] == nums[i - 1])
                continue;
            track.add(nums[i]);
            trackSum += nums[i];
            backtrack(nums, i + 1, target);
            track.removeLast();
            trackSum -= nums[i];
        }
    }
}
