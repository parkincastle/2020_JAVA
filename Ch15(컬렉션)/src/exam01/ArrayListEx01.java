package exam01;

import java.util.ArrayList;

public class ArrayListEx01 {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		System.out.println("크기 : " + list.size());
		
		//객체 추가하기
		
		//new String ("111")
		list.add("111");
		list.add("222");
		list.add("333");
		list.add("222");
		
		//new Integer(111)
		list.add(111);
	
		System.out.println("크기 : " + list.size());
		System.out.println("주소 : " + list.hashCode());
		System.out.println("리스트의 값 : " + list.toString());
		
		//0번째 인덱스에 "333" 추가
		list.add(0, "333");
		System.out.println("크기 : " + list.size());
		System.out.println("리스트의 값 : " + list.toString());

		//객체를 삭제하기 (동일한 객체가 있다면 앞에서 부터 삭제된다.)
		list.remove("333");
		System.out.println("리스트의 값 : " + list.toString());
		System.out.println(list.remove("333"));
		System.out.println("리스트의 값 : " + list.toString());
		
		//인덱스 검색하기
		System.out.println("인덱스 : " + list.indexOf("333") + "번째 값");
		
		//객체 전체 삭제하기
//		list.clear();
		for(int i = list.size()-1; i >= 0 ; i--) {
			list.remove(i);
		}
		System.out.println("리스트의 값 : " + list.toString());

		
		
		
		
	}

}
