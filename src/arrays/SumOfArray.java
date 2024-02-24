package arrays;

import java.util.*;

public class SumOfArray 
{
	public static void main(String[] args)
	{
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size you want");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter elements into an aray");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}
		for (int i = 0; i < n; i++) {
			sum = sum + arr[i];

		}
		System.out.println("The Sum of elements in given array is: " + sum);
		sc.close();
	}
}