package exam02;

// numberŬ���� : ���ڸ� Ŭ���� ó�� �����ϰ� ������ ���
// Boxing = ���ڵ��� Ŭ������ ����
// unboxing = Ŭ������ ����ߴ��� �ٽ� ���ڷ� ���°�

public class NumberEx {

	public static void main(String[] args) {

		Integer i1 = new Integer(10); //IntegerŸ���� ��ü ����(=�ν��Ͻ�)
		int a = i1.intValue();
		System.out.println(a);
		
		Double d1 = new Double(3.14);
		System.out.println(d1.floatValue());
		
		
		Integer i2 = 20; //�ڵ� boxing
		int b = i2 + 40; //�ڵ� unboxing
		System.out.println(b);
		
		String s1 = Double.toString(3.14);
		System.out.println(s1.charAt(0)); // �����̹Ƿ� chatAt()�� �����ϴ�.
		
		
		double c = 3.14;
		
		
	}

}
