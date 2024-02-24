
package arrays;

import java.util.Scanner;

public class FindingMaxElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of an array");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("enter the elements into  an array");
		for (int i = 0; i < n; i++) 
		{
			a[i] = sc.nextInt();
		}
		int max = a[0], index = 0;
		for (int i = 0; i < n; i++) 
		{
			if (a[i] > max) {
				max = a[i];
				index = i;
			}
		}
		System.out.println("The Maximum element in given array is: " + max);
		System.out.println("The Maximum element index is: " + index);
		sc.close();
	}

}
