package Placement_Course;

import java.util.Scanner;

public class Even_No {
	public static void main(String[] args) {

		System.out.println("Enter the no : ");

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		for(int i = 0 ; i< n; i++){
			if(i % 2 ==0){
				System.out.println(i);
			}

		}
	}
}
