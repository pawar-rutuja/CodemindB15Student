package javapractice;

class School {
	int strength = 200;
	String Name = "Biology";

	public void Department(int c) {
		int strength = 300;
System.out.println("This is Biology Department With " + "Student Stregnth " + this.strength);
	}

}

class College extends School {
	int Rank = 1;
	String Name = "Expert College";
	
	public College() {
		super.Department(2);
		
	}

	public void Department() {
		System.out.println("This is Expert college with Rank " + this.Rank);
		System.out.println( super.Name + " is Top Department with Rank " + Rank );
	}

}

public class SuperEx {

	public static void main(String[] args) {

		College CG = new College();
		CG.Department();

		School Sc = new School();
		Sc.Department(5);
		

	}

}
