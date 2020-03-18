class Solution {
    public String longestPalindrome(String s) {
        int[][] memo = new int[s.length()][s.length()];
        String max = "";
        if(s.length() == 0){
            return "";
        }
        else if(s.length() == 1){
            return s;
        }
        else if(s.length() == 2){
            if(s.charAt(0) == s.charAt(1)){
                return s;
            }
            else{
                return Character.toString(s.charAt(0));
            }
        }
        
        else{
            //filling 1 and 2 length cases
            for(int i = 0; i < s.length(); i ++){
                memo[i][i] = 1;
                if(i + 1 < s.length()){
                    if(s.charAt(i) == s.charAt(i + 1)){
                        memo[i][i + 1] = 1;
                    }
                    else{
                        memo[i][i + 1] = 0;
                    }
                }
                
            }
            
            
            //filling table
            int i = 0; int j = 2;int k = 2;
            while(k < s.length()){
                j = k;
                i = 0;
                while(j < s.length()){
                    if(s.charAt(i) == s.charAt(j)){
                        memo[i][j] = memo[i + 1][j - 1];
                    }
                    else{
                        memo[i][j] = 0;
                    }
                    i ++;
                    j ++;
                }
                k ++;
            }
            
        }
         for(int i = 0; i < s.length(); i ++){
            for(int j = 0; j < s.length(); j ++){
                if(memo[i][j] == 1){
                     if((j - i + 1) > max.length()){
                            max = s.substring(i,j + 1);
                        }
                }
            }
        }
        return max;
    }
}
