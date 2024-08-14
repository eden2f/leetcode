package com.eden;

public class maxProfit2 {

    public static void main(String[] args) {
        maxProfit2 maxProfit2 = new maxProfit2();
        int[] nums = {2,4,1};
        int count = maxProfit2.maxProfit(nums);
        System.out.println("count = " + count);
        printArray(nums);
    }

    public int maxProfit(int[] prices) {
        if(null == prices || prices.length <= 1){
            return 0;
        }
        int curMin = Integer.MAX_VALUE;
        int curMax = Integer.MIN_VALUE;
        int result = 0;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i] <= curMin && prices[i] > curMax){
                // 买入
                curMin = prices[i];
            } else {
                if(prices[i] >= curMax){
                    curMax = prices[i];
                    if(i < prices.length - 1){
                        // 继续持有
                        continue;
                    }
                }
                // 卖出
                result = result + ( curMax - curMin ) ;
                curMin = prices[i];
                curMax = prices[i];
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
