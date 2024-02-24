package faq.programs;

import java.util.Scanner;
public class Exp2 
{
  public void findEvenPrimeNumber(int a)
  {
      for(int i=1;i<=a;i++)
      {
    	  if(i%2!=0)
    	  {
    		  if(i%5==0)
    		  {
    			  System.out.println(i);
    		  }
    	  }
      }
	  

  }
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		Exp2 ex=new Exp2();
		ex.findEvenPrimeNumber(n);
       
       
	}
}
