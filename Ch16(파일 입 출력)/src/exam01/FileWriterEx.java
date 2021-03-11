package exam01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class FileWriterEx {

	public static void main(String[] args) throws Exception{

		FileWriter file = new FileWriter("d:\\output2.txt");
		
		for(int i = 0; i < 10; i++) {
			String data = (i + 1) + "번째 줄 입니다.\r\n";
			file.write(data);
		}
		file.flush();
		file.close();
		
		FileWriter fw2 = new FileWriter("d:\\output2.txt", true);
		
		for(int i = 0; i < 10; i++) {
			String data = (i + 1) + "번째 줄 입니다.\r\n";
			fw2.write(data);
		}
		fw2.flush();
		fw2.close();
		
		BufferedReader br = new BufferedReader(new FileReader("d:\\output.txt"));
		
		for(int i = 0; i < 10; i++) {
			String line = br.readLine();
			if(line == null) {
				break;
			}
			System.out.println(line);
			
		}
		br.close();
	}

}
