package Placement_Course.Function_Method.Question;

import java.util.Scanner;

public class Q_8_Power {
	public static void main(String[] args) {
		System.out.println("Enter no");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		System.out.println("Enter power");
		int n = scanner.nextInt();


		int result = 1;
		//Please see that n is not too large or else result will exceed the size of int
		for(int i=0; i<n; i++) {
			result = result * x;
		}


		System.out.println( x+ " to the power " +n +" is : "+ result);
	}

}
