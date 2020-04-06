import java.util.*;
class StringPermutations{
	

	static void swap(StringBuffer str, int i, int j){
		char c = str.charAt(i);
		str.setCharAt(i, str.charAt(j));
		str.setCharAt(j, c);
	}

	static void printPermutations(StringBuffer str, int start, int end){
		if(start == end){
			System.out.println(str);
			return;
		}
		for(int i = start; i <= end; i ++){
			swap(str, start,i);
			printPermutations(str,start + 1,end);
			swap(str, start,i);
		}
	}


	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		StringBuffer str = new StringBuffer(ip.nextLine());
		printPermutations(str, 0, str.length() - 1);
	}
}
