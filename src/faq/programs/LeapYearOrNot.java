package faq.programs;

import java.util.Scanner;

public class LeapYearOrNot 
{
	public void findLeapYear(int year)
	{
	   if ((year % 4 == 0 && year%100!=0) || (year % 400 == 0)) 
	   {
			System.out.println("Leap Year");
		} 
	   else
	   {
			System.out.println("Not Leap Year");
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year");
		int year = sc.nextInt();
		LeapYearOrNot lp=new LeapYearOrNot();
		lp.findLeapYear(year);
		sc.close();
	}
      
}
