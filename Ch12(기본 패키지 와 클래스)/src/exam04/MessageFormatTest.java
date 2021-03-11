package exam04;

import java.text.MessageFormat;

public class MessageFormatTest {

	public static void main(String[] args) {

		Object[][] data = {{"세종대왕", 1, "조선"}, {"오마바", 2, "미국"}, {"징기스칸", 3, "몽골"}};
//		for(Object[] o : data) {
//			String s = MessageFormat.format("이름 : {0}\t번호 : {1}\t국적 : {2}\t", o);
//			System.out.println(s);
//		}
		
		for(int i = 0; i < data.length; i++) {
			String s = MessageFormat.format("이름 : {0}\t번호 : {1}\t국적 : {2}\t", o);
			System.out.println(s);
		}
		
		
	}

}
