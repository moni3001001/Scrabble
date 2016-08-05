import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScrabbleSolver {

	
	public static long primeValue(String str) {
		
		int[] primes = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101};
		long product=1;
		for(int i=0; i< str.length();i++) {
			product *= primes[(int)str.charAt(i)-(int)'a'];
		}
		return product;
	}
	
	
	public static void main(String args[]) throws IOException {
		String largestWord = getPossibleHighestMove("holdbac",'k',7,8); //pass the fixed character,index of k and length
		System.out.println(largestWord);
	}
	
	
	public static String removeBlank(String s){
		String res="";
		for(int i=0;i<s.length();i++){
			 if(s.charAt(i) != ' ')
				 res += s.charAt(i);
		}
		return res;
	}
	public static boolean ifPossible(String line,String rack){
		for(int i=0;i<rack.length();i++){
			if(line.indexOf(rack.charAt(i)) < 0  )
					return false;
		}
		return true;
	}
	private static String getPossibleHighestMove(String rack,char fixed,int kPos,int len) throws IOException {
		
		ScrabbleWord S = new ScrabbleWord();
		long highest = 0;
		//System.out.println(rackValue);
		File file = new File("sowpods.txt");
		String highestStr = "";
		FileInputStream fis = new FileInputStream(file);
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		String line = null;
		while ((line = br.readLine()) != null) {
			if(line.length() <= 8) {
				int l = line.length();
				boolean flag = false;
				for(int i=l+kPos-len;i<=kPos && i>=0 && i<l;i++){
					if(line.charAt(i)==fixed)
						flag=true;
				}
				if(flag && ifPossible(line,rack)) {
						long wordPoints = S.calculatePoints(line);
						if(wordPoints > highest) {
							highest = wordPoints;
							highestStr = line;
						}
					}
				}
			}
			br.close();
			return highestStr;
		}
	}

