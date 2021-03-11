package exam10;

public class Tv {

	private int year;
	private int inch;
	private String model;


	public Tv(int year, int inch, String model) {
		this.inch = inch;
		this.model = model;
		this.year = year;
		System.out.println(this.year + "³â " + this.inch + "ÀÎÄ¡ " + this.model + "TV");
	}
	
}
