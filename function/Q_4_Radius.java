package Placement_Course.Function_Method.Question;

import java.util.Scanner;

public class Q_4_Radius {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the radius : ");
		double radius = scanner.nextDouble();

		System.out.println("************");
		System.out.println("Circumference : " +circumference(radius));

		System.out.println();
		System.out.println("$$$$$$$$$$$$$$$$$$$");
		System.out.println();
		System.out.println("Area : " +Area(radius));


	}

	public static double circumference(double radius){
		return 2 * Math.PI * radius;
	}

	public static double Area(double radius){
		return Math.PI * radius * radius;
	}
}
