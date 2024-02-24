package files;
import java.io.*;
public class BufferedWriterWriting
{
	public static void main(String[] args) throws Exception
	{
		File f1=new File("./sample1.txt");
		if(f1.exists())
		{
			f1.delete();
		}
		f1.createNewFile();
		
		String s1="Hello Hyderabad";
		
		BufferedWriter bw=new BufferedWriter(new FileWriter(f1));
		bw.write(s1);
		bw.close();
	}

}
