package exam01;
//제네릭 코드
class TV<E>{
	
	private E e;

	public E getE() {
		return e;
	}

	public void setE(E e) {
		this.e = e;
	}
	
}

public class TVEx {

	public static void main(String[] args) {
		
		TV<String> tv1 = new TV<String>();
		tv1.setE("홍길동");
		
		String str = tv1.getE();
		System.out.println(str);
		
		TV<Integer> tv2 = new TV<>();
		tv2.setE(new Integer(100));
		int num = tv2.getE();
		System.out.println(num);
		
		
		
		
	}

}
