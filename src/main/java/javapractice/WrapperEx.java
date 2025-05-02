package javapractice;

public class WrapperEx {

	public static void main(String[] args) {
	
		new WrapperEx().integerEx();

	}

	public void integerEx()
	{
		int k=20;
		
		Integer j=Integer.valueOf(k);
		System.out.println(j instanceof Integer);
	}
}
