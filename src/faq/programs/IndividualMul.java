package faq.programs;

import java.util.*;
public class IndividualMul 
{
	int rem,mul=1;
	public int findIndividualMul(int n)
	{
		while(n>0)
		{
			rem=n%10;
			mul=mul*rem;
			n=n/10;
		}
		return mul;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		IndividualMul im=new IndividualMul();
		int result=im.findIndividualMul(a);
		System.out.println("The individual multiplication is :"+result);
        sc.close();
	}

}
