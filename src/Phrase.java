public class Phrase {
	
	private String currentPhrase;
	
	public Phrase(String p) {
		currentPhrase = p;
	}
	
	// @param str: given string
	// @param n: the occurance of the string ex 4th occurance 
	public int findNthOccurrence(String str, int n) {
		int index = 0;
		String temp = currentPhrase;
		for(int i = 0; i < n; i++) {
			index = currentPhrase.indexOf(str);
			if(index == -1) {
				return -1;
			}
			temp = temp.substring(0, index) + temp.substring(index + str.length());
		} return index;
	}
	
	public void replaceNthOccurrence(String str, int n, String repl) {
		int loc = findNthOccurrence(str, n);
		 if(loc != -1) {
			 currentPhrase = currentPhrase.substring(0, loc) + repl + 
					 		 currentPhrase.substring(loc + str.length()); // splitting up the screen into parts, 
			 															// 1st substring goes up to the location you want then replaces that 
			 															// and then the rest of the string
		 }
	}
	
	public int findLastOccurence(String str) {
		int n = 1;
		while(findNthOccurrence(str, n + 1) != -1) {
			n++;
		}
		return findNthOccurrence(str, n);
	}
	public String toString() { return currentPhrase; }
	
}