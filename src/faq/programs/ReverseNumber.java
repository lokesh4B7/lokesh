package faq.programs;

import java.util.Scanner;
public class ReverseNumber 
{
  int rem,rev=0;
  int findReverseNumber(int a)
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
		ReverseNumber rn=new ReverseNumber();
		int result=rn.findReverseNumber(n);
		System.out.println("The reverse number is :"+result);
		sc.close();
	}

}
