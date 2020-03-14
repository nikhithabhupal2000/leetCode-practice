import java.util.*;
import java.io.*;

/* Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

*/

class TwoSum {
    static int getIndex(int[] temp, int val, int repeat){
        for(int i = 0; i < temp.length; i ++){
            if(temp[i] == val){
                if(repeat == 0){
                    return i;
                }
                else{
                    repeat --;
                }
                
            }
        }
        return -1;
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] temp = new int[nums.length];
        System.arraycopy(nums, 0, temp, 0, nums.length);
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 1;
        int sum = 0;
        int[] indices = new int[2];
        int repeat= 0;
        while(i <j){
            sum = nums[i] + nums[j];
            if(sum == target){
                if(nums[i] == nums[j])
                    repeat = 1;
                indices[0] = TwoSum.getIndex(temp, nums[i], 0);
                indices[1] = TwoSum.getIndex(temp, nums[j], repeat);
                return indices;
            }
            else if(sum > target){
                j --;
            }
            else{
                i ++;
            }
        }
        
        return indices;
    }
    public static void main(String[] args){
    Scanner ip = new Scanner(System.in);
    int len = ip.nextInt();
    int[] arr = new int[len];
    for(int i = 0; i < len; i ++){
	    arr[i] = ip.nextInt();
    }
    int target = ip.nextInt();
    System.out.println(TwoSum.twoSum(arr,target));
    }
}
