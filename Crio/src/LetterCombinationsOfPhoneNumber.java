import java.io.*;
import java.util.*;


public class LetterCombinationsOfPhoneNumber {


    static Map<Character,ArrayList<Character>> getMap(){
	    Map<Character,ArrayList<Character>> dic = new HashMap<>();
	    ArrayList<Character> l1 = new ArrayList<>();
	    l1.add('a');
	    l1.add('b');
	    l1.add('c');
	    dic.put('2', l1);
	    ArrayList<Character> l2 = new ArrayList<>();
	    l2.add('d');
	    l2.add('e');
	    l2.add('f');
	    dic.put('3',l2);
	    ArrayList<Character> l3 = new ArrayList<>();
	    l3.add('g');
            l3.add('h');
            l3.add('i');
            dic.put('4',l3);
            ArrayList<Character> l4 = new ArrayList<>();
	    l4.add('j');
            l4.add('k');
            l4.add('l');
            dic.put('5',l4);
            ArrayList<Character> l5 = new ArrayList<>();
	    l5.add('m');
            l5.add('n');
            l5.add('o');
            dic.put('6',l5);
            ArrayList<Character> l6 = new ArrayList<>();
	    l6.add('p');
            l6.add('q');
            l6.add('r');
	    l6.add('s');
            dic.put('7',l6);
            ArrayList<Character> l7 = new ArrayList<>();
	    l7.add('t');
            l7.add('u');
            l7.add('v');
            dic.put('8',l7);
            ArrayList<Character> l8 = new ArrayList<>();
	    l8.add('w');
            l8.add('x');
            l8.add('y');
	    l8.add('z');
            dic.put('9',l8);
	    return dic;


    }

    // Implement your solution by completing the below function
    public List<String> letterCombinations(String digits) {
    Map<Character,ArrayList<Character>> dic = getMap();
    List<String> ans = new ArrayList<>();
    if(digits.length() == 0){
        return ans;
    }
    String val = new String();
    for(int i = 0; i < digits.length(); i ++){
    	val += Character.toString(dic.get(digits.charAt(i)).get(0));
    }
    
    

        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = in.readLine();
        List<String> combinations = new LetterCombinationsOfPhoneNumber().letterCombinations(line);
        for (String cmbn : combinations)
            System.out.print(cmbn + " ");
    }
}

