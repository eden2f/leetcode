package com.eden;

/**
 * 45. 跳跃游戏 II
 */
public class jump {

    public static void main(String[] args) {
        jump jump = new jump();
        // int[] nums = {2,0,0};
        int[] nums = {3, 2, 1, 0, 4};
        int result = jump.jump(nums);
        System.out.println("result = " + result);
        printArray(nums);
    }

    public int jump(int[] nums) {
        int n = nums.length;
        int end = 0;
        int maxPosition = 0;
        int steps = 0;
        for (int i = 0; i < n - 1; i++) {
            if (i + nums[i] > maxPosition) {
                maxPosition = i + nums[i];
            }
            if (i == end) {
                end = maxPosition;
                steps++;
            }
        }
        return steps;
    }

    public static void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + "");
        }
        System.out.println();
    }

}
