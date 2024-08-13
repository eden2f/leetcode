package com.eden;

/**
 * 189. 轮转数组
 */
public class rotate {

    public static void main(String[] args) {
        rotate rotate = new rotate();
        int[] nums = {3, 2, 2, 3};
        rotate.rotate(nums, 3);
        printArray(nums);
    }

    public void rotate(int[] nums, int k) {
        int[] numsTemp = new int[nums.length];
        for (int i = 0; i < nums.length; ++i) {
            numsTemp[(i + k) % nums.length] = nums[i];
        }
        for (int i = 0; i < numsTemp.length; i++) {
            nums[i] = numsTemp[i];
        }
    }

    public static void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + "");
        }
        System.out.println();
    }

}
