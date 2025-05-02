package javapractice;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingEx {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\VIJAY TOTRE\\Pictures\\Code.txt");
		file.createNewFile();

		FileWriter FE = new FileWriter(file);
		FE.write("Mumbai is capital of Maharashtra");
		FE.close();
		System.out.println(file.length());
        System.out.println(file.getName());
		System.out.println(file.hashCode());
		
		FileReader FR=new FileReader(file);
		FR.read();
        System.out.println(FR.equals(FE));
        System.out.println(FR.ready());
        FR.close();

	}
}
