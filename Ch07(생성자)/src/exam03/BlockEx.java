package exam03;
//��� : { }  ���� �Լ���� (�޼���), �ν��Ͻ� ��� , �������(static���)
public class BlockEx {
	
	//������
	public BlockEx() {
		System.out.println("�⺻������ ȣ���");
		
	}
	
	//����ƽ ��� : Ư¡
	//��￩�� ���´�(ETALIC)
	//�����޸� ���
	
	static {
		System.out.println("�����ʱ�ȭ ��� �ʱ�ȭ");
	}
	
	// �ν��Ͻ� ���
		{
			System.out.println("�ν��Ͻ� ��� ȣ���");
		}

	//ȣ����� : ������� -> �ν��Ͻ� ��� -> ������ ȣ��
	public static void main(String[] args) {
		
		BlockEx b1 = new BlockEx();
		
		
		
		
	}

}
