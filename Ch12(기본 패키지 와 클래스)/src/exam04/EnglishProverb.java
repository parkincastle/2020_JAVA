package exam04;

import java.util.Arrays;
import java.util.StringTokenizer;

public class EnglishProverb {

	public static void main(String[] args) {

		String proverb = "Empty Vessels make the most sound.";
		System.out.println("�Է� : " + proverb);

		StringTokenizer st = new StringTokenizer(proverb, " .");

		int i = 0;
		int n = st.countTokens();

		String[] s = new String[n];

		while (st.hasMoreTokens()) {
			s[i++] = st.nextToken();
		}

		System.out.println("���� �� : ");
//		while (st.hasMoreTokens()) {
//			System.out.println(st.nextToken() + " ");
//		}
		System.out.println(Arrays.toString(s));
		System.out.println("���� �� : ");
		
		Arrays.sort(s);
		System.out.println(Arrays.toString(s));
		
		

	}

}
