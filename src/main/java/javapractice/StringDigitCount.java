package javapractice;

public class StringDigitCount {

	public static void main(String[] args) {
	
		String Str= " Welcome2025";
		
		int Counter=0;
		
		for(int i=0;i<Str.length();i++)
		{
			if(Character.isDigit(Str.charAt(i)))
			{
				Counter=Counter+1;
			}
		}
		System.out.println(" Digits in Given String are :" + Counter);

	}

}
