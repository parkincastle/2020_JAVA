package exam02;

public class SecondArrayEx02 {

	public static void main(String[] args) {
		
		int[][] score = new int[][] {
			{100, 99, 50}, {93, 56, 99}, {34, 100, 77}
		};
		int sum = 0;
		double avg = 0.0;
		
		System.out.println("번호   국어   영어   수학   총점   평균");
		for(int i = 0; i < score.length; i++) {
			System.out.println(" " + (i+1) + "  ");
			
			
			for(int j = 0;j < score[i].length; j++) {
				sum += score[i][j];
				System.out.printf("%3d ", score[i][j]);
			}
			avg = sum/3.0;
			System.out.print(sum + " ");
			System.out.printf("%.2f", avg);
			System.out.println();
		}
		
		
	}
	
}
