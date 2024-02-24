package faq.programs;

import java.util.Scanner;

public class SwapOf2NumbersWithOutUsingThirdVariable
{
  public void findSwapOf2NumbersWithOutUsingThirdVariable(int a,int b)
   {
		   System.out.println("before Swap of 2 numbers is :"+a+" "+b);   
		       a=a+b;
		       b=a-b;
		       a=a-b;
		   System.out.println("after Swap of 2 numbers is :"+a+" "+b);    
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number1");
		int a=sc.nextInt();
		System.out.println("Enter the number2");
		int b=sc.nextInt();
		SwapOf2NumbersWithOutUsingThirdVariable snt=new SwapOf2NumbersWithOutUsingThirdVariable();
		snt.findSwapOf2NumbersWithOutUsingThirdVariable(a,b);
        sc.close();

	}

}
