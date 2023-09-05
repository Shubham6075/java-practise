package Placement_Course.Function_Method.Question;

import java.util.Scanner;

public class Q_1_avg {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the 1st no :");
		int a = scanner.nextInt();
		System.out.println("Enter the 2nd no :");
		int b = scanner.nextInt();
		System.out.println("Enter the 3rd no :");
		int c = scanner.nextInt();

		System.out.println();

		System.out.println("Avg of no's : " +avg(a,b,c));

	}

	public static int avg(int a, int b, int c){
		return (a+b+c)/3;
	}
}
