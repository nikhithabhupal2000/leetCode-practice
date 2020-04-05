/*
 * Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.
 */
import java.util.*;
class Solution {
    public static boolean isHappy(int n) {
       ArrayList<Integer> seen = new ArrayList<>();
        seen.add(n);
        while(true){
            int sum = 0;
            int tmp = n;
            while(tmp != 0){
                sum += (tmp % 10) * (tmp % 10);
                tmp = tmp / 10;
            }
            if(sum == 1){
                return true;
            }
            if(seen.contains(sum)){
                return false;
            }
            seen.add(sum);
            n = sum;
        }
        
    }

    public static void main(String[] args){
	    Scanner ip = new Scanner(System.in);
	    System.out.println("Enter the number you wanna check if happy?");
	    int n = ip.nextInt();
	    System.out.println(n + " being happy is " + isHappy(n)); 
    }
}
