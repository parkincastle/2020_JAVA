package exam02;

import java.util.Iterator;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {

		Vector<Board> vector = new Vector<>();
		System.out.println("�뷮 : " + vector.capacity());// �⺻ �뷮 10
		System.out.println("������ : " + vector.size());
		System.out.println("==================================");
		//��ü �߰� 
		vector.add(new Board("���� 1", "���� 1", "�۰� 1"));
		vector.add(new Board("���� 2", "���� 2", "�۰� 2"));
		vector.add(new Board("���� 3", "���� 3", "�۰� 3"));
		vector.add(new Board("���� 4", "���� 4", "�۰� 4"));
		vector.add(new Board("���� 1", "���� 1", "�۰� 1"));
		System.out.println("�뷮 : " + vector.capacity());// �⺻ �뷮 10
		System.out.println("������ : " + vector.size());
		System.out.println("==================================");
		//��ü ����
		vector.remove(2);
		System.out.println("�뷮 : " + vector.capacity());// �⺻ �뷮 10
		System.out.println("������ : " + vector.size());
		System.out.println("==================================");
		
		// �뷮 Ȯ��
		vector.ensureCapacity(20);
		System.out.println("�뷮 : " + vector.capacity());// �⺻ �뷮 10
		System.out.println("������ : " + vector.size());
		System.out.println("==================================");
		
		//���� for�� �̿��Ͽ� ���
		for(Board b : vector) {
			System.out.println(b.subject + " " + b.content + " " + b.writer);
		}
		
		//�ݺ���(Iterator Interface)�� ���
		Iterator<Board> iterator = vector.iterator();
		while(iterator.hasNext()) {
			Board b = iterator.next();
			System.out.println(b.subject + " " + b.content + " " + b.writer);

			
		}
			
		
		
		
		
	}

}
