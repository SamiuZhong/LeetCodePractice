package com.samiu.labuladong.cap231;

import java.util.LinkedList;
import java.util.List;

public class LeetCode_797 {

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        LinkedList<Integer> path = new LinkedList<>();
        traverse(graph, 0, path);
        return lists;
    }

    private final List<List<Integer>> lists = new LinkedList<>();

    private void traverse(int[][] graph, int s, LinkedList<Integer> path) {
        path.addLast(s);

        int n = graph.length;
        if (s == n - 1) {
            lists.add(new LinkedList<>(path));
            path.removeLast();
            return;
        }

        for (int v : graph[s]) {
            traverse(graph, v, path);
        }

        path.removeLast();
    }
}
