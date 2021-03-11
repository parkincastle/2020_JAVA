package exam02;

import java.util.Iterator;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {

		Vector<Board> vector = new Vector<>();
		System.out.println("용량 : " + vector.capacity());// 기본 용량 10
		System.out.println("사이즈 : " + vector.size());
		System.out.println("==================================");
		//객체 추가 
		vector.add(new Board("제목 1", "내용 1", "작가 1"));
		vector.add(new Board("제목 2", "내용 2", "작가 2"));
		vector.add(new Board("제목 3", "내용 3", "작가 3"));
		vector.add(new Board("제목 4", "내용 4", "작가 4"));
		vector.add(new Board("제목 1", "내용 1", "작가 1"));
		System.out.println("용량 : " + vector.capacity());// 기본 용량 10
		System.out.println("사이즈 : " + vector.size());
		System.out.println("==================================");
		//객체 삭제
		vector.remove(2);
		System.out.println("용량 : " + vector.capacity());// 기본 용량 10
		System.out.println("사이즈 : " + vector.size());
		System.out.println("==================================");
		
		// 용량 확보
		vector.ensureCapacity(20);
		System.out.println("용량 : " + vector.capacity());// 기본 용량 10
		System.out.println("사이즈 : " + vector.size());
		System.out.println("==================================");
		
		//향상된 for문 이용하여 출력
		for(Board b : vector) {
			System.out.println(b.subject + " " + b.content + " " + b.writer);
		}
		
		//반복자(Iterator Interface)로 출력
		Iterator<Board> iterator = vector.iterator();
		while(iterator.hasNext()) {
			Board b = iterator.next();
			System.out.println(b.subject + " " + b.content + " " + b.writer);

			
		}
			
		
		
		
		
	}

}
