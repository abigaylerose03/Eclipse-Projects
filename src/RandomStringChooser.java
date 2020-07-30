import java.util.Random;

public class RandomStringChooser {
	
	private String[] wordArray;
	
	public RandomStringChooser(String[] wordArray) {
		this.wordArray = wordArray;
	}
	
	public String getNext() {
		if(wordArray.length < 1 ) {
			return "NONE";
		} else {
			Random r = new Random();
			int chosen = r.nextInt(wordArray.length);
			return wordArray[chosen];
		}
	}
	
	public static void compare() {
		if("abby".compareTo("babe") > 0) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		
	}
	
	public static void main(String[] args) {
		String[] wArray = {"hi", "wow", "fun", "secret"};
		RandomStringChooser sChooser = new RandomStringChooser(wArray);
		
		compare();
		

	}
	
	

}
