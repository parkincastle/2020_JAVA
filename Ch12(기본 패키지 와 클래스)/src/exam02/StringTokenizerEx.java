package exam02;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {

		String str = "time is gold, no pain no gain ";
		
		// 자르기
		StringTokenizer s1 = new StringTokenizer(str, ", "); // ,와  공백이 있으면 자른다.
		
		// 개수 세기
		System.out.println(s1.countTokens());
		
		// 다음 Token이 잇는 동안 Token을 찍는다.
		while(s1.hasMoreTokens())
			System.out.println("(" + s1.nextToken() + ")");
		
		
		
		
	}

}
