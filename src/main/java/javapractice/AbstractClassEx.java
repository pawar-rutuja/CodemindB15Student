package javapractice;


abstract class Vehicle {
	public Vehicle()
	{
		System.out.println("What a Beautiful Mercedes is This !");
	}
	
	public void Move()
	{
		System.out.println(" Car Moving from here and there ");
	}
	
}

class Bike extends Vehicle {
	
	public Bike()
	{
		System.out.println(" I like Sports Bikes");
	}
	
	public void Run()
	{
		System.out.println("Bikes Running so Fast ");
	}
}


public class AbstractClassEx {

	public static void main(String[] args) {
		
		Bike Bk=new Bike();
		Bk.Move();
		Bk.Run();

	}

}
