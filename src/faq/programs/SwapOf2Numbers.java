package faq.programs;

import java.util.Scanner;
public class SwapOf2Numbers
{
   public void findSwapOf2Numbers(int a,int b)
   {
	   System.out.println("before Swap of 2 numbers is :"+a+" "+b);   
	   int t=a;
	       a=b;
	       b=t;
	   System.out.println("after Swap of 2 numbers is :"+a+" "+b);    
   }
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number1");
		int a=sc.nextInt();
		System.out.println("Enter the number2");
		int b=sc.nextInt();
		SwapOf2Numbers sn=new SwapOf2Numbers();
		sn.findSwapOf2Numbers(a,b);
         sc.close();
	}

}
