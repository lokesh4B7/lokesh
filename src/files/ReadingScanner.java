package files;
import java.util.Scanner;
import java.io.*;

public class ReadingScanner
{

	public static void main(String[] args) throws Exception
	{
		File f1=new File("./sample1.txt");

		/*reading data from scanner class*/
		
		Scanner sc=new Scanner(f1);
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}
		
		sc.close();
	}

}
