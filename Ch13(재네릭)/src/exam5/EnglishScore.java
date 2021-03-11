package exam5;

public class EnglishScore implements Comparable<EnglishScore>{
	
	String name;
	int score;
	
	
	public EnglishScore(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	public String toString() {
		return this.name+ ", " + this.score;
	}

//	@Override
//	public int compareTo(EnglishScore o) {
//		if(this.score == o.score) {
//			return 0;
//		}
//		else if(this.score > o.score){
//			return 1;
//		}
//		else {
//			return -1;
//		}
//	}

	@Override
	public int compareTo(EnglishScore o) {
		if(name.equals(o.name)) {
			return 0;
		}
		else if(name.equals(o.name)) {
			return 1;
		}
		else {
			return -1;
		}
		
	}
}
