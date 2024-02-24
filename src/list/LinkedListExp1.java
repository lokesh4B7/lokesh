package list;

import java.util.*;

public class LinkedListExp1 
{
	public static void main(String[]args) 
	{
       LinkedList<String> ll=new LinkedList<>();
       ll.add("Telugu");
       ll.add(null);
       ll.add("English");
       ll.add("Maths");
       ll.add(1,"Hindi");
       ll.add("Hindi");
	   System.out.println(ll);
	   ll.remove(2);
	   System.out.println(ll);
	   ll.clear();
	   System.out.println(ll);
	}
}
