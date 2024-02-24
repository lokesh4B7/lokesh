package arrays;

import java.util.Scanner;

public class MatrixMultiplication {
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
		// creating array for matrix A and matrix B
		int a[][] = new int[m][n];
		int b[][] = new int[p][q];

		/*
		 * no of columns of matrixA is not equal to no of rows of matrixB matrix
		 * multiplication is not possible
		 */
		// Check if matrix multiplication is possible
		if (n != p) {
			System.out.println("Matrix multiplication not possible");
		} else {
			System.out.print("Enter the elements into matrix A :");
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					a[i][j] = sc.nextInt();
				}
			}
			System.out.print("Enter the elements into matrix B :");
			for (int i = 0; i < p; i++) {
				for (int j = 0; j < q; j++) {
					b[i][j] = sc.nextInt();
				}
			}
			int c[][] = new int[m][q];
			System.out.println("Result of matrix multiplication:");
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < q; j++) {
					c[i][j] = 0;
					for (int k = 0; k < n; k++) {
						c[i][j] = c[i][j] + a[i][k] * b[k][j];
					}
					System.out.print(c[i][j] + " ");
				}
				System.out.println();
			}
		}
		sc.close();
	}
}
