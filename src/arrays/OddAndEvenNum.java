package arrays;

import java.util.*;

public class OddAndEvenNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size you want");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.print("enter elements into an aray");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("The Even Elements are");
		for (int i = 0; i < n; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i]);
			}
		}
		System.out.println("The odd Elements are");
		for (int i = 0; i < n; i++) {
			if (arr[i] % 2 != 0) {
				System.out.println(arr[i]);
			}
		}
		sc.close();

	}
}
