package exam08;

public class PersonEx {

	public static void main(String[] args) {
		
		Parent parent = new Parent() {
			//�͸� �ڼ� ��ü
			
			String str = "�߿�";
			public void method2() {
				System.out.println("�͸� �ڼ� ��ü");
			}
			@Override
			public void method() {
				
				this.method2();
				System.out.println("����� : " + this.str);
			}
			
		};
		parent.method();
	}

}
