package faq.programs;

import java.util.Scanner;
public class ArmstrongNumber 
{
	int rem,sum=0;
  public int findArmstronfNumber(int a)
  {
	  while(a >0)
	  {
		 rem=a%10;       //This will give last digit of the given number.
		 sum=sum+(rem*rem*rem);  
		 a=a/10;         //This will remove the last digit of the given number.
	  }
	  return sum;
  }
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		ArmstrongNumber an=new ArmstrongNumber();
		int result=an.findArmstronfNumber(n);
		if(result==n)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println(" Not Armstrong Number");
		}
		sc.close();
	}

}
