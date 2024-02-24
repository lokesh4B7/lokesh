package queue;

import java.util.*;
public class PriorityQueueExp 
{

	public static void main(String[] args)
	{
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		
		pq.add(32);
		pq.add(1);
		pq.add(12);
		pq.add(15);
		pq.add(12);
		pq.add(10);
		pq.add(3);
		pq.add(6);
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq);
		
		ArrayDeque<String> ad=new ArrayDeque<>();
		

	}

}
