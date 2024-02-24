package list;

import java.util.ArrayList;
import java.util.Collections;
public class ArrayListExp1 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> a1=new ArrayList<>();
		
	// 1)add():it is used to add the elements into the array list.
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
		a1.add(6);
		a1.add(7);
		a1.add(8);
		a1.add(9);
		a1.add(10);
		a1.add(11);
		a1.add(12);
		
	// 2)remove():it removes the elements based on index value.
		
		System.out.println(a1.remove(0));
		
   //  3)set(): it replaces  the old object with new object.

		a1.set(1,78);
		System.out.println(a1);
		
   //  4)get():it returns element based on index value.
		
		System.out.println("The element is :"+a1.get(1));
		
   //  5)size(): it returns the size of the array.
		
		System.out.println("The size of array list is :"+a1.size());
		
   //  6)isEmpty():check whether the collection is empty or not.
		
		System.out.println(a1.isEmpty());
		
  //   7)sort():it sort the elements in ascending order.
		
		Collections.sort(a1);
		System.out.println(a1);
		
  //   8)reverse():it reverse the elements	
		
		Collections.reverse(a1);
		System.out.println(a1);
		
  //   9)addAll():used to copy of one collection object into another list.
		
		ArrayList<Integer> b1=new ArrayList<>();
		b1.addAll(a1);
		System.out.println(b1);

		
		

	}

}
