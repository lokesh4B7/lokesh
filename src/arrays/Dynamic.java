package arrays;

import java.util.Scanner;

public class Dynamic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size");
		int n = Integer.parseInt(sc.nextLine());
		int a[] = new int[n];
		System.out.println("Enter " + n + " Elements");
		for (int i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(sc.nextLine());
		}
		for (int element : a) 
		{
			System.out.print(+element + "  ");
		}

		sc.close();

	}

}