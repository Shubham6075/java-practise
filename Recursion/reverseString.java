package Placement_Course.Recursion.R1;

public class reverseString {
	public static void main(String[] args){

		String str = "a b c d";
		String reversed = revString(str);

		System.out.println(reversed);

	}

	public static String revString(String str){
		if(str.length() == 1){
			return str;
		}
		char currChar = str.charAt(0);
		String nextString = revString(str.substring(1));

		return nextString + currChar;
	}
}
