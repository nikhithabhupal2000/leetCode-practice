/*
 *
 *Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 *
 *
 *
 */
import java.util.*;

class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int len = 1;
        if(nums.length == 0){
            return 0;
        }
        int k = 1;
        int curr = nums[0];
        for(int i = 1; i < nums.length; i ++){
            if(curr != nums[i]){
                curr = nums[i];
                nums[k] = curr;
                k ++;
                len ++;
            }
        }
        return len;
    }
    public static void main(String[] args){
	    Scanner ip = new Scanner(System.in);
	    System.out.println("Enter the length of array");
	    int len = ip.nextInt();
	    int[] arr = new int[len];
	    for(int i = 0; i < len; i ++){
		    arr[i] = ip.nextInt();
	    }
	    System.out.println(RemoveDuplicates.removeDuplicates(arr));
	    
    }
}
