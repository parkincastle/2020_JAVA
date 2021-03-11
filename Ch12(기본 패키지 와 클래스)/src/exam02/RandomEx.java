package exam02;

import java.util.Random;

public class RandomEx {

	public static void main(String[] args) {

		Random r = new Random();
		
		for(int i = 0; i < 6; i++) {
			System.out.println(r.nextInt(45)+1); //1~46±îÁö 
		}
		
		
		
	}

}
