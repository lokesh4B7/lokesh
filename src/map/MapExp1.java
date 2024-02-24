package map;

import java.util.*;

public class MapExp1 
{

	public static void main(String[] args) 
	{
		//creation of a map
		Map<Integer,String> m=new Hashtable();
		
		//add elements into the map
		m.put(1001,"Hyderabad");
		m.put(1002,"Banglore");
		m.put(1003,"Chennai");
		m.put(1004,"Visakhapatnam");
		m.put(1005,"Kolkata");
		
	  //Retrieval of keys from the map.
		Set<Integer> keys= m.keySet();
		for(Integer key:keys)
		{
			System.out.println(key);
		}
		
		System.out.println();
		
	  //Retrieval of values from the map.
		Collection<String> values= m.values();
		for(String value:values)
		{
			System.out.println(value);
		}
		
		System.out.println();
		
	  //Retrieval of value from the map based on key.
		System.out.println(m.get(1004));
		
		System.out.println();
		
	  //Delete element from map
		m.remove(1002);
		System.out.println(m);
		
	  //containsKey():it checks whether the key is present or not.
		
		System.out.println(m.containsKey(1001));
		
	  //containsValue():it checks whether the key is present or not.
			
		System.out.println(m.containsValue("Hyderabad"));	
		
	}

}
