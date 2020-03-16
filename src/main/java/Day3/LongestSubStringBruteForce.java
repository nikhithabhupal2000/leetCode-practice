/*
 *
 *
 *Given a string, find the length of the longest substring without repeating characters.
 *
 *
 *
 *
 */

class Solution {
    public static int repeat(String s){
        HashMap<Character,Integer> freq = new HashMap<>();
        for(int i = 0; i < s.length(); i ++){
            if(freq.containsKey(s.charAt(i)) == true){
                return 1;
            }
            else{
                freq.put(s.charAt(i), 1);
            }
        }
        return 0;
    }
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        if(s.length() == 0){
            return 0;
        }
        for(int i = 0; i <s.length(); i ++){
            for(int j = i; j < s.length(); j ++){
                if(Solution.repeat(s.substring(i,j + 1)) == 0){
                    int len = j - i + 1;
                    if(len > max){
                        max = len;
                    }
                }
            }
        }
        return max;
    }
}
