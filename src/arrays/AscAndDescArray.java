package arrays;

import java.util.Scanner;

public class AscAndDescArray
{
	public static void main(String[] args)
	{
		int temp = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size you want");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter elements into an aray");
		for (int i = 0; i < n; i++) 
		{
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) 
		{
			for (int j = 0; j < n / 2; j++)
			{
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

			for (int j = n / 2; j < n; j++) 
			{
				if (arr[j] < arr[j + 1])
				{
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println("the sorted array is");
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}

		sc.close();
	}
}
