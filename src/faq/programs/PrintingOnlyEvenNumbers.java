package faq.programs;

import java.util.Scanner;
public class PrintingOnlyEvenNumbers
{
	int rem,sum=0;
	public int findPrintingOnlyEvenNumbers(int n)
	{
		while (n > 0) 
		{
			rem=n%10;
			if(rem%2==0)
			{
			   System.out.println(rem + " ");
			   sum = sum + rem;
			}
			n=n/10;
		}
		return sum;
	}
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		PrintingOnlyEvenNumbers pe=new PrintingOnlyEvenNumbers();
		int sum=pe.findPrintingOnlyEvenNumbers(n);
		System.out.println("Sum of even numbers is " + sum);
		sc.close();
	}

}
