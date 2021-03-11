package exam5;

import java.util.Scanner;

public class ScoreTest {

	
	static<T extends Comparable> T findBest(T[] a) {
		T best = a[0];
		
		for(int i = 0; i < 3; i++) {
			
			if(best.compareTo(a[i]) == -1) {
				best=a[i];
			}
		}
		return best;
	}
	
	static<T> T findScore(T[] t, String name) {
		int a = 0;
		for(int i = 0; i < 3; i++) {
			if(t[i].toString().substring(0, 3).equals(name)) {
				a=1;
				return t[i];
			}
		}
		if(a==0) {
			System.out.println("검색한 이름이 없습니다.");
		}
		
		return null;
		
	
	}
	
	
	
	
	public static void main(String[] args) {
		
		EnglishScore[] ea = {new EnglishScore("김삿갓", 77),
				new EnglishScore("장영실", 88), new EnglishScore("홍길동", 99)};
		
		MathScore[] ma = {new MathScore("김삿갓", 77),
				new MathScore("장영실", 88), new MathScore("홍길동", 99)};
		
		System.out.println("영어 최고 점수 : " + findBest(ea));
		System.out.println("수학 최고 점수 : " + findBest(ma));
		
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 이름 입력 : ");
		String name = sc.next();
		
		
		System.out.println("영어 점수 : " + findScore(ea, name));
		System.out.println("수학 점수 : " + findScore(ma, name));
		}
		
		
	}


