package arrays;
import java.util.Scanner;
public class CopyingOneArraytoAnotherArray
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size you want");
		int n = sc.nextInt();
		//creating 1st array.
		int arr1[] = new int[n];
		System.out.print("enter array elements in to array");
		for (int i = 0; i < arr1.length; i++) 
		{
			arr1[i] = sc.nextInt();
		}
		//creating 2nd array  based on 1st array length
       int arr2[]=new int [arr1.length];
       for(int i=0;i<arr1.length;i++)
       {
    	   arr2[i]=arr1[i];
       }
       System.out.println("The elements in first array is ");
       for (int i=0; i<arr1.length; i++) 
		{
			System.out.print(arr1[i]+" ");
		}
       System.out.println();
       System.out.println("The elements in second array is ");
       for (int i=0; i<arr2.length; i++) 
		{
			System.out.print(arr2[i]+" ");
		}
       sc.close();
    }

}
