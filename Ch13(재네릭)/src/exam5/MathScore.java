package exam5;

public class MathScore implements Comparable<MathScore>{
	
	String name;
	int score;
	
	public MathScore(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	public String toString() {
		return this.name + ", " + this.score;
	}

	@Override
	public int compareTo(MathScore o) {
		if(this.score == o.score) {
			return 0;
		}
		else if(this.score > o.score){
			return 1;
		}
		else {
			return -1;
		}
	}
	
	
}
