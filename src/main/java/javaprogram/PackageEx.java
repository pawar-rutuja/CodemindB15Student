package javaprogram;


class Employee{
	int Salary;
	String Name= " Sanjay";
	int Eno=101;
	
	public void Work() {
		System.out.println(" Sanjay is Working in MNC Company.");
	}
	
}


public class PackageEx {

	public static void main(String[] args) {
		
		Employee Em=new Employee();
		
		Em.Work();
	
		
		

	}

}
