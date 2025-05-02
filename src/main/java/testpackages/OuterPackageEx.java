package testpackages;

import javapractice.AddEx;
import javapractice.GeneralEx;


public class OuterPackageEx {

	public static void main(String[] args) {
		
		GeneralEx GE=new GeneralEx();
		
		GE.show();
		
		AddEx Ae=new AddEx();
		Ae.add(20, 40);
		
		System.out.println(Ae.add(20, 30));
	
		System.out.println(Math.divideExact(600,30) );

	}

}
