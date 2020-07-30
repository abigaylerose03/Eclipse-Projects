public class Position {
	
	private int row;
	private int column;
	
	public Position(int r, int c) {
		row = r;
		column = c;
		
	}
	
	public int getRow() {
		return row;
	}
	
	public int getColumn() {
		return column;
	}
	
	public static Position findPosition(int num, int[][] intArr) {
		for(int r = 0; r < intArr.length; r++) {
			for(int c = 0; c < intArr[0].length; c++) {
				if(intArr[r][c] == num) {
					return new Position(r, c);
				}
			}
		}
		return null;
	}
	
	
	
	public static void main(String[] args) {
		Position p = new Position(2, 5);
		
	}
}


