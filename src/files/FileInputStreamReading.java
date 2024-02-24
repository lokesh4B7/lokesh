package files;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamReading
{

	public static void main(String[] args) throws IOException
	{
		File f1=new File("./sample1.txt");
        
		//System.out.println(f1.createNewFile());
		
		/*reading data from file using FileInputStream*/
		FileInputStream fis=new FileInputStream(f1);
		
		//read():it reads the character by character in the given file.
		//System.out.println((char)fis.read());   
		int ascii;
		while((ascii=fis.read())!=-1)
		{
			System.out.print((char)ascii);
		}
		
		fis.close();
	}
}
