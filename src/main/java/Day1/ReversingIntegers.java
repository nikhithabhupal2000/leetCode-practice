package Day1;/*



You are given a 32-bit signed integer, reverse digits of an integer.
   Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [-231,  231 - 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 */

import java.util.*;
import java.io.*;
class ReversingIntegers {
    public static int reverse(int x) {
        int flag = 0;
        
        if(x < 0){
            flag = 1;
            x = Math.abs(x);
        }
        long sol = 0;
        while(x != 0){
            sol = sol * 10 + x % 10;
            x = x / 10;
            if((sol > Integer.MAX_VALUE) || (sol < Integer.MIN_VALUE)){
            return 0;
        }
        }
        if(flag == 1){
            sol = -1 * sol;
        }
        return Math.toIntExact(sol);
    }
    public static void main(String[] args){
	Scanner ip = new Scanner(System.in);
	int p = ip.nextInt();
	System.out.println(ReversingIntegers.reverse(p));
    }
}

