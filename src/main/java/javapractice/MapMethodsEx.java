package javapractice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapMethodsEx {

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
		System.out.println(mapm);
		
		System.out.println("Map Contains this Key :" + mapm.containsKey(1006));
		System.out.println("Map Contains This Key : " + mapm.containsKey(1007));
		System.out.println("Map Contains this Value : " + mapm.containsValue("Rani"));
		System.out.println("Map Contains this Value : " + mapm.containsValue("Rajita"));
		System.out.println("Map Contains this Value : " + mapm.get(1003));
		
		Set<Integer>keyset=mapm.keySet();
		for(Integer i:keyset)
		{
			System.out.println(i);
		}
      mapm.remove(1006);
      System.out.println(mapm);
      mapm.replace(1008, "Tina");
      System.out.println(mapm);
      
      System.out.println("Size of given map :" + mapm.size());
      
      Collection<String>values=mapm.values();
      
     Iterator<String>itv=values.iterator();
     while (itv.hasNext()) {
		System.out.println(itv.next());
		
	}
	}

}
