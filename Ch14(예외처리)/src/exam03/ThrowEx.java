package exam03;

public class ThrowEx {

	public static void main(String[] args) {
		
		//���ܰ� �߻��� ������ try�� ������
		try {
			throw new Exception("���Ƿ� ���ܸ� �߻���Ŵ");
		}
		catch(Exception e){
			System.out.println("���ܹ߻�");
			System.out.println(e.getMessage());
		}finally {
			System.out.println("���� ����");
		}
		
	}
	
}
