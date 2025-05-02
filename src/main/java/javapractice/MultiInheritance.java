package javapractice;


class Hospital{
 String Name= "Global Hospital";
 String City= "PUNE";
 String Speciality= "Multispeciality";
 
 public void Treatment()
 {
	 System.out.println("All types of Treatments Available In Global Hospital.");
 }
	
}

class Department extends Hospital
{
	String Laboratory="Pathology";
	
	public void Test()
	{
		System.out.println("Blood Samples Tests are done by Specialist.");
	}
}

class Doctor extends Department
{
	String Name="Dr.Kumar";
	String Degree="MBBS";
	int Salary= 200000;
	
	public void Practitioner()
	{
		System.out.println("Dr.Kumar is Good Surgen who is holding " + Degree +" Degree.");
	}
			
}
public class MultiInheritance {

	public static void main(String[] args) {
		
		Doctor Dr=new Doctor();
		Dr.Treatment();
		Dr.Practitioner();
		
		Department DP=new Department();
		DP.Test();
		

	}

}
