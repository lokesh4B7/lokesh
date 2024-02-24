package files;
import java.io.*;
public class FileWriterWriting
{
	public static void main(String[] args) throws Exception
	{
		File f1=new File("./sample1.txt");
         if(f1.exists())
         {
        	 f1.delete();
         }
         f1.createNewFile();
         String s="Hello lokesh samudrala";
         FileWriter fw=new FileWriter(f1);
         
		  fw.write(s);
		fw.close();
	}

}


