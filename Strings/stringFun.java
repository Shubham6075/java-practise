package Placement_Course.Strings;

public class stringFun {
	public static void main(String[] args){

		String name1 = "Shubham";
		String name2 = "Shubham";

		// 1  s1 > s2 : +ve value
		// 2  s1 == s2 : 0
		// 3  s1 < s2 : -ve value

		// Compare function  ( .compareTo() )

		if(name1.compareTo(name2) == 0){
			System.out.println("Strings are equal");
		}else{
			System.out.println("String are not equal");
		}

		System.out.println("%%%%%%%%%%%%");

		// using == operator
		if(name1 == name2){
			System.out.println("Strings are equal");
		}else{
			System.out.println("Strings are not equal");
		}

		System.out.println("&&&&&&&&&&&&&&&&");

		if(new String("Dhram") == (new String("Dhram"))){
			System.out.println("Strings are equal");
		}else{
			System.out.println("Strings are not equal");
		}


	}
}
