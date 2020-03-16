/*
 *
 *Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 *
 *
 *
 */
class Solution {
    public int removeDuplicates(int[] nums) {
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
}
