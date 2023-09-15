package Placement_Course.Function_Method.Question;

import java.util.Scanner;

public class Q_9_GCD {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter no 1 :");
		int n1 = scanner.nextInt();

		System.out.println("Enter no 2 :");
		int n2 = scanner.nextInt();


		while(n1 != n2) {
			if(n1>n2) {
				n1 = n1 - n2;
			} else {
				n2 = n2 - n1;
			}
		}
		System.out.println("GCD is : "+ n2);

	}
}
