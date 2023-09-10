package Placement_Course.Function_Method.Question;

import java.util.Scanner;

public class Q_5_age {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the age :");
		int age = scanner.nextInt();

		System.out.println();

		System.out.println("Is Eligible : "  +isEligible(age));
	}

	public static boolean isEligible(int age){
		if(age > 18){
			return true;
		}else {
			return false;
		}
	}
}
