package com.eden;

/**
 * 88. 合并两个有序数组
 */
public class merge {

    public static void main(String[] args) {
        merge merge = new merge();
        int[] nums1 = {-1, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0};
        int m = 5;
        int[] nums2 = {-1, -1, 0, 0, 1, 2};
        int n = 6;
        merge.merge02(nums1, m, nums2, n);
        for (int j : nums1) {
            System.out.print(j + " ");
        }
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0) {
            for (int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
            return;
        }
        if (n == 0) {
            return;
        }
        for (int i = 0, j = 0; i < (m + n) && j < n; ) {
            if (nums1[i] > nums2[j]) {
                putNum(nums1, i, nums2[j], nums1.length);
                i++;
                j++;
            } else if (i >= (m + j) && nums1[i] == 0) {
                nums1[i] = nums2[j];
                i++;
                j++;
            } else {
                i++;
            }
        }
    }

    public static void putNum(int[] nums, int index, int num, int length) {
        for (int i = length - 1; i > index; i--) {
            nums[i] = nums[i - 1];
        }
        nums[index] = num;
    }

    public void merge02(int[] nums1, int m, int[] nums2, int n) {
        int tail = m + n - 1;
        while (n > 0) {
            if (m > 0 && nums1[m - 1] > nums2[n - 1]) {
                nums1[tail] = nums1[m - 1];
                m--;
            } else {
                nums1[tail] = nums2[n - 1];
                n--;
            }
            tail--;
        }
    }
}
