/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{

	static long maxProfit(long[] prices){
		Arrays.sort(prices);
		long sol = 0;
		int days = 0;
		long r = 1000000007;
		for(int i = prices.length - 1; i >= 0; i --){
			sol = sol % r;
			if(prices[i] - days <= 0){
				return sol;
			}
			else{
				sol += (prices[i] - days) % r;
			}
			days ++;
		}
		return sol;

	}

	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner ip = new Scanner(System.in);
		int tests = ip.nextInt();
		while(tests != 0){
		    int n = ip.nextInt();
		    long[] prices = new long[n];
		    for(int i = 0; i < n; i ++){
			    prices[i] = ip.nextLong();
		    }
		    System.out.println(maxProfit(prices));
		    tests --;
		}
		
	}
}

