package exam01;

import java.io.FileInputStream;

public class FileOUtputEx02 {

	public static void main(String[] args) throws Exception{

		byte[] b = new byte[1024];
		FileInputStream file = new FileInputStream("d:\\output.txt");
		file.read(b);
		System.out.println(new String(b));
		file.close();
		
		
		
	}

}
