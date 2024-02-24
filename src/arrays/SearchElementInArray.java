package arrays;

import java.util.Scanner;

public class SearchElementInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size you want");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.print("enter elements into an aray");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter search element in given array");
		int searchElement = sc.nextInt();
		for (int i = 0; i < n; i++)
		{
			if (arr[i] == searchElement)
			{
				System.out.println("element found at index "+i);
				System.exit(0);
			}
		}
		System.out.println("element  not found");	
		sc.close();
	}
}
