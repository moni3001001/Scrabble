import java.util.ArrayList;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.Map.Entry;

public class Scrabble {
	        
			String letters;
			
			public static ArrayList<String> readFile(String path) throws Exception {
				return (ArrayList<String>) Files.readAllLines(Paths.get(path));
			}
			
			public boolean isValid(String s, ArrayList<String> dict){
				return dict.contains(s);
			}
			
			public int scoreLetter(char c){
				switch(c){
				case 'a':
					return 1;
				case 'b':
					return 8;
				case 'c':
					return 3;
				case 'd':
					return 2;
				case 'e':
					return 1;
					
			}
			
				public int totalScore(String s){
					int score=0;
					for(int i=0;i<s.length();i++)
						score += scoreLetter(s.charAt(i));
					return score;
				}
				
				public int maxScore(ArrayList<String> dict){
					String temp = this.letters;
					int maxScore=0;
					Set<String> permute;
				
					for(int i=0;i<len;i++){
					permute = Permutations.permutationFinder(temp);
						for(int k=0;k<permute.size();k++){
						maxScore = totalScore(temp);
							if(isValid(temp, dict))
								return maxScore;
						}
					return maxScore;
				}
			
			
			public static void main(String args[]){
				string input = "schools";
				String filePath = "C:\\Users\\subhargava\\Downloads\\sowpods.txt";
				ArrayList<String> dictionary = new ArrayList<String> ();
				dictionary = readFile(filePath);
				
				
				
			}
}
