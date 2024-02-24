package faq.programs;

import java.util.Scanner;
public class Multiplication
{
	int sum = 0;
	int findMultilication(int n1, int n2)
	{
		for (int i = 1; i <= n2; i++)
		{
			sum = sum + n1;
		}
		return sum;
	}
   public static void main(String[] args)
   {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number 1");
		a = sc.nextInt();
		System.out.println("enter number 2");
		b = sc.nextInt();
		Multiplication m1 = new Multiplication();
		int result = m1.findMultilication(a, b);
		System.out.println("The multliplication of 2 numbers is :" + result);
		sc.close();

	}

}
