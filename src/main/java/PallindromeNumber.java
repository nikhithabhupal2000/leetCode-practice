/*
Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

Coud you solve it without converting the integer to a string?

 */
import java.util.*;
import java.io.*;
class PallindromeNumber {
    public static boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        else{
            int rev = 0;
            int temp = x;
            while(temp != 0){
                rev = rev * 10 + temp % 10;
                temp = temp / 10;
            }
            if(rev == x){
                return true;
            }
            else{
                return false;
            }
        }
        
    }
    public static void main(String[] args){
	    Scanner ip = new Scanner(System.in);
	    int input = ip.nextInt();
	    System.out.println(PallindromeNumber.isPalindrome(input));
    }
}
