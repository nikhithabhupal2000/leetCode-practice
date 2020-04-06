/*
 * Given an array of strings, group anagrams together.
 */
import java.util.*;
class Solution {
    public static List<List<String>> groupAnagrams(String[] strs) {
       String[] modified = new String[strs.length];
        for(int i = 0; i < strs.length; i ++){
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            modified[i] = new String(chars);
        }
        int flag = 0;
        List<List<String>> result = new ArrayList<List<String>>();
        for(int i = 0;i < strs.length; i ++){
            flag = 0;
            for(int j = 0; j < result.size(); j ++){
                if(result.get(j).contains(modified[i])){
                    result.get(j).add(strs[i]);
                    flag = 1;
                }
            }
            if(flag == 0){
                List<String> tmp = new ArrayList<>();
                tmp.add(modified[i]);
                tmp.add(strs[i]);
                result.add(tmp);
            }
        }
        for(int j = 0; j < result.size(); j ++){
            List<String> a = result.get(j);
            a.remove(0);
        }
        return result;
    }
    public static void main(String[] args){
	    Scanner ip = new Scanner(System.in);
	    System.out.println("Enter the length of array");
	    int len = ip.nextInt();
	    ip.nextLine();
	    String[] vals = new String[len];
	    for(int i = 0; i < len; i ++){
		    System.out.println("Enter the string");
		    vals[i] = ip.nextLine();
	    }
	    System.out.println(groupAnagrams(vals));
    }
}
