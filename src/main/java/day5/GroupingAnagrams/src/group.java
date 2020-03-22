import java.util.*;
class group{
    static String commonPrefixUtil(String str1, String str2) { 
        String result = ""; 
        int n1 = str1.length(), n2 = str2.length();  
        for (int i = 0, j = 0; i <= n1 - 1 && j <= n2 - 1; i++, j++) { 
            if (str1.charAt(i) != str2.charAt(j)) { 
                break; 
            } 
            result += str1.charAt(i); 
        } 
  
        return (result); 
    } 
  
 
    static int commonPrefix(String arr[], int n) { 
        String prefix = arr[0]; 
  
        for (int i = 1; i <= n - 1; i++) { 
            prefix = commonPrefixUtil(prefix, arr[i]); 
        } 
  
        return (prefix.length()); 
    } 
    static int score(String[] words, int n, int k){
        Arrays.sort(words);
        for(int i = 0; i < n; i ++){
            System.out.println(words[i]);
        }
        String[] temp = new String[k];
        int score = 0;
        
        for(int i = 0; i < n / k; i ++){
            System.arraycopy(words,i * k,temp,0,k);
            score += commonPrefix(temp,k);
        }
        return score;
    }
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        int z = 1;
        int t = ip.nextInt();
        while(t != 0){
            int n = ip.nextInt();
            int k = ip.nextInt();
            String[] words = new String[n];
            String l = ip.nextLine(); 
            for(int i = 0; i < n; i ++){
                words[i] = ip.nextLine();
            }
            int sol = group.score(words,n,k);
            System.out.print("Case #");
            System.out.print(z);
            z ++;
            System.out.print(": ");
            System.out.println(sol);
            t --;
        }
    }
}