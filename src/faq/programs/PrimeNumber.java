package faq.programs;

import java.util.Scanner;
public class PrimeNumber 
{
	int count=0;
	public int findPrimeNumber(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
			
		}
		
		return  count;
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		PrimeNumber pn=new PrimeNumber();
		int count=pn.findPrimeNumber(a);
		if(count==2) 
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println(" not prime number");
		}
		sc.close();

	}

}
