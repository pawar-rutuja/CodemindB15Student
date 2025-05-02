package javapractice;

class Animal{
	
	String Name= "Lion";
	int Weight;
	
	public void Roar()
	{
		System.out.println(" Most Powerful Animal is :" + Name );
	}
}

class Tiger extends Animal{
	
	String Type= " Bengal Tiger";
	
	public void Roar() {
		
		System.out.println(" Roar of " + Type +" is too loud. ");
		
	}
		
}


public class MethodOverriding {

	public static void main(String[] args) {
		
		Animal AM=new Animal();
		
		AM.Roar();
		
		Tiger TG=new Tiger();
		
		TG.Roar();
			
	}

}
