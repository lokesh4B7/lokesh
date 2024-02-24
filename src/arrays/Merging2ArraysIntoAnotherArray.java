package arrays;

import java.util.Scanner;
public class Merging2ArraysIntoAnotherArray
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array1 size you want");
		int n = sc.nextInt();
		//creating 1st array.
		int arr1[] = new int[n];
		System.out.print("enter array elements in to array");
		for (int i = 0; i < arr1.length; i++) 
		{
			arr1[i] = sc.nextInt();
		}
		System.out.println("enter array2 size you want");
		int m = sc.nextInt();
		//creating 2nd array
		int arr2[]=new int [m];
		System.out.print("enter array elements in to array");
		for (int i = 0; i < arr2.length; i++) 
		{
			arr2[i] = sc.nextInt();
		}
		//creating 3rd array
		int arr3[]=new int[arr1.length+arr2.length];
		int index=0;
        for(int i=0;i<arr1.length;i++)
        {
        	arr3[index++]=arr1[i];
        }
        for(int i=0;i<arr2.length;i++)
        {
        	arr3[index++]=arr2[i];
        }
        System.out.println("Merged Array:");
        for (int num : arr3) {
            System.out.print(num + " ");
        }
        sc.close();
	}

}
