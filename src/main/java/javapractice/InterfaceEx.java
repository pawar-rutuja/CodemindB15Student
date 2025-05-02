package javapractice;


interface Student{
	
	public static final int Marks= 60;
	String Name= "Pawan";
	String City= "Pune";
	
	public void Play();

}

class Depart implements Student
{
	int RollNo= 101;

	@Override
	public void Play()
	{
		System.out.println(" Students are Playing Chess.");
		
	}
	
	public void Exam()
	{
		System.out.println(" They are Preparing for the Entrance Exam.");
	}
	
	public void Study()
	{
System.out.println(" The most talentend student from class 12 is " +Name +" from " +City);
	}
	
}

public class InterfaceEx {

public static void main(String[] args) {
		
		Depart Cg=new Depart();
		Cg.Play();
		Cg.Exam();
		Cg.Study();
		
		
		

	}

}

