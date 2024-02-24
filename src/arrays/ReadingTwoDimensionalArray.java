
package arrays;

import java.util.Scanner;

public class ReadingTwoDimensionalArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Define the dimensions of the array
		System.out.print("Enter the number of rows: ");
		int rowsize = sc.nextInt();
		System.out.print("Enter the number of columns: ");
		int columnsize = sc.nextInt();
		// Define the 2-dimensional array
		int[][] a = new int[rowsize][columnsize];

		// Read values into the array
		System.out.print("Enter the elements of the matrix A:");
		for (int i = 0; i < rowsize; i++) {
			for (int j = 0; j < columnsize; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		// Printing the array
		System.out.println("2-Dimensional Array:");
		for (int i = 0; i < rowsize; i++) {
			for (int j = 0; j < columnsize; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println(); // Move to the next row
		}

		// Close the scanner
		sc.close();
	}
}
