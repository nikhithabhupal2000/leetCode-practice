
/*
 *
 *
 *
 *
 *Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
 *
 *
 *
 *
 */
import java.util.*;
class ThreeSum{
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> sol = new ArrayList<>();
        if(nums.length < 3){
            return sol;
        }
        Arrays.sort(nums);
        for(int i = 0; i <= nums.length - 3; i ++){
            int sum = -1 * nums[i];
            int j = i + 1; int k = nums.length - 1;
            int val = 0;
            while(j < k){
                val = nums[j] + nums[k];
                if(val == sum){
                    List<Integer> t = new LinkedList<>();
                    t.add(-1 * sum);
                    t.add(nums[j]);
                    t.add(nums[k]);
                    if(sol.contains(t) == false){
                        sol.add(t);
                         
                    }
                       val = 0;
                        j ++;
                        k --;
                }
                else if(val > sum){
                    k --;
                }
                else{
                    j ++;
                }
            }
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
	    System.out.println(ThreeSum.threeSum(nums));
    }
}
