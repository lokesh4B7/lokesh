package arrays;

import java.util.Scanner;

public class MatrixAddition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no of rows of matrix A: ");
		int m = sc.nextInt();
		System.out.print("Enter the no of columns of matrix A: ");
		int n = sc.nextInt();
		System.out.print("Enter the no of rows of matrix B: ");
		int p = sc.nextInt();
		System.out.print("Enter the no of columns of matrix B: ");
		int q = sc.nextInt();
		int a[][] = new int[m][n];
		int b[][] = new int[p][q];
		// adding after storing in third matrix
		int c[][] = new int[m][q];
		// Read matrix a values into the array
		System.out.print("Enter the elements into matrix A :");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		// Read matrix b values into the array
		System.out.print("Enter the elements into matrix B :");
		for (int i = 0; i < p; i++) {
			for (int j = 0; j < q; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		// Printing the matrix
		System.out.println("2-Dimensional Array:");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < q; j++) {
				c[i][j] = a[i][j] + b[i][j]; // storing in c matrix
				System.out.print(c[i][j] + " ");
			}
			System.out.println(); // Move to the next row
		}

		// Close the scanner
		sc.close();
	}
}
