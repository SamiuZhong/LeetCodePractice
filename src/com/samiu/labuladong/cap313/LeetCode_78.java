package com.samiu.labuladong.cap313;

import java.util.LinkedList;
import java.util.List;

public class LeetCode_78 {

    public List<List<Integer>> subsets(int[] nums) {
        backtrack(nums, 0);
        return lists;
    }

    private final List<List<Integer>> lists = new LinkedList<>();
    private final LinkedList<Integer> track = new LinkedList<>();

    private void backtrack(int[] nums, int start) {
        lists.add(new LinkedList<>(track));

        for (int i = start; i < nums.length; i++) {
            track.addLast(nums[i]);
            backtrack(nums, i + 1);
            track.removeLast();
        }
    }
}
