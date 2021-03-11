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
			System.out.println("1.스케줄 작성");
			System.out.println("2.스케줄 입력");
			System.out.println("3.스케줄 저장");
			System.out.println("4. 종료");
			System.out.println("스케줄러 실행을 선택해 주세요 : ");
			choice = sc.nextInt();
			
			if(choice < 1 || 4 < choice) {
				System.out.println("\n 잘 못 선택하셨습니다.");
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
				System.out.println("\n스케줄 입력\n");
				System.out.println("날자 (yyyyMMMdd) : ");
				sData = sc.nextInt();
				System.out.println("시간 (hhmm) : ");
				sTime = sc.nextInt();
				System.out.println("내용 작정 : ");
				sRoutine = sc.next();
				System.out.println("\n 입력 완료\n");
				
			case 3: 
				String Data = "날짜 : " + sData + "\n";
				String Time = "시간 : " + sTime + "\n";
				String Routine = "내용 : " + sRoutine + "\n";
				file.write(Data.getBytes());
//				file.write()
				
				
				
				
				
				
				
				
				
			}
		}
		
		
	}

}
