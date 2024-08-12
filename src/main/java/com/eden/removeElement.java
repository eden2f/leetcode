package com.eden;

/**
 * 27. 移除元素
 */
public class removeElement {

    public static void main(String[] args) {
        removeElement removeElement = new removeElement();
        int[] nums = {3, 2, 2, 3};
        int result = removeElement.removeElement(nums, 3);
        System.out.println(result);
        System.out.println();
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + "");
        }
        System.out.println();
    }

    public int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            printArray(nums, left, right);
            if (nums[left] == val) {
                nums[left] = nums[right - 1];
                right--;
            } else {
                left++;
            }
        }
        return left;
    }

    public void printArray(int[] nums, int left, int right) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + "");
        }
        System.out.print(",left=" + left + ",right=" + right);
        System.out.println();
    }
}
