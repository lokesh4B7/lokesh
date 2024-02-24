package faq.programs;

import java.util.Scanner;
public class FactorialNumber
{ 
	int fact=1;
   public int findFactorialNumber(int a)
	{
	   for(int i=a;i>=1;i--)
	   {
		   fact=fact*i;
	   }
		 return fact;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
	    FactorialNumber fn=new FactorialNumber();
		int result=fn.findFactorialNumber(n);
		System.out.println("The factorial value is :"+result);
		sc.close();
	}

}
