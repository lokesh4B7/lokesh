package faq.programs;

import java.util.Scanner;
public class FibonacciSeries 
{
   public void findFibonacciSeries(int a,int b,int n)
   {
	   System.out.print(a+" "+b+" ");
	   for(int i=3;i<=n;i++)
	   {
		  int c=a+b;	
		  System.out.print(c+" ");
		   a=b;
		   b=c;
	   }
   }
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number1");
		int a=sc.nextInt();
		System.out.println("enter number2");
		int b=sc.nextInt();
		System.out.println("enter the max range");
		int n=sc.nextInt();
		FibonacciSeries fs=new  FibonacciSeries();
		fs.findFibonacciSeries(a,b,n);
		sc.close();
	}

}
