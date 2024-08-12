package com.eden;

/**
 * 26. 删除有序数组中的重复项
 */
public class removeDuplicates {

    public static void main(String[] args) {
        removeDuplicates removeDuplicates = new removeDuplicates();
//        int[] nums = {1,1,2};
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int count = removeDuplicates.removeDuplicates(nums);
        System.out.println("count = " + count);
        printArray(nums);
    }

    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return 1;
        }
        int removeIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[removeIndex] != nums[i]) {
                removeIndex++;
                nums[removeIndex] = nums[i];
            }
        }
        return removeIndex + 1;
    }

    public static void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + "");
        }
        System.out.println();
    }
}
