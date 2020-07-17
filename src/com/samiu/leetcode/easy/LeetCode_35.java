package com.samiu.leetcode.easy;

/**
 * 分类：树
 * 搜索插入位置：https://leetcode-cn.com/problems/search-insert-position/
 *
 * @author Samiu 2020/7/17
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public class LeetCode_35 {

    public static void main(String[] args) {
        LeetCode_35 leetCode_35 = new LeetCode_35();
        int[] ints = new int[]{1, 3, 5, 6};
        int target = 5;
        System.out.println(leetCode_35.searchInsert(ints, target));
    }

    /**
     * 二分查找
     * 时间复杂度 O(logn)
     * 空间复杂度 O(1)
     *
     * @param nums
     * @param target
     * @return
     */
    private int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int left = 0, right = n - 1, ans = n;
        while (left <= right) {
            int mid = ((right - left) >> 1) + left;
            if (target <= nums[mid]) {
                ans = mid;
                right = right = mid - 1;
            } else
                left = mid + 1;
        }
        return ans;
    }
}
