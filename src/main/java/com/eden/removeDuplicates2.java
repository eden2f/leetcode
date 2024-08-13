package com.eden;

public class removeDuplicates2 {

    public static void main(String[] args) {
        removeDuplicates2 removeDuplicates2 = new removeDuplicates2();
        int[] nums = {1,1,1,2,2,3};
//        int[] nums = {0,0,1,1,1,1,2,3,3};
//        int[] nums = {1,1};
        int count = removeDuplicates2.removeDuplicates(nums);
        System.out.println("count = " + count);
        printArray(nums);
    }

    public static void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + "");
        }
        System.out.println();
    }

    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n <= 2) {
            return n;
        }
        int slow = 2, fast = 2;
        while (fast < n) {
            if (nums[slow - 2] != nums[fast]) {
                nums[slow] = nums[fast];
                ++slow;
            }
            ++fast;
        }
        return slow;
    }

}
