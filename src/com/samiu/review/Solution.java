package com.samiu.review;

import com.samiu.structure.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {


    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        travers(root);
        return list;
    }

    private HashMap<String, Integer> memoMap = new HashMap<>();
    private List<TreeNode> list = new ArrayList<>();

    private String travers(TreeNode root) {
        if (root == null) {
            return "#";
        }

        String left = travers(root.left);
        String right = travers(root.right);
        String subTree = left + "," + right + "," + root.val;

        if (memoMap.getOrDefault(subTree, 0) == 1) {
            list.add(root);
        }
        memoMap.put(subTree, memoMap.getOrDefault(subTree, 0) + 1);
        return subTree;
    }

}