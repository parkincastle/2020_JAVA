package exam03;

import java.util.Scanner;

public class ThrowEx02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		try {
		square(sc.next());
		}
		catch(NumberFormatException e) {
//			e.printStackTrace();
			System.out.println("예외발생");
		}
		
		
	}
	
	public static void square(String s) throws NumberFormatException{
		
		int n = Integer.parseInt(s);
		
		System.out.println(n*n);
		
	}
	
}
