public class CodeWordChecker implements StringChecker {
	
	private int start;
	private int end;
	private String exclude;
	
	public static void main(String[] args) {
		StringChecker sc1 = new CodeWordChecker(5, 8, "$");
		
		System.out.println(sc1.isValid("happy"));
	}
	
	public CodeWordChecker(int start, int end, String exclude) {
		this.start = start;
		this.end = end;
		this.exclude = exclude;
	}
	
	public CodeWordChecker(String symbol) {
		start = 6;
		end = 20;
		exclude = symbol;
	}
	
	@Override
	public boolean isValid(String str) {
		return str.length() >= start && str.length() < end
				&& str.indexOf(exclude) == -1;
	}

}
