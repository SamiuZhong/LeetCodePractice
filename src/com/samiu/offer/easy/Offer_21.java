package com.samiu.offer.easy;

import com.samiu.structure.Fun;

import java.util.Arrays;

/**
 * 剑指Offer 21：https://leetcode-cn.com/problems/diao-zheng-shu-zu-shun-xu-shi-qi-shu-wei-yu-ou-shu-qian-mian-lcof/
 *
 * @author Samiu 2020/7/23
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public class Offer_21 {

    public static void main(String[] args) {
        Offer_21 offer_21 = new Offer_21();
        int[] array = new int[]{9, 9, 14, 1, 2, 12, 8, 14, 7, 20};
        System.out.println(Arrays.toString(offer_21.exchange(array)));
        System.out.println(Arrays.toString(offer_21.exchange2(array)));
    }

    /**
     * 首尾双指针
     *
     * @param nums
     * @return
     */
    private int[] exchange(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            while (left < right && Fun.isOdd(nums[left]))
                left++;
            while (left < right && !Fun.isOdd(nums[right]))
                right--;
            if (left < right) {
                Fun.swap(nums, left++, right--);
            }
        }
        return nums;
    }

    /**
     * 快慢双指针
     *
     * @param nums
     * @return
     */
    private int[] exchange2(int[] nums) {
        int pre = 0, cur = 1;
        while (pre < cur && cur < nums.length) {
            while (cur < nums.length && !Fun.isOdd(nums[cur]))
                cur++;
            while (pre < cur && Fun.isOdd(nums[pre]))
                pre++;
            if (cur < nums.length) {
                Fun.swap(nums, pre, cur);
                pre++;
                cur++;
            }
        }
        return nums;
    }
}
