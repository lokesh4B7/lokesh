package arrays;

import java.util.*;
public class ThirdSmallestElementInArray 
{
	 public static void main(String[] args) 
	    {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter array size");
	        int n=sc.nextInt();
	        int arr[]=new int[n];
	        System.out.println("Enter the elements into an array");
	        for(int i=0;i<n;i++)
	        {
	            arr[i]=sc.nextInt();
	        }
	        int First_Small=Integer.MAX_VALUE;
	        int Second_Small=Integer.MAX_VALUE;
	        int Third_Small=Integer.MAX_VALUE;
	        for(int i=0;i<n;i++)
	        {
	        	if(arr[i]<First_Small)
	        	{
	        		Second_Small=First_Small;
	        		First_Small=arr[i];
	        		
	        	}
	        	else if(arr[i]>First_Small && arr[i]<Second_Small)
	        	{
	        		Third_Small=Second_Small;
	        		Second_Small=arr[i];
	        	}
	        	else if(arr[i]>Second_Small && arr[i]<Third_Small )
	        	{
	        		Third_Small=arr[i];
	        	}
	        	
	        }
	        System.out.println("The First small element is :"+First_Small);
	        System.out.println("The Second small element is :"+Second_Small);
	        System.out.println("The Third small element is :"+Third_Small);
	        sc.close();
	    }
}