/*
 *
 *Given an array nums and a value val, remove all instances of that value in-place and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 *
 *
 *
 */
import java.util.*;
class RemoveElements {
    public static int removeElements(int[] nums, int val) {
        if(nums.length == 0){
            return 0;
        }
        int counter = 0;
        int length;
        for(int i = 0; i < nums.length; i ++){
            if(nums[i] == val){
                counter ++;  
            }
            else{
                if(i - counter >= 0){
                    nums[i - counter] = nums[i];
                }
            }
        }
        return nums.length - counter;
    }
    public static void main(String[] args){
	    Scanner ip = new Scanner(System.in);
	    System.out.println("Enter the length of array");
	    int len = ip.nextInt();
	    int[] arr = new int[len];
	    for(int i = 0; i < len; i ++){
		    arr[i] = ip.nextInt();
	    }
	    System.out.println("Enter the values");
	    int val = ip.nextInt();
	    System.out.println(RemoveElements.removeElements(arr,val));
    }
}
