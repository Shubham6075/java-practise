package Placement_Course.Function_Method;

import java.util.Scanner;

public class Function {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first no :");
		int a = scanner.nextInt();
		System.out.println("Enter second no :");
		int b = scanner.nextInt();

		Sum2Numbers(a,b);

		System.out.println("**************");

		System.out.println("Product of No's :" +Product2Numbers(a,b));

		System.out.println("$$$$$$$$$$$$$$$$$$");

		System.out.println("Enter the value :");
		int q = scanner.nextInt();

        factorial(q);



	}

	public static void Sum2Numbers(int a, int b){
		int sum = a+b;
		System.out.println("Sum : " +sum);
	}

	public static int Product2Numbers(int a, int b){
		return a*b;
	}

	public static void factorial(int q){
		if(q <= 0){
			System.out.println("Invalid Number");
			return;
		}

		int factorial = 1;
		for(int i = q; i>=1; i--){
			factorial = factorial*i;
		}
		System.out.println("Factorial of " +q +":" +factorial);
	}
}


/*

  Functions ko hum direct call krte hain

  methods ko hum call krte h class k objects k sath
 */