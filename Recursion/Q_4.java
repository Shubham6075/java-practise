package Placement_Course.Recursion;

import java.util.Scanner;
public class Q_4 {

	// print factorial of number

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter value of n :");
		int n = scanner.nextInt();

		System.out.println("Factorial : " +factorial(n));

	}

	public static int factorial(int n){

		if(n == 0){
			return 1;
		}
		return n * factorial(n-1);
	}
}
