package exam08;

public class SoundEx {

	public static void main(String[] args) {
		
		//��ü���� () { /�̾��� Ŭ���� ó�� ���/ �߻�ü(){}}
		//���������δ� Ŭ�����ϱ� ������� ������ �� ������
		//�ܺο��� ������ �Ұ��� �ϴ�. �ٺ��� ������
		Soundable soundable1 = new Soundable() {
			
			int a = 100;
			
			public void method() {
				System.out.println("�͸� ���� ��ü");
			}
			
			@Override
			public void sound(int a) {
				this.a = a;
				String str = "�߿�";
				System.out.println("����� : " + str);
				this.method();
				System.out.println(this.a);
			}
		};
		soundable1.sound(10);
		
		Soundable soundable2 = new Soundable() {
				
				int a = 100;
				
				public void method() {
					System.out.println("�͸� ���� ��ü");
				}
				
				@Override
				public void sound(int a) {
					this.a = a;
					String str = "�۸�";
					System.out.println("�� : " + str);
					this.method();
					System.out.println(this.a);
			}
		};
		
		soundable2.sound(10);
		
		
		
	}

}
