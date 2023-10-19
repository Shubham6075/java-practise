package Placement_Course.Strings;

import java.util.Scanner;

public class stringUserName {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);

		System.out.println("Enter the email :");
		String email = scanner.next();
		String userName = "";

		System.out.println();


		for(int i=0; i<email.length(); i++) {
			if(email.charAt(i) == '@') {
				break;
			} else {
				userName += email.charAt(i);
			}
		}


		System.out.println(userName);
	}

}
