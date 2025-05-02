package javapractice;

public class StackErrorEx {

	public static void main(String[] args) {
		
		StackErrorEx SF= new StackErrorEx();
		
		SF.Run();
	}
		
		public void Run() 
		{
			System.out.println("Error Found");
			
			Run();
		}
		
		
}
