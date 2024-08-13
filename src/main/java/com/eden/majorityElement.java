package com.eden;

import java.util.HashMap;
import java.util.Map;

/**
 * 169. 多数元素
 */
public class majorityElement {

    public static void main(String[] args) {
        majorityElement majorityElement = new majorityElement();
        int[] nums = {3,2,3};
        int count = majorityElement.majorityElement(nums);
        System.out.println("count = " + count);
        printArray(nums);
    }

    public int majorityElement(int[] nums) {
        if(null == nums || nums.length == 0){
            return 0;
        }
        if(nums.length <= 1){
            return nums[0];
        }
        int mid = nums.length/2;
        int result = 0;
        Map<Integer, Integer> numToCountMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            Integer curCount = numToCountMap.get(num);
            curCount = null == curCount ? 1 : curCount + 1;
            numToCountMap.put(num, curCount);
            if(curCount > mid){
                result = num;
            }
        }
        return result;
    }

    public static void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + "");
        }
        System.out.println();
    }
}
