package exam05;

public class Calculator implements Calc{

	@Override
	public int add(int a, int b) {
		
		return a+b;
	}

	@Override
	public int sub(int a, int b) {
		
		return a-b;
	}

	@Override
	public int mul(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public double div(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}

}
