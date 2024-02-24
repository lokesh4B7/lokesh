package files;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
public class FolderCreation
{

	public static void main(String[] args) throws IOException
	{
		File f1=new File("C:\\Users\\DELL\\eclipse-workspace\\Lokesh"); 
  
		System.out.println(Arrays.toString(f1.list()));
		System.out.println(Arrays.toString(f1.listFiles()));
		 // System.out.println(f1.mkdir());   //it creates 1 folder
		 // System.out.println(f1.mkdirs());  //it creates 2 folders  
		
		//mkdir stands for make directory
		// mkdirs stands for making directories.
		/*  
	      if (f1.exists())
		  {
			System.out.println(f1.delete());
		   } 
		  else 
		   {
			System.out.println(f1.createNewFile());

		   }	  */
	}

}
