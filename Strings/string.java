package Placement_Course.String_Builder;



public class string {
	public static void main(String[] args){

		// string builder declaration
		StringBuilder sb = new StringBuilder("Tony");
		System.out.println(sb);

		System.out.println();
		System.out.println("%%%%%%%%%%%%%%%%%");

		// get a char at index
		System.out.println(sb.charAt(0));

		System.out.println();
		System.out.println("&&&&&&&&&&&&&&&&&");

		// set a character at index
		sb.setCharAt(0,'M');
		System.out.println(sb);

		System.out.println();
		System.out.println("^^^^^^^^^^^^^^^^");

		// Insert a char at index
		sb.insert(3,'t');
		System.out.println(sb);

		System.out.println();
		System.out.println("$$$$$$$$$$$$$$$");

		// delete char at some index
		sb.delete(3,4);
		System.out.println(sb);

		System.out.println();
		System.out.println("#################");

		// append a char
		sb.append(" Hooda");
		System.out.println(sb);

		System.out.println();
		System.out.println("@@@@@@@@@@@@@@");

		// print length of string
		System.out.println(sb.length());



	}

}
