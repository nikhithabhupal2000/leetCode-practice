/*
 *
 *Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 *
 */
import java.util.*;
class ValidParanthesis {
    public static boolean isValid(String s) {
        Stack<Character> param = new Stack<Character>();
        Character c;
        for(int i = 0; i < s.length(); i ++){
            switch(s.charAt(i)){
                case '(':param.push('(');
                    break;
                case '[':param.push('[');
                    break;
                case '{':param.push('{');
                    break;
                case '}': 
                    if(param.empty()){
                        return false;
                    }
                    c = (Character)param.peek();
                    if(c == '{'){
                        param.pop();
                    }
                    else{
                        return false;
                    }
                    break;
                case ']':
                    if(param.empty()){
                        return false;
                    }
                    c = (Character)param.peek();
                    if(c == '['){
                        param.pop();
                    }
                    else{
                        return false;
                    }
                    break;
                case ')':
                    if(param.empty()){
                        return false;
                    }
                    c = (Character)param.peek();
                    if(c == '('){
                        param.pop();
                    }
                    else{
                        return false;
                    }
                    break;
            }
            
        }
        if(param.empty()){
            return true;
        }
        else{
            return false;
        }
        
    }
    public static void main(String[] args){
	    Scanner ip = new Scanner(System.in);
	    String input = ip.nextLine();
	    System.out.println(ValidParanthesis.isValid(input));
    }
}
