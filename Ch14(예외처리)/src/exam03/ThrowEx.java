package exam03;

public class ThrowEx {

	public static void main(String[] args) {
		
		//예외가 발생항 문장을 try안 에적기
		try {
			throw new Exception("고의로 예외를 발생시킴");
		}
		catch(Exception e){
			System.out.println("예외발생");
			System.out.println(e.getMessage());
		}finally {
			System.out.println("실행 종료");
		}
		
	}
	
}
