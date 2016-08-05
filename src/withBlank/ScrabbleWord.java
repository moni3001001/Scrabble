
public class ScrabbleWord {

	private Integer[] pointsArray = {1,3,3,2,1,4,2,4,1,8,5,1,3,1,1,3,10,1,1,1,1,4,4,8,4,10};
	
	public Integer calculatePoints(String word){
		Integer points = 0;
		for(int i =0;i<word.length(); i++){
			points = points + pointsArray[(int)word.charAt(i)-(int)'a'];
		}
		return points;
	}
}
