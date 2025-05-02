package javapractice;

class Collage
{
	String Name= " Pune Collage";
	int Fees;
	String Course="MBA";
	
	public void Exam()
	{
		
		System.out.println(" Collage arranging Entrance Exams for :" + Course +" Course");
	}
	
	public void Exam(String Name,int Fees)
	{
		
		System.out.println("Fees for MBA Course in "+ Name +" is :" +Fees);
		
	}
	public void Exam(String Name,int Fees,String Course)
	{
System.out.println(" Thousand students are applying Entrance Exam for :" +Course);
	}
}


public class MethodOverloadingEx {

	public static void main(String[] args) {
		
		Collage Clg=new Collage();
		Clg.Exam();
		Clg.Exam("Pune",100000);
		Clg.Exam("Mumbai",100000,"BBA");

	}

}
