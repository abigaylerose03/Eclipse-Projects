public class RandomLetterChooser extends RandomStringChooser {
	private String str;

	public RandomLetterChooser(String[] wordArray, String str) {
		super(wordArray);
		this.str = str;
		
		
	}
	
	public static String[] getSingleLetters(String str) {
		String[] singleLetterArray = new String[str.length()];
		for(int i = 0; i < str.length(); i++) {
			
			singleLetterArray[i] = str.substring(i, i + 1);
		}
	return singleLetterArray;
	}

}
