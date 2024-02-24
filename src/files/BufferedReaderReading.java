package files;
import java.io.*;
public class BufferedReaderReading 
{
   public static void main(String[] args) throws IOException
    {
			File f1=new File("./sample1.txt");
			
			/*reading data from file using BufferReader*/
			/* Buffer reads both character wise and line wise.*/
			FileReader fr=new FileReader(f1);
			BufferedReader br=new BufferedReader(fr);
			/*int ascii;
			while((ascii=br.read())!=-1)                   //reading character by character
			{
				System.out.print((char)ascii);
			}*/
			String s=new String("");
			
			while((s=br.readLine())!=null)                   //reading line by line.
			{
				System.out.println(s);
			}
			fr.close();
			br.close();
	}
}
