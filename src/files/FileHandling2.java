package files;
import java.io.File;
import java.io.IOException;

public class FileHandling2
{
	public static void main(String[] args) throws IOException 
	{
		File f1 = new File("D:\\javaprogram\\Lokesh2new");

		if (f1.exists())
		{
			System.out.println(f1.delete());
		} 
		else 
		{
			System.out.println(f1.createNewFile());

		}
	}
}
