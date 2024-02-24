package files;

import java.io.File;

public class FileHandling {

	public static void main(String[] args) throws Exception {
		File f = new File("D:\\javaprogram\\Lokesh1.txt");

		// 1)createNewFile():it creates new file if the file not exist it will create
		// returns true else returns false for already exist file.

		System.out.println(f.createNewFile());

		// 2)delete():it deletes the already existed file.

		// System.out.println(f.delete());

		// 3 exists():it checks whether the given file exist or not. if exist returns
		// true otherwise false.

		System.out.println(f.exists());

		// 4)isHidden():It checks whether the given file hidden or not. if it is hidden
		// returns true otherwise false.

		System.out.println(f.isHidden());

		// 5)canWrite():it checks whether the given file is only or not

		System.out.println(f.canWrite());

		f.setWritable(true); // if we kept true on it we can write easily otherwise set false cannot written.

		System.out.println(f.canWrite());
	}

	// 6)
}
