package exam02;

public class SecondArrayEx01 {

	//2���� �迭[][] �� ����� ���
	public static void main(String[] args) {
		
		int[][] num = new int[][] {{10, 20, 30}, {100, 90, 80}};
		
		
		//2���� �迭 ��� : for��
		System.out.println("��ø for��");
		for(int i = 0; i < 2; i++) {
			
			for(int j = 0; j < 3; j++) {
				System.out.println(num[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println(num);//num�� �迭 �ּ�
		System.out.println(num.length); //2 (��)
		System.out.println(num[0].length); //3 (��)
		
		//2���� �迭 ��� : ������ for��
		//for(������ Ÿ�� ���� : �迭)
		System.out.println("������ for��");
		for(int[] tmp : num) { //�迭�� ó��~������ ������ ��������
			
			for(int i : tmp) {
				System.out.println(i + " ");
			}
			System.out.println();
		}
		
	}

}
