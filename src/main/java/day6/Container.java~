/*
 *
 *Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.

Note: You may not slant the container and n is at least 2.
 *
 *
 *
 *
 */

import java.util.*;
class Container{
    public static int maxArea(int[] height) {
        int maxArea = 0;
        int i = 0;
        int j = height.length - 1;
        int currentArea = 0;
        while(i < j){
            currentArea = (j - i) * Math.min(height[i], height[j]);
            if(currentArea > maxArea){
                maxArea = currentArea;
            }
            if(height[i] < height[j]){
                i ++;
            }
            else{
                j --;
            }
        }
        return maxArea;
    }
    public static void main(String[] args){
	    Scanner ip = new Scanner(System.in);
	    System.out.println("ENter number of rods");
	    int len = ip.nextInt();
	    int[] heights = new int[len];
	    for(int i = 0; i < len; i ++){
		    heights[i] = ip.nextInt();
	    }
	    System.out.println(Container.maxArea(heights));
    }

}
