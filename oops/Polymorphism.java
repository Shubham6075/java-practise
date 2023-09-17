package Placement_Course.OOPs;

class Stud{
	String name;
	int age;

	public void displayInfo(String name){
		System.out.println(name);
	}

	public void displayInfo(int age){
		System.out.println(age);
	}

	public void displayInfo(String name, int age){
		System.out.println(name + " " +age);

	}
}

// compile time polymorphism : method overloading
public class Polymorphism {
	public static void main(String[] args){

		Stud s1 = new Stud();

		s1.name = "Shubham";
		s1.age = 23;

		s1.displayInfo(s1.name);
		s1.displayInfo(s1.age);
		s1.displayInfo(s1.name,s1.age);
	}

}
