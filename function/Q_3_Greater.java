package Placement_Course.Function_Method.Question;

import java.util.Scanner;

public class Q_3_Greater {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the 1st no : ");
		int a = scanner.nextInt();

		System.out.println("Enter the 2nd no : ");
		int b = scanner.nextInt();

		System.out.println("************");

		greaterAmong2(a,b);




	}

	public static void greaterAmong2(int a, int b){
		if(a > b){
			System.out.println(a + " Is Greater");
		}else{
			System.out.println(b + " Is Greater");
		}
	}
}
