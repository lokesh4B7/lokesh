package list;

import java.util.*;

public class VectorExp1 
{
	public static void main(String[] args)
	{
		//creating a vector
		Vector <String>v1=new Vector<>();   
		
		//add():adding elements into an list.
		v1.add("Telugu");
		v1.add("Hindi");
		v1.add("English");
		v1.add("Maths");
		v1.add("Physics");
		v1.add("Chemistry");
		
		//remove():it removes the elements in the list.
		v1.remove(0);
		v1.remove(1);
		
		//set():it replace the old objects to new object  based on index value.
		v1.set(0,"Sanskrit");
		v1.set(1,"M-1");
		System.out.println(v1);
		System.out.println(v1.size());   //it returns no of elements in list.
		System.out.println(v1.capacity()); //it returns the capacity of the list.
		
	}

}
