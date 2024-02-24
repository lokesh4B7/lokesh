package arrays;

import java.util.*;

public class SecondSmallestElement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size you want");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter elements into an aray");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}
		int firstsmallest = Integer.MAX_VALUE;
		int secondsmallest = Integer.MAX_VALUE;

		for (int i = 0; i < n; i++) {
			if (arr[i] < firstsmallest) {
				secondsmallest = firstsmallest;
				firstsmallest = arr[i];

			} else if (arr[i] > firstsmallest && arr[i] < secondsmallest) {
				secondsmallest = arr[i];

			}
		}
		System.out.println("The First smallest is: " + firstsmallest);
		System.out.println("The Second smallest is: " + secondsmallest);
		sc.close();
	}

}
