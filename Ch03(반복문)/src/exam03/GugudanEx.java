package exam03;

public class GugudanEx {

	//2단~9단 까지
	public static void main(String[] args) {
		
		for(int i=2;i<=9;i++) {
			for(int j=2;j<=9;j++) {
				System.out.println(i+"*"+j+"="+(i*j));
				System.out.printf("%d * %d = %2d", i,j,i*j);

			}
			System.out.println();
		}
	}

}
