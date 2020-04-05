/*
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * 	Note:

You must do this in-place without making a copy of the array.
Minimize the total number of operations.
 */
import java.util.*;
class Solution {
    public static void moveZeroes(int[] nums) {
        int insert = 0;
        for(int i = 0; i < nums.length; i ++){
            if(nums[i] != 0){
                nums[insert] = nums[i];
                insert ++;
            }
        }
        for(int i = insert; i < nums.length; i ++){
            nums[i] = 0;
        }
        
    }
    public static void main(String[] args){
	    Scanner ip = new Scanner(System.in);
	    System.out.println("Enter the length of array");
	    int len = ip.nextInt();
	    int[] nums = new int[len];
	    for(int i = 0; i < len; i ++){
		    System.out.println("Enter the val ");
		    nums[i] = ip.nextInt();
	    }
            moveZeroes(nums);
	    System.out.println("The array after modifications is");
	    for(int i =  0; i < nums.length; i ++){
		    System.out.print(nums[i] + "     ");
	    }
    }
}
