package exam01;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputEx {

	public static void main(String[] args) throws Exception{

		FileOutputStream file = new FileOutputStream("d:\\output.txt"); // D����̺꿡 ����
		
		for(int i = 0; i < 10; i++) {
			String data = (i + 1) + "��° �� �Դϴ�.\r\n";
			file.write(data.getBytes());
		}
		file.flush();// ���� �����
		file.close();// ��Ʈ�� �ݱ�
		
		// true�� ���� ����
		FileOutputStream file2 = new FileOutputStream("d:\\output.txt", true); // D����̺꿡 ����
		
		for(int i = 0; i < 10; i++) {
			String data = (i + 1) + "��° �� �Դϴ�.\r\n";
			file2.write(data.getBytes());
		}
		file2.flush();
		file2.close();
		
		
		
	}

}
