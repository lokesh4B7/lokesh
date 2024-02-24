package arrays;

import java.util.*;
public class SumOf2ArraysInto3rdArray 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array1 size you want");
		int m = sc.nextInt();
		int arr1[] = new int[m];
		System.out.println("enter elements into an aray1");
		for (int i=0;i<m;i++)
		{
			arr1[i]=sc.nextInt();
		}
		int arr2[] = new int[arr1.length];
		System.out.println("enter elements into an aray2");
		for (int i=0;i<arr1.length;i++)
		{
			arr2[i]=sc.nextInt();
		}
		//stored into third array
		int arr3[]=new int[arr1.length];
        for(int i=0;i<arr1.length;i++)
        {
        	arr3[i]=arr1[i]+arr2[i];
        }
        for(int a:arr3)
        {
        	System.out.println(a);
        }
	}

}
