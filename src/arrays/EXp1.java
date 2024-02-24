package arrays;

import java.util.Scanner;

public class EXp1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sumofeven = 0, sumofodd = 0;
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			if (arr[i] % 2 == 0) {
				sumofeven = sumofeven + arr[i];
			} else {
				sumofodd = sumofodd + arr[i];
			}
		}
		System.out.println(sumofeven - sumofodd);
		
		sc.close();
	}
}