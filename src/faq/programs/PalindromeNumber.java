package faq.programs;

import java.util.Scanner;
public class PalindromeNumber
{
	int rem,rev=0;
	public int findpalindromeNumber(int a)
	{
	   while(a >0)
		{
			rem=a%10;       //This will give last digit of the given number.
			rev=rev*10+rem;  
			a=a/10;         //This will remove the last digit of the given number.

		}
	   return rev;
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		PalindromeNumber pn=new PalindromeNumber();
		int result=pn.findpalindromeNumber(n);
		if(result==n)
		{
			System.out.println("palindrome number");
		}
		else
		{
			System.out.println("Not palindrome number");
		}
		sc.close();

	}

}
