package arrays;

import java.util.Scanner;

public class ArrayExample3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		// Reading Array size
		System.out.println("enter array size you want");
		int n = sc.nextInt();
		int arr[] = new int[n];
		// Reading Array elements
		System.out.print("enter array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("The elements are");
		// Printing Array elements
		for (int i : arr) {
			System.out.println(i + " ");
		}
		sc.close();
	}
}
