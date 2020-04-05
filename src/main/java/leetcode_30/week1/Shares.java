import java.util.*;
/*
 * Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).

Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).
 */
class Solution {
    public static int maxProfit(int[] prices) {
        int n = prices.length;
         int profit = 0;
        if(n == 1){
            return profit;
        }
       int i = 0;
        while(i < n - 1){
            while((i < n - 1) && (prices[i] >= prices[i + 1])){
                i ++;
            }
            if(i == n - 1){
                break;
            }
            int buy = i++ ;
            while((i < n) && ( prices[i ] >= prices[i - 1])){
                i ++;
            }
            profit -=prices[buy];
            profit += prices[i - 1];
            
        }
        return profit;
        
    }
    public static void main(String[] args){
	    Scanner ip = new Scanner(System.in);
	    System.out.println("Enter the length of array");
	    int len = ip.nextInt();
	    int[] nums = new int[len];
	    for(int i = 0; i < len; i ++){
		    System.out.println("Enter the val");
		    nums[i] = ip.nextInt();
	    }
	    System.out.println("The max profit obtainable is " + maxProfit(nums));
    }
}
