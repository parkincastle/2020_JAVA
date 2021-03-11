package exam03;

//메서드 오버로딩
	// >>같은 함수의 이름을 여러 개 오버로드 할 수 있음.
	//<틀려도 되는것 >
	//1. 데이터 타입
	//2. 데이터의 개수
	//3. 순서
	//*반환 (리턴)타입이 다른 것은 오버로드 X
public class Acc {
	
	public void add(int x, int y) {
		System.out.println(x+y);
	}
	
	public void add(double x, double y) {
		System.out.println(x+y);
	}
	
	public void add(int x, double y) {
		System.out.println(x+y);
	}
	
	public void add(int x, int y, int z) {
		System.out.println(x+y+z);
	}
	
	public void add(int[] arr) {
		int sum = 0;
		for(int i : arr) {
			sum += i;
		}
		System.out.println(sum);
	}
}
