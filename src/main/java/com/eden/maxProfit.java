package com.eden;

/**
 * 121. 买卖股票的最佳时机
 */
public class maxProfit {

    public static void main(String[] args) {
        maxProfit maxProfit = new maxProfit();
        int[] nums = {7,1,5,3,6,4};
        int count = maxProfit.maxProfit(nums);
        System.out.println("count = " + count);
        printArray(nums);
    }

    public int maxProfit(int[] prices) {
        if(null == prices || prices.length <= 1){
            return 0;
        }
        int min = Integer.MAX_VALUE;
        int result = 0;
        for (int i = 0; i < prices.length; i++) {
            int num = prices[i];
            if(prices[i] < min){
                min = prices[i];
            } else if(prices[i] - min > result){
                result = prices[i] - min;
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
