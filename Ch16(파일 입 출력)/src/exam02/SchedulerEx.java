package exam02;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.Scanner;

public class SchedulerEx {

	public static void main(String[] args) throws Exception{

		int choice;
		boolean bFlag = true;
		int sData = 0, sTime = 0;
		String sRoutine = "";
		
		Scanner sc = new Scanner(System.in);
		FileOutputStream file = new FileOutputStream("d:\\sche.txt");
		BufferedReader br = new BufferedReader(new FileReader("d:\\sche.txt"));
		
		while(bFlag) {
			System.out.println("==================");
			System.out.println("1.������ �ۼ�");
			System.out.println("2.������ �Է�");
			System.out.println("3.������ ����");
			System.out.println("4. ����");
			System.out.println("�����ٷ� ������ ������ �ּ��� : ");
			choice = sc.nextInt();
			
			if(choice < 1 || 4 < choice) {
				System.out.println("\n �� �� �����ϼ̽��ϴ�.");
				continue;
			}
			
			switch(choice) {
			case 1: 
				while(true) {
					String line = br.readLine();
					
					if(line == null) {
						break;
					}
					System.out.println(line);
					br.close();
					break;
				}
			case 2: 
				System.out.println("\n������ �Է�\n");
				System.out.println("���� (yyyyMMMdd) : ");
				sData = sc.nextInt();
				System.out.println("�ð� (hhmm) : ");
				sTime = sc.nextInt();
				System.out.println("���� ���� : ");
				sRoutine = sc.next();
				System.out.println("\n �Է� �Ϸ�\n");
				
			case 3: 
				String Data = "��¥ : " + sData + "\n";
				String Time = "�ð� : " + sTime + "\n";
				String Routine = "���� : " + sRoutine + "\n";
				file.write(Data.getBytes());
//				file.write()
				
				
				
				
				
				
				
				
				
			}
		}
		
		
	}

}
