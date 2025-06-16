package javapractice;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
	
		ArrayList<Integer> arrayL=new ArrayList<Integer>();
		
		arrayL.add(9);
		arrayL.add(29);
		arrayL.add(9);
		arrayL.add(null);
		arrayL.add(100);
		for(int i=0;i<arrayL.size();i++)
		{
			System.out.println(arrayL.get(i));
		}

	}

}
