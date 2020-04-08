/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    static int maxDiff(int[] nums){
        int[][] p = new int[2][nums.length];
        for(int i = 0; i < nums.length; i ++){
            p[0][i] = 0;
            p[1][i] = 0;
        }
        for(int i = 1; i < nums.length ; i ++){
            p[0][i] = Math.max(p[0][i - 1] ,p[1][i - 1] + Math.abs(1 - nums[i - 1]));
            p[1][i] = Math.max(p[0][i - 1] + Math.abs(1 - nums[i]), p[1][i - 1] + Math.abs(nums[i] - nums[i - 1]));
        }
        return Math.max(p[1][nums.length - 1], p[0][nums.length - 1]);
        
    }
	public static void main (String[] args) {
		Scanner ip = new Scanner(System.in);
		int tests = ip.nextInt();
		while(tests != 0){
		    int len = ip.nextInt();
		    int[] nums = new int[len];
		    for(int i = 0 ; i < len; i ++){
		        nums[i] = ip.nextInt();
		    }
		    System.out.println(maxDiff(nums));
		    tests --;
		}
	}
}
