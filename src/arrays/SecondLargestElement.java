package arrays;

import java.util.*;

public class SecondLargestElement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size you want");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter elements into an aray");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}
		int firstlargest = Integer.MIN_VALUE;
		int secondlargest = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			if (arr[i] > firstlargest) {
				secondlargest = firstlargest;
				firstlargest = arr[i];
			} else if (arr[i] < firstlargest && arr[i] > secondlargest) {
				secondlargest = arr[i];
			}
		}
		System.out.println("The First largest is: " + firstlargest);
		System.out.println("The Second largest is: " + secondlargest);
		sc.close();
	}

}
