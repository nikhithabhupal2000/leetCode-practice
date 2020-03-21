/*
 *
 *Implement strStr().

Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 *
 *
 */
import java.util.*;
class StrStr{
    public static int strStr(String haystack, String needle) {
        if(needle.length() == 0){
            return 0;
        }
        if(haystack.length() == needle.length()){
            if(haystack.equals(needle)){
                return 0;
            }
        }
        for(int i = 0; i <= haystack.length() - needle.length(); i ++){
            String temp = haystack.substring(i, i + needle.length());
           if(temp.equals(needle)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
	    Scanner ip = new Scanner(System.in);
	    System.out.println("enter haystack string");
	    String haystack = ip.nextLine();
	    System.out.println("Enter needle string");
	    String needle = ip.nextLine();
	    System.out.println(StrStr.strStr(haystack, needle));
    }
}
