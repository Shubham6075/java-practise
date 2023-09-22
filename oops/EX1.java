package Placement_Course.OOPs;

/*
‘this’ keyword :  ‘this’ keyword in Java that refers to the current instance of the class.
   In OOPs it is used to:
1. pass the current object as a parameter to another method
2. refer to the current class instance variable

 */

class Student{
	String name ;
	int age;

	// non parameterized constructor
	Student(){
		System.out.println("Empty constructor called");
	}

	//parametrized constructor
	Student(String name, int age){
		this.name = name;
		this.age = age;
	}

	public  void getInfo(){
     System.out.println("the name of student is : " +this.name);
	 System.out.println("the age of student is : " +this.age);
	}

}


public class EX1 {
	public static void main(String[] args){

		// creating object of Student class
		Student s1 = new Student();
		s1.name = "Shubham";
		s1.age = 23;

		s1.getInfo();

		// creating another object of student class
		Student s2 = new Student();
		s2.name = "Bablu";
		s2.age = 25;

		s2.getInfo();

	}
}
