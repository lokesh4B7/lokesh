package arrays;

import java.util.*;
public class ThirdLargestElementInArray
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
        int First_Max=Integer.MIN_VALUE;
        int Second_Max=Integer.MIN_VALUE;
        int Third_Max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
        	if(arr[i]>First_Max)
        	{
        		Second_Max=First_Max;
        		First_Max=arr[i];
        		
        	}
        	else if(arr[i]<First_Max && arr[i]>Second_Max)
        	{
        		Third_Max=Second_Max;
        		Second_Max=arr[i];
        	}
        	else if(arr[i]<Second_Max && arr[i]>Third_Max )
        	{
        		Third_Max=arr[i];
        	}
        	
        }
        System.out.println("The First max element is :"+First_Max);
        System.out.println("The Second max element is :"+Second_Max);
        System.out.println("The Third max element is :"+Third_Max);
        sc.close();
	}

}
