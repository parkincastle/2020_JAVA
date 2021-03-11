package exam4;

public class GMothodEx {

	static class Utills{
		
		public static<T extends Number> void show(T[] t) {
			for(T i : t) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {

		Integer[] a = {1, 2, 3, 4, 5};
		Double[] d = {1.5, 2.5, 3.5, 4.5, 5.5};
		Character[] c = {'H', 'E', 'L', 'L', 'O'};
		
		Utills.show(a);
		Utills.show(d);
//		Utills.show(c);
		
	}

}
