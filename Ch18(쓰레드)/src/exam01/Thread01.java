package exam01;

class Sum{
	
	int num = 0;
	int sum() {
		for(int i = 0; i < 1000 ; i++) {
			num += 1;
		}
		return num;
	}
}

class ThreadEx extends Thread01{
	
	Sum s = new Sum();
	
	public void run() {
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName + " : " + s.sum());
	}
}

public class Thread01 {

	public static void main(String[] args) {

		ThreadEx t = new ThreadEx();
		Thread ex1 = new Thread(r, "a");
		Thread ex2 = new Thread(r, "b");
		
		ex1.start();
		ex2.start();
		
		
		
	}

}
