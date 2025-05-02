package javapractice;

class Furniture {
	
	String Color="Brown";
	int Price = 100000;
	String Material= "Wooden";
	
	public void Sitting()
	{
		System.out.println("We were sitted on Sofa");
	}
}

class StudyTable extends Furniture{
	int Capacity=1;
	
	 public void Studying()
	 {
		 System.out.println("We use study table to Study");
	 }
}

public class SingleInheritance {

	public static void main(String[] args) {
	
		StudyTable STD=new StudyTable();
		STD.Sitting();
		STD.Studying();

	}

}
