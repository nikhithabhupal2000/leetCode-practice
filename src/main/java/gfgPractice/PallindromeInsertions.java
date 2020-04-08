/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    static int insertions(String src){
        int[][] dp = new int[src.length()][src.length()];
        for(int i = 0; i < src.length(); i ++){
            dp[0][i] = 0;
        }
        for(int i = 0; i < src.length() - 1; i ++){
            if(src.charAt(i) == src.charAt(i + 1)){
                dp[1][i] = 0;
            }
            else{
                dp[1][i] = 1;
            }
        }
        for(int i = 2; i < src.length() ; i ++){
           for(int j = 0; j < src.length() - i; j ++){
               if(src.charAt(j) == src.charAt(i + j)){
                    dp[i][j]  = dp[i - 2][j + 1];
               }
               else{
                   dp[i][j]  = 1 + Math.min(dp[i - 1][j], dp[i - 1][j + 1]);
               }
           }
        }
        return dp[src.length() - 1][0];
    }

	public static void main (String[] args) {
		Scanner ip = new Scanner(System.in);
		int tests = ip.nextInt();
		ip.nextLine();
		while(tests != 0){
		    String src = ip.next();
		    System.out.println(insertions(src));
		    tests --;
		}
	}
}
