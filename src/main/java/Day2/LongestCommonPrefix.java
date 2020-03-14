/*
 *
 *
 *
 *Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".
 *
 *
 *
 *
 */
import java.util.*;
class LongestCommonPrefix {
    static String findMatch(String a, String b){
        String match = "";
        for(int i = 0; i < Math.min(a.length(), b.length()); i ++){
            if(a.charAt(i) == b.charAt(i)){
                match += Character.toString(a.charAt(i));
            }
            else{
                return match;
            }
        }
        return match;
    }
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length > 0){
        String lcp = strs[0];
        for(int i = 1; i < strs.length; i ++){
            lcp = LongestCommonPrefix.findMatch(strs[i], lcp);
            if(lcp == ""){
                return lcp;
            }
        }
        return lcp;
    }
        else{
            return "";
        }
    }
    public static void main(String[] args){
	    Scanner ip = new Scanner(System.in);
	    int len = ip.nextInt();
	    String[] input = new String[len];
	    for(int i = 0; i < len; i ++){
		    input[i] = ip.nextLine();
	    }
	    System.out.println(LongestCommonPrefix.longestCommonPrefix(input));
    }
}
