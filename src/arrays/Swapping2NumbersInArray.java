package arrays;

import java.util.Scanner;

public class Swapping2NumbersInArray
{
	public static void main(String[] args)
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the array size you want");
	 int n=sc.nextInt();
	 int arr[]=new int[n];
	 System.out.println("Enter the elements into an array");
	 for(int i=0;i<n;i++)
	 {
		 arr[i]=sc.nextInt();
	 }
     for(int a:arr)
     {
    	 System.out.print(a+" ");
     }
     System.out.println();
     System.out.println("Enter 2 indexes elements for swaping");
     int x=sc.nextInt();
     int y=sc.nextInt();
     int temp=arr[x];
         arr[x]=arr[y];
         arr[y]=temp;
     for(int a:arr)
     {
    	 System.out.print(a+" "); 
     }
     sc.close();
	}
   
}
