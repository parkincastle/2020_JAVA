package exam04;

public class MainEx01 {

	public static void main(String[] args) {
		
		String str1 = args[0];
		String str2 = args[1];
		String str3 = args[2];
		
		System.out.println("ID : "+str1);
		System.out.println("Password : "+str2);
		System.out.println(str3);
		System.out.println(str3+100);
		//int 형으로 바꾸는거
		int k = Integer.parseInt(str3);
		System.out.println(k+100);
		print(str1,k);	

	}

	public static void print(String str1, int k) {
		
		for(int i = 0; i < k;i++) {
			System.out.println(str1);
		}
	}
	
	
}
