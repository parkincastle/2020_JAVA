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
			System.out.println("�˻��� �̸��� �����ϴ�.");
		}
		
		return null;
		
	
	}
	
	
	
	
	public static void main(String[] args) {
		
		EnglishScore[] ea = {new EnglishScore("���", 77),
				new EnglishScore("�念��", 88), new EnglishScore("ȫ�浿", 99)};
		
		MathScore[] ma = {new MathScore("���", 77),
				new MathScore("�念��", 88), new MathScore("ȫ�浿", 99)};
		
		System.out.println("���� �ְ� ���� : " + findBest(ea));
		System.out.println("���� �ְ� ���� : " + findBest(ma));
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�˻��� �̸� �Է� : ");
		String name = sc.next();
		
		
		System.out.println("���� ���� : " + findScore(ea, name));
		System.out.println("���� ���� : " + findScore(ma, name));
		}
		
		
	}


