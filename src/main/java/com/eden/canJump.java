package com.eden;

/**
 * 55. 跳跃游戏
 */
public class canJump {

    public static void main(String[] args) {
        canJump canJump = new canJump();
        // int[] nums = {2,0,0};
        int[] nums = {3, 2, 1, 0, 4};
        boolean result = canJump.canJump(nums);
        System.out.println("result = " + result);
        printArray(nums);
    }

    public boolean canJump(int[] nums) {
        return next5(nums);
    }

    private boolean next(int[] nums, int next) {
        if (next >= nums.length - 1) {
            return true;
        }
        if (next == 0 && nums[next] == 0 && nums.length == 1) {
            return true;
        }
        int stepSize = nums[next];
        if (stepSize == 0) {
            return false;
        }
        for (int i = 1; i <= stepSize; i++) {
            if (next(nums, next + i)) {
                return true;
            }
        }
        return false;
    }

    private boolean next2(int[] nums, int next) {
        if (next >= nums.length - 1) {
            return true;
        }
        if (next == 0 && nums[next] == 0 && nums.length == 1) {
            return true;
        }
        int stepSize = nums[next];
        if (stepSize == 0) {
            return false;
        }
        for (int i = stepSize; i > 0; i--) {
            if (next(nums, next + i)) {
                return true;
            }
        }
        return false;
    }

    private boolean next3(int[] nums, int next) {
        if (next >= nums.length - 1) {
            return true;
        }
        if (next == 0 && nums[next] == 0 && nums.length == 1) {
            return true;
        }
        int stepSize = nums[next];
        if (stepSize == 0) {
            return false;
        }
        int maxNext = 0;
        int maxI = 0;
        for (int i = stepSize; i > 0; i--) {
            if (next + i >= nums.length - 1) {
                return true;
            }
            int nextTemp = next + nums[next + i];
            if (nextTemp > maxNext) {
                maxNext = nextTemp;
                maxI = i;
            }
        }
        return next3(nums, next + maxI);
    }


    public boolean next5(int[] nums) {
        int rightmost = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i <= rightmost) {
                if (i + nums[i] > rightmost) {
                    rightmost = i + nums[i];
                }
                if (rightmost >= nums.length - 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + "");
        }
        System.out.println();
    }
}
