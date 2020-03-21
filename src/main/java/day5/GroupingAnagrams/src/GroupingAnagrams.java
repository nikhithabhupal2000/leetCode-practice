import java.util.*;
public class GroupingAnagrams {
	 public static int isAnagram(String s1, String s2){
	        HashMap<Character,Integer> freq = new HashMap<>();
	        for(int i = 0; i < s1.length(); i ++){
	            if(freq.containsKey(s1.charAt(i)) == true){
	                freq.put(s1.charAt(i), freq.get(s1.charAt(i)) + 1);
	            }
	            else{
	                freq.put(s1.charAt(i), 1);
	            }
	        }
	        for(int i = 0; i < s2.length(); i ++){
	            if(freq.containsKey(s2.charAt(i)) == true){
	                    freq.put(s2.charAt(i), freq.get(s2.charAt(i)) - 1);
	                    if(freq.get(s2.charAt(i)) == 0){
	                        freq.remove(s2.charAt(i));
	                    }
	                
	            }
	            else{
	                return 0;
	            }
	            
	        }
	        
	        if(freq.isEmpty() == true){
	            return 1;
	        }
	        return 0;
	        
	    }
	    public static List<List<String>> groupAnagrams(String[] strs) {
	        List ans = new ArrayList<List<String>>();
	        if(strs.length == 0){
	            return ans;
	        }
	        String[] distinct = new String[strs.length];
	        int[] belong = new int[strs.length];
	        distinct[0] = strs[0];
	        belong[0] = 1;
	        int count = 1;
	        int flag;
	        for(int i = 1; i < strs.length; i ++){
	            int temp = 0;
	            flag = 0;
	            while(temp < count){
	                if(GroupingAnagrams.isAnagram(distinct[temp], strs[i]) == 1){
	                	System.out.println(distinct[temp] + "    " + strs[i]);
	                    belong[i] = temp + 1;
	                    flag = 1;
	                    break;
	                }
	                temp ++;
	            }
	            if(flag == 0){
	                count += 1;
	                belong[i] = count;
	                distinct[count - 1] = strs[i];
	            }
	        }
	        System.out.println("distinct");
	        for(int i = 0; i < count; i ++) {
		        System.out.print(distinct[i]);
		        System.out.println("     ");
	        }
	        System.out.println("belong");
	        for(int i = 0; i < strs.length; i ++) {
		        System.out.print(belong[i]);
	        }
	        int t = count;
	        while(t != 0){
	            List<String> in = new ArrayList<String>();
	           for(int i = 0; i < strs.length; i ++){
	               if(belong[i] == t){
	                   in.add(strs[i]);
	               }
	           }
	            ans.add(in);
	            t --;
	        }
	        return ans;
	       
	    }

	public static void main(String[] args) {
		int len;
		System.out.print("Enter the length of array");
		Scanner ip = new Scanner(System.in);
		len = ip.nextInt();
		String[] arr = new String[len];
		String p = ip.nextLine();
		for(int i = 0; i < len; i ++) {
			arr[i] = ip.nextLine();
		}
		for(int i = 0; i < len; i ++) {
			System.out.println(arr[i]);
		}
		System.out.println(GroupingAnagrams.groupAnagrams(arr));
		

	}

}
