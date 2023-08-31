package Placement_Course.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

// when we need to add element in list then we need to use linked-list O(1) as its
// time complexity is less than array list O(n)

// when we need to search then we should use Array-list O(1) as its
// time complexity is less than linked-list O(n)

public class ArrayLists {
	public static void main(String[] args){

		ArrayList<Integer> list = new ArrayList<>();

		// adding element in list : use add() function
		list.add(12);
		list.add(23);
		list.add(34);
		list.add(45);
		list.add(56);
		list.add(67);
		list.add(78);

		System.out.println(list);

		System.out.println("^^^^^^^^^^^^^^^^^");

		// getting element at specific position : use get() function
		System.out.println("Index at pos : " +list.get(3));

		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^");

		// modify value at position : use set() function
		list.set(2,43);
		System.out.println(list);

		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^");


		// iterating list
		// 1. for loop
		System.out.println("Using for loop :");
		for(int i=0; i<list.size(); i++){
			System.out.print(list.get(i) + " ");
		}
		System.out.println();

		System.out.println("^^^^^^^^^^^^^^^^^^^^^");
		// 2. using for each loop
		System.out.println("using foreach loop");

		for(Integer e : list){
			System.out.print(e + " ");
		}
		System.out.println();

		System.out.println("^^^^^^^^^^^^^^^^^^^^^");

		// 3.using iterator
		System.out.println("Using iterator");

		Iterator<Integer> it = list.iterator();
		while(it.hasNext()){
			System.out.print(it.next() + " ");
		}
		System.out.println();


		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^");

		// to delete element : use remove() function
		list.remove(2);
		System.out.println(list);

		System.out.println("^^^^^^^^^^^^^^^^^^^");

		// to sort element in list : use Collections.sort() function

		Collections.sort(list);
		System.out.println(list);

		System.out.println("^^^^^^^^^^^^^^^^^^^^^^");

		// to sort in reverse order : use Collections.sort(list,Collection.reverseOrder())
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);


		System.out.println("^^^^^^^^^^^^^^^^^^^^");

		// to delete all element from list : use clear() function
		list.clear();
		System.out.println(list);


	}
}
