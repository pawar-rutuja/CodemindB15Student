package javapractice;

public class ExceptionEx {

	public static void main(String[] args) {
		
		ExceptionEx Ex=new ExceptionEx();
		Ex.Move();

	}

	public void Move() {
		

		try {
			int arr[] = {20,30,40,50,60};
			System.out.println(arr.length);
			System.out.println("Car Is Moving fast in " + arr.length);

		}

		catch (Exception Sr) {

		}

	}

	public void Stop() {
		System.out.println("Car Stop when reched at final Point");
	}
}
