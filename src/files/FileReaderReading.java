package files;
import java.io.File;
import java.io.*;

public class FileReaderReading
{

	public static void main(String[] args) throws IOException
	{
		File f1=new File("./sample1.txt");
        
		
		/*reading data from file using FileReader*/
		FileReader fr=new FileReader(f1);
		
		//read():it reads the character by character in the given file.
		
		int ascii;
		while((ascii=fr.read())!=-1)
		{
			System.out.print((char)ascii);
		}
		
		fr.close();
	}
}
