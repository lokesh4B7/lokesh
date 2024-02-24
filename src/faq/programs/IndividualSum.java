package faq.programs;

import java.util.*;
public class IndividualSum
{
	int rem,sum=0;
	public int findIndividualSum(int n)
	{
		while(n>0)
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		return sum;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		IndividualSum is=new IndividualSum();
		int result=is.findIndividualSum(a);
		System.out.println("The individual sum is :"+result);
         sc.close();
	}

}
