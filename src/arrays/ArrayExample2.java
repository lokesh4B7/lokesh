package arrays;

import java.util.Scanner;
public class ArrayExample2
{
	public static void main(String[] args)
	{
      Scanner sc=new Scanner(System.in);
      System.out.println("enter array size you want");
		int n = sc.nextInt();
		int arr[] = new int[n];
		// Reading Array elements
		System.out.print("enter array elements");
		for (int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("The sorted elements  are");
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
			   if(arr[i]<arr[j])
				{
					int t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
				}
				
			}
			System.out.println(arr[i]);
		}
		
        sc.close();
	}

}
/*
int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
int length = arr.length;
System.out.println("The Length of the array is :" + length);
System.out.println("The Last element in given array is :" + arr[length - 1]);
System.out.println("The Last element But one in given array is :" + arr[length - 2]);
System.out.println("The First element in given array is :" + arr[length - 9]);
*/