package exam01;

public class ForEx {

	public static void main(String[] args) {

		int sum = 0;

		for (char a = 65; a <= 90; a++) {

			System.out.print(a+" ");
			sum += a;
			if (a % 5 == 0) {
				System.out.println();
			}
		}
	}

}
