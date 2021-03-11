package exam3;
//제네릭 클래스, 파라미터가 2개 => 멀티파라미터
public class Product<T, M> {
	
	private T t;
	private M m;
	
	public T getT() {
		return t;
	}
	
	public void setT(T t) {
		this.t = t;
	}
	
	public M getM() {
		return m;
	}
	
	public void setM(M m) {
		this.m = m;
	}
	

	
	
	
}
