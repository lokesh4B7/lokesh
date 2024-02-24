package faq.programs;

import java.util.Scanner;
public class PrimeNumberRange
{
  public void findPrimeNumberRange(int n)
  {
	 for(int i=1;i<=n;i++)
	 {
		 int count=0;
		 for(int j=1;j<=i;j++)
		 {
			 if(i%j==0)
			 {
				 count++;
			 }
		 }
		 if(count==2)
		 {
			 System.out.println(i);
		 }
	 }
	
  }
 public static void main(String[] args)
 {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Max Range of Number");
		int Max=sc.nextInt();
		PrimeNumberRange pnr=new PrimeNumberRange();
	    pnr.findPrimeNumberRange(Max);
        sc.close();
	}

}
