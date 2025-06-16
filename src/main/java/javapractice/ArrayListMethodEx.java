package javapractice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListMethodEx {

	public static void main(String[] args) {

		ArrayList<String> ArrayM = new ArrayList<String>();
		ArrayM.add("Pune");
		ArrayM.add("Mumbai");
		ArrayM.add(1, "Satara");
		ArrayM.add("Sangli");
		ArrayM.add("Nashik");

		System.out.println(ArrayM);

		ArrayList<String> array2 = new ArrayList<String>();
		array2.add("Solapur");
		array2.add("Pune");

		ArrayM.addAll(array2);
		System.out.println(ArrayM);

		System.out.println("Size Of ArrayList = " + ArrayM.size());

		System.out.println("Is This ArrayList Contains Pune:" + ArrayM.contains("Pune"));

		System.out.println("Is this contains all List :" + ArrayM.containsAll(array2));

		System.out.println("Get String From Index 4 :" + ArrayM.get(4));

		System.out.println("Is Given List Is Empty :" + ArrayM.isEmpty());

		System.out.println("Remove this element from List:" + ArrayM.remove(3));

		System.out.println("Remove This Object From List :" + ArrayM.remove("Pune"));

		System.out.println(ArrayM);

		System.out.println("***********************************");

		// System.out.println("Remove All elements: "+ ArrayM.removeAll(ArrayM));

		// System.out.println(ArrayM);

		ArrayList<String> Array3 = new ArrayList<String>();
		Array3.add("Jalna");
		Array3.add("Nagar");
		Array3.add("Nagpur");
		Array3.add("Dhule");
		Array3.add("Jalgaon");

		System.out.println("Sublist " + Array3.subList(0, 4));

		System.out.println(ArrayM);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

		Iterator<String> it = ArrayM.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		Array3.clear();
		System.out.println(Array3);

	}
	

}
