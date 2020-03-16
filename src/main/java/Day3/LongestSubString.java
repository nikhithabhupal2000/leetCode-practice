/*
 *
 *Given a string, find the length of the longest substring without repeating characters.
 *
 *
 *
 *
 */



class Solution {
    public static int getIndex(String s, Character c){
        return s.indexOf(Character.toString(c));
    }
    public int lengthOfLongestSubstring(String s){
        int ans = 0;
        if(s.length() == 0){
            return 0;
        }
        int[] dp = new int[s.length()];
        dp[0] = 1;
        String slidingWindow = "";
        slidingWindow += Character.toString(s.charAt(0));
        ans += 1;
        for(int i = 1; i < s.length(); i ++){
            if(slidingWindow.contains(Character.toString(s.charAt(i))) == false){
                dp[i] = dp[i - 1] + 1;
                slidingWindow += Character.toString(s.charAt(i));
            }
            else{
                int in = Solution.getIndex(slidingWindow,s.charAt(i));
                slidingWindow = slidingWindow.substring(in + 1) + Character.toString(s.charAt(i));
                dp[i] = slidingWindow.length();
                
            }
            if(ans < dp[i]){
                ans = dp[i];
            }
        }
        return ans;
    }
}
