package exam01;

public class SystemEx {

	public static void main(String[] args) {
		
		int[] src = new int[] {1, 2, 3, 4, 5, 6};
		int[] dest = {100, 200, 300, 400, 500, 600};
		
		System.arraycopy(src, 2, dest, 3, 4);
	
		
		for (int i = 0; i < dest.length; i++) {
			System.out.print(dest[i] + " ");
		}
	}

}
