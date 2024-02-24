package faq.programs;
import java.util.Scanner;

public class GcdOf2Numbers
{
	int rem;
 public	int findGcdOf2Numbers(int m,int n)
	{
	   while(n!=0)
	   {
		   rem=m%n;
		   m=n;
		   n=rem;
	   }
	int gcd=m;
	    
	return gcd;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
        System.out.println("enter the 2 numbers");
        int m=sc.nextInt();
        int n=sc.nextInt();
        GcdOf2Numbers gcd=new GcdOf2Numbers();
        int result= gcd.findGcdOf2Numbers(m, n);
        System.out.println("The Gcd of"+m+"and"+n+"is :"+result);
        sc.close();
	}

}
