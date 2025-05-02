package javapractice;

import java.util.ArrayList;
import java.util.List;

public class ListInterfaceEx {

	public static void main(String[] args) {
		
		List<Integer> LI=new ArrayList<Integer>();
		LI.contains(null);
		LI.remove(null);
		LI.add(2);
		LI.add(5);
		LI.add(10);
		LI.indexOf(LI);
		LI.contains(null);
		
		for(Integer i:LI)
		{
			System.out.println(i);
		}

		
		List<String> SL=new ArrayList<String>();
		SL.add("Codemind");
		SL.add("Pune");
		SL.toString();
		
		for(String s:SL)
		{
			System.out.println(s);
		}
		
	}

}
