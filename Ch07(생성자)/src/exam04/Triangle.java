package exam04;
//�ﰢ���� �غ��� ���̸� �����Ѵ�.
//������(�Ű����� 2��)
//����޼��� : ���� ���ϱ� - area()

public class Triangle {

	//����
	double under;
	double height;
	
	//������
	public Triangle() {
		this(1,3.6);
	}
	
	public Triangle(double under, double height) {
		this.under = under;
		this.height = 3.6;
	}
	public Triangle(double under) {
		this();
		this.under = under;
	}
	
	//���� ���ϴ� �޼��� ����� ���
	public double area() {
		return (this.under*this.height)/2;
	}
	
}
