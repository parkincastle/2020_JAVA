package exam01;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputEx {

	public static void main(String[] args) throws Exception{

		FileOutputStream file = new FileOutputStream("d:\\output.txt"); // D드라이브에 저장
		
		for(int i = 0; i < 10; i++) {
			String data = (i + 1) + "번째 줄 입니다.\r\n";
			file.write(data.getBytes());
		}
		file.flush();// 버퍼 지우기
		file.close();// 스트림 닫기
		
		// true는 내용 수정
		FileOutputStream file2 = new FileOutputStream("d:\\output.txt", true); // D드라이브에 저장
		
		for(int i = 0; i < 10; i++) {
			String data = (i + 1) + "번째 줄 입니다.\r\n";
			file2.write(data.getBytes());
		}
		file2.flush();
		file2.close();
		
		
		
	}

}
