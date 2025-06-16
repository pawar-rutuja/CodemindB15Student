package javapractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx {

	public static void main(String[] args) {
		
		Map<Integer,String>mapm=new HashMap<Integer,String>();
		mapm.put(1001,"Rutuja");
		mapm.put(1002,"Ashwini");
		mapm.put(1003,"Priya");
		mapm.put(1003,"Netra");
		mapm.put(1005,"Rutuja");
		
		Set<Entry<Integer,String>> sets=mapm.entrySet();
		Iterator<Entry<Integer,String>>it=sets.iterator();
		while(it.hasNext())
		{
			Entry<Integer,String>en=it.next();
			System.out.println(en.getKey() + ":" +en.getValue());
		}
		
		Map<Integer,String>map1=new HashMap<Integer,String>();
		map1.put(1006, "Rani");
		map1.put(1008, "Manisha");
		
		mapm.putAll(map1);
		
	}

}
