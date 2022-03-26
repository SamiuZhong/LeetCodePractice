package com.samiu.labuladong.cap311;

import java.util.LinkedList;
import java.util.List;

public class LeetCode_46 {

    public List<List<Integer>> permute(int[] nums) {
        LinkedList<Integer> track = new LinkedList<>();
        backtrack(nums, track);
        return lists;
    }

    private final List<List<Integer>> lists = new LinkedList<>();

    private void backtrack(int[] nums, LinkedList<Integer> track) {
        if (track.size() == nums.length) {
            lists.add(new LinkedList<>(track));
            return;
        }

        for (int num : nums) {
            if (track.contains(num))
                continue;
            track.add(num);
            backtrack(nums, track);
            track.removeLast();
        }
    }
}
