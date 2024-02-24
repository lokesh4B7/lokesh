package arrays;

import java.util.Scanner;

public class MaxAndSmall {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size you want");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter elements into an aray");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int max = arr[0];
		int small = arr[0];
		for (int i = 0; i < n; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < small) {
				small = arr[i];
			}
		}
		System.out.println("The Maximum element in given array is: " + max);
		System.out.println("The Smallest element in given array is: " + small);
		sc.close();
	}
}
