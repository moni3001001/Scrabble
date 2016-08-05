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
			
			public int maxScore(){
				return score;
			}
			
			
			public static void main(String args[]){
				string input = "schools";
				String filePath = "C:\\Users\\subhargava\\Downloads\\sowpods.txt";
				ArrayList<String> dictionary = new ArrayList<String> ();
				dictionary = readFile(filePath);
				
				
				
			}
}
