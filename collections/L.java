package Placement_Course.Collections;

import java.util.LinkedList;

public class L {
	public static void main(String[] args){

		LinkedList<Integer> list = new LinkedList<>();

		for(int i=0; i<=50; i++){
			list.add(i);
		}
		System.out.println(list);

		System.out.println("^^^^^^^^^^^^^^^^^^");

		// deleting greater than 25

		for(int i = list.size()-1; i>0; i--){
			if(list.get(i) > 25){
				list.remove(i);
			}
		}
		System.out.println(list);

		System.out.println("^^^^^^^^^^^^^^^^");


		LinkedList<Integer> list1 = new LinkedList<>();

		list1.add(1);
		list1.add(5);
		list1.add(7);
		list1.add(3);
		list1.add(8);
		list1.add(2);
		list1.add(3);

		System.out.println(list1);

		System.out.println("^^^^^^^^^^^^^^^^^^^^");

		// get index of value : use indexOf() function

		System.out.println(list1.indexOf(7));

	}
}
