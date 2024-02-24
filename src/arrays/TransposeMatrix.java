package arrays;

import java.util.Scanner;

public class TransposeMatrix {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input the dimensions of the matrix
		System.out.print("Enter the number of rows for the matrix: ");
		int m = scanner.nextInt();
		System.out.print("Enter the number of columns for the matrix: ");
		int n = scanner.nextInt();

		// Input the elements of the matrix
		System.out.print("Enter the elements of the matrix:");
		int[][] matrix = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}
		// Before transposing matrix
		System.out.println("Before transposing matrix");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		// Transpose the matrix in-place
		int[][] transposedMatrix = new int[n][m];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				transposedMatrix[j][i] = matrix[i][j];
			}
		}

		// Display the transposed matrix
		System.out.println("Transposed Matrix:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(transposedMatrix[i][j] + " ");
			}
			System.out.println();
		}

		scanner.close();
	}
}
