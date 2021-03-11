package exam02;

public class SecondArrayEx01 {

	//2차원 배열[][] 의 선언과 출력
	public static void main(String[] args) {
		
		int[][] num = new int[][] {{10, 20, 30}, {100, 90, 80}};
		
		
		//2차원 배열 출력 : for문
		System.out.println("중첩 for문");
		for(int i = 0; i < 2; i++) {
			
			for(int j = 0; j < 3; j++) {
				System.out.println(num[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println(num);//num의 배열 주소
		System.out.println(num.length); //2 (행)
		System.out.println(num[0].length); //3 (열)
		
		//2차원 배열 출력 : 개선된 for문
		//for(데이터 타입 변수 : 배열)
		System.out.println("개선된 for문");
		for(int[] tmp : num) { //배열을 처음~끝까지 무조건 가져오기
			
			for(int i : tmp) {
				System.out.println(i + " ");
			}
			System.out.println();
		}
		
	}

}
