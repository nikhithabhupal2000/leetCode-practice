/*
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 */
import java.util.*;
class Solution {
    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < nums.length; i ++){
            sum += nums[i];
             if(max < sum){
                max = sum;
            }
            if(sum < 0){
                sum = 0;
            }
           
        }
        return max;
    }
    public static void main(String[] args){
	    Scanner ip = new Scanner(System.in);
	    System.out.println("Enter the length of array");
	    int len = ip.nextInt();
	    int[] nums = new int[len];
	    for(int i = 0; i < len; i ++){
		    System.out.println("Enter value " );
		    nums[i] = ip.nextInt();
	    }
	    System.out.println("Maximum subarray sum is" + maxSubArray(nums));
    }
}
