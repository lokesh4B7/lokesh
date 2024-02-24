package arrays;

import java.util.Scanner;

public class PrintingArrayBothForwardAndBackwardDirection
{
	public void printArray(int arr[])
	{
		System.out.println("printing elemeents in forward direction");
		for(int a:arr)
		{
			System.out.print(a+" ");
		}
		System.out.println();
		System.out.println("printing elements in reverse direction");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) 
	{
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the array size you want");
		 int n=sc.nextInt();
		 //creating array
		 int arr[]=new int[n];
		 System.out.println("Enter the elements into an array");
		 for(int i=0;i<n;i++)
		 {
			 arr[i]=sc.nextInt();
		 }
		 PrintingArrayBothForwardAndBackwardDirection pa=new PrintingArrayBothForwardAndBackwardDirection();
		 pa.printArray(arr);
         sc.close();
	}

}
