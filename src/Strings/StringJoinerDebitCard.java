package Strings;

import java.util.*;
public class StringJoinerDebitCard
{

	public static void main(String[] args)
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the delimiter");
	  String delimiter=sc.nextLine();
	  StringJoiner sj=new StringJoiner(delimiter);
	  for(int i=1;i<=4;i++)
	  {
		  System.out.println("Enter the debit card number each time 4 times");
		  sj=sj.add(sc.nextLine());
	  }
	  System.out.println("the debit card number is: "+sj);
      sc.close();
	}

}
