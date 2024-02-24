package list;

import java.util.*;

public class StackExp1
{
	public static void main(String[] args)
	{
		Stack<Integer> st= new Stack<>(); // it allows only integer values
		st.push(4);  //pushes the element into stack.
		st.push(7);
		st.push(1);
		st.push(9);
		st.push(10);
		st.push(80);
		st.push(78);
	
		System.out.println(st.pop());  //it removes the Lastly added from the stack.
		
		System.out.println(st.peek());  //it returns the Lastly added element from the stack.
		
		System.out.println(st.search(9)); //it searches the element present in stack or not from top.
		
		Collections.sort(st);   //sort elements in ascending order.
		System.out.println(st);
		
		Collections.reverse(st);  //reverse the elements
		System.out.println(st);
		
	}

}
