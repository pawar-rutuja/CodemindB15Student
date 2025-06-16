package javapractice;

class Dog {

	String Name = "Golden Retrival";
	int Weight = 50;
	int arr[] = { 20, 10, 30, 40 };

	public void bark() {
		System.out.println("Name of Dog Breed is :" + Name);
		try {
			System.out.println(arr[30]);
		} catch (ArrayIndexOutOfBoundsException r) {
			System.out.println("Please enter Valid index ");
		}

		try {
			Name.charAt(40);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(" Please enter Valid index No");
		} finally {
			System.out.println("Dog Barking so Loudlly");
		}

	}

}

public class FinallyEx {

	public static void main(String[] args) {

		Dog d = new Dog();
		d.bark();

	}

}
