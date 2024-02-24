package files;
import java.io.File;
import java.io.FileOutputStream;
public class FileOutputStreamWriting
{
	public static void main(String[] args) throws Exception
	{
		File f1=new File("./sample1.txt");
        
		if(f1.exists())
		{
			System.out.println(f1.delete());
		}
		System.out.println(f1.createNewFile());
		String s="hello lokesh samudrala";
		FileOutputStream fos=new FileOutputStream(f1);
		for(char ch:s.toCharArray())
		{
			fos.write((int)ch);
		}
		fos.close();
	}
}
