package Placement_Course.OOPs;


interface Animal1 {
	void walk();
}


class Horse1 implements Animal1 {
	public void walk() {
		System.out.println("Horse walks on 4 legs");
	}
}


class Chicken1 implements Animal1 {
	public void walk() {
		System.out.println("Chicken walks on 2 legs");
	}
}


public class Interface {
	public static void main(String[] args) {
		Horse1 horse = new Horse1();
		horse.walk();

		System.out.println("^^^^^^^^^^^^^^^^^");

		Chicken1 chicken = new Chicken1();
		chicken.walk();
	}
}

