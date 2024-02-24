package arrays;

import java.util.Scanner;

public class FindingSmallElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of an array");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("enter the elements into  an array");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int small = a[0];
		for (int i = 0; i < n; i++) {
			if (a[i] < small) {
				small = a[i];
			}
		}
		System.out.println("The Smallest element in given array is: " + small);
		sc.close();
	}

}
