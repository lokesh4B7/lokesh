package faq.programs;

import java.util.Scanner;
public class IndividualSub
{
	int rem,sub=0;
	public int findIndividualSub(int n)
	{
		while(n>0)
		{
			rem=n%10;
			sub=sub-rem;
			n=n/10;
		}
		return sub;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		IndividualSub is=new IndividualSub();
		int result=is.findIndividualSub(a);
		System.out.println("The individual subtraction is :"+result);
         sc.close();
	}

}
