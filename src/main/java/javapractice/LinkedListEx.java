package javapractice;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {

		LinkedList<String> Lst = new LinkedList<String>();

		Lst.add("Mumbai");
		Lst.addFirst("Pune");
		Lst.element();
		Lst.addLast(null);
		Lst.addLast("Satara");
		Lst.add("Mumbai");
		Lst.contains("Pune");
		Lst.contains(null);
		Lst.containsAll(Lst);
	

		for (int i = 0; i < Lst.size(); i++) {
			System.out.println(Lst.get(i));
			
		}

	}

}
