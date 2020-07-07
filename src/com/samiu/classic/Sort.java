package com.samiu.classic;

import java.util.Arrays;

/**
 * 经典排序算法
 *
 * @author Samiu 2020/7/4
 */
public class Sort {

    public static void main(String[] args) {
        Sort sort = new Sort();
        int[] nums = new int[]{3, 5, 1, 7, 4, 8, 2, 9, 6};

//        sort.bubbleSort(nums);
//        sort.insertionSort(nums);
//        sort.mergeSort(nums, 0, nums.length - 1);
        sort.quickSort(nums, 0, nums.length - 1);

        System.out.println(Arrays.toString(nums));
    }

    /**
     * 冒泡排序
     * 时间复杂度 O(n^2)
     * 空间复杂度 O(1)
     *
     * @param nums
     */
    public void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++)
            for (int j = 0; j < nums.length - 1 - i; j++)
                if (nums[j] > nums[j + 1])
                    swap(nums, j, j + 1);
    }

    /**
     * 插入排序
     * 时间复杂度 O(n^2)
     * 空间复杂度 O(1)
     *
     * @param nums
     * @return
     */
    public int[] insertionSort(int[] nums) {
        for (int i = 1, j, current; i < nums.length; i++) {
            current = nums[i];
            for (j = i - 1; j >= 0 && nums[j] > current; j--)
                nums[j + 1] = nums[j];
            nums[j + 1] = current;
        }
        return nums;
    }

    /**
     * 归并排序
     * 时间复杂度 O(nlogn)
     * 空间复杂度 O(n)
     *
     * @param nums
     * @return
     */
    public void mergeSort(int[] nums, int start, int end) {
        //如果只剩下一个元素就返回
        if (start >= end) return;

        int mid = start + (end - start) / 2;

        mergeSort(nums, start, mid);
        mergeSort(nums, mid + 1, end);

        merge(nums, start, mid, end);
    }

    /**
     * 归并操作
     *
     * @param nums
     * @param start
     * @param mid
     * @param end
     */
    private void merge(int[] nums, int start, int mid, int end) {
        int[] copy = nums.clone();

        //k表示指针从什么位置开始修改原来的数组
        int k = start;
        //lStart表示左半边的起始位置，rStart表示右半边的起始位置
        int lStart = start, rStart = mid + 1;

        while (k <= end) {
            if (lStart > mid) {
                //左半边的数都处理完毕，只剩下右半边的数，此时只需将右半边的数逐个拷贝过去
                nums[k++] = copy[rStart++];
            } else if (rStart > end) {
                //右半边的数都处理完毕，只剩下左半边的数，此时只需将左半边的数逐个拷贝过去
                nums[k++] = copy[lStart++];
            } else if (copy[rStart] < copy[lStart]) {
                //右边的数小于左边的数，拷贝右边当前这个数，并且指针移位
                nums[k++] = copy[rStart++];
            } else {
                //左边的数小于左边的数，拷贝左边当前这个数，并且指针移位
                nums[k++] = copy[lStart++];
            }
        }
    }

    /**
     * 快速排序
     * 时间复杂度 O(nlogn) ~ O(n^2)
     * 空间复杂度 O(logn)
     *
     * @param nums
     * @param start
     * @param end
     */
    public void quickSort(int[] nums, int start, int end) {
        //如果只剩下一个元素就返回
        if (start >= end) return;

        int p = partition(nums, start, end);

        //递归地对基准点左右两边的数进行排序
        quickSort(nums, start, p - 1);
        quickSort(nums, p + 1, end);
    }

    /**
     * 获取一个随机的基准点
     *
     * @param nums
     * @param start
     * @param end
     * @return
     */
    private int partition(int[] nums, int start, int end) {
        //随机选择一个数作为基准值，这里的nums[end]就是基准值
        swap(nums, randRange(start, end), end);
        int i, j;

        //从左至右每个数和基准值做一次比较，若比基准值小，则放到指针i所指向的位置
        //循环完毕后，则i指针之前的数都比基准值小
        for (i = start, j = start; j < end; j++)
            if (nums[j] <= nums[end])
                swap(nums, i++, j);

        //基准值（上面的选出来的nums[end]）放到指针i的位置，则指针i之后的数都比基准值大
        swap(nums, i, j);

        //返回指针i，作为基准点的位置
        return i;
    }

    /**
     * 取[start,end]的随机数
     *
     * @param start
     * @param end
     * @return
     */
    private int randRange(int start, int end) {
        double r = start + Math.random() * (end - start + 1);
        return (int) r;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
