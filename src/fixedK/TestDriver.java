

public class TestDriver {

		
	public static void main(String[] args){
		
		ScrabbleWord S = new ScrabbleWord();
		Integer points = S.calculatePoints("o y"); //expected output 13
		System.out.println(points);
		points = S.calculatePoints("super"); //expected output 7
		System.out.println(points);
		
	}

}
