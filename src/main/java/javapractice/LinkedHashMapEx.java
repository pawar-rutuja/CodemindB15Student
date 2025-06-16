package javapractice;

import java.util.LinkedHashMap;

public class LinkedHashMapEx {

	public static void main(String[] args) {
		
		LinkedHashMap<String,Integer>linkhash=new LinkedHashMap<String,Integer>();
		
		linkhash.put("Archana", 90);
		linkhash.put("Reva", 85);
		linkhash.put("Reema",80);
		linkhash.put("Arti",70);
		linkhash.put("Kiya",85);
		linkhash.put("Suniti",85);
		
		System.out.println(linkhash);
		System.out.println("This map contains :" + linkhash.containsKey("Kiya"));
		System.out.println("Value of given key :" + linkhash.get("Reema"));
		

	}

}
