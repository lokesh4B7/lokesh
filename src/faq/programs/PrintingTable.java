package faq.programs;

import java.util.Scanner;
public class PrintingTable 
{
  public void findPrintingTable(int n)
   {
	  for(int i=1;i<=10;i++)
	  {
		  System.out.println(n+"*"+i+"="+n*i);
	  }
   }
  public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the table number");
		int a=sc.nextInt();
		PrintingTable pt=new PrintingTable();
		pt.findPrintingTable(a);
		sc.close();
	}

}
