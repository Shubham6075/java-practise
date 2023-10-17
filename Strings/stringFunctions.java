package Placement_Course.Strings;

public class stringFunctions {
	public static void main(String[] args){

		// concatenate
		String firstName = "Shubham";
		String lastName = "Rathee";

		String fullName = firstName + " " +lastName;

		System.out.println(fullName);

		System.out.println("###############");

		// concatenate using concat() method

		String str1 = "Hello";
		String str2 = "World";
		String str3 = str1.concat(" " +str2);

		System.out.println(str3);


		System.out.println("&&&&&&&&&&&&&&&&&");

		// Length function
		System.out.println(fullName.length());

		System.out.println(str3.length());

		System.out.println("%%%%%%%%%%%%%%%%%%%%%");

		// charAt function

		for(int i=0; i<fullName.length(); i++){
			System.out.println(fullName.charAt(i));
		}

		System.out.println("^^^^^^^^^^^^^^^^^");

		// Lower case function & Upper case function

		System.out.println("Lower case : " +fullName.toLowerCase());
		System.out.println();
		System.out.println("Upper case : " +fullName.toUpperCase());

		System.out.println();
		System.out.println("$$$$$$$$$$$$$$$$$$$");

		//sub string function : (beg index , ending index)

		String name = fullName.substring(8);
		System.out.println(name);

		System.out.println();

		System.out.println("7777");

		System.out.println();

		String nam = fullName.substring(9);
		System.out.println(nam);

		System.out.println();
		System.out.println("%%%%%%%%%%%%%%%%%%");

		// strings are immutable

	}

}
