package com.samiu.labuladong.cap313;

import java.util.LinkedList;
import java.util.List;

public class LeetCode_77 {

    public List<List<Integer>> combine(int n, int k) {
        backtrack(1, n, k);
        return lists;
    }

    private final List<List<Integer>> lists = new LinkedList<>();
    private final LinkedList<Integer> track = new LinkedList<>();

    private void backtrack(int start, int n, int k) {
        if (k == track.size()) {
            lists.add(new LinkedList<>(track));
            return;
        }

        for (int i = start; i <= n; i++) {
            track.addLast(i);
            backtrack(i + 1, n, k);
            track.removeLast();
        }
    }
}
