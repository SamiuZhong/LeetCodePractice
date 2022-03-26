package com.samiu.labuladong.cap313;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LeetCode_47 {

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        used = new boolean[nums.length];
        backtrack(nums);
        return lists;
    }

    private final List<List<Integer>> lists = new LinkedList<>();
    private final LinkedList<Integer> track = new LinkedList<>();
    private boolean[] used;

    private void backtrack(int[] nums) {
        if (track.size() == nums.length) {
            lists.add(new LinkedList<>(track));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])
                continue;
            track.add(nums[i]);
            used[i] = true;
            backtrack(nums);
            track.removeLast();
            used[i] = false;
        }
    }
}
