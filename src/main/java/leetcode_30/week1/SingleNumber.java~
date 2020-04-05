/*
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 */
import java.util.*;
class SingleNumber {
    public static  int singleNumber(int[] nums) {
        int sol = 0;
        for(int i = 0; i < nums.length; i ++){
            sol = sol ^ nums[i];
        }
        return sol;
    }
    public static void main(String[] args){
	    Scanner ip = new Scanner(System.in);
	    int len = ip.nextInt();
	    int[] nums = new int[len];
	    for(int i = 0; i < len; i ++){
		    nums[i] = ip.nextInt();
	    }
	    System.out.println("The number which is single is" + singleNumber(nums));
    }
}
