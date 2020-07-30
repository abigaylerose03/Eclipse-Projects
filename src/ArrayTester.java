import java.util.*;

public class ArrayTester {
	
	public static int[] getColumn(int[][] arr2D, int c) {
		int[] arr = new int[arr2D.length];
		for(int r = 0; r < arr.length; r++) {
			arr[r] = arr2D[r][c];
		}
		return arr;
	}
	
	public static boolean hasAllValues(int[] arr1, int[] arr2) {
		for(int val : arr1) {
			if(Arrays.asList(arr2).contains(arr1)) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean containsDuplicates(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					return true;
				}
			}
		} return false;
	}
	
	public static boolean isLatin(int[][] square) {
		if(containsDuplicates(square[0])) {
			return false;
		}
		
		for(int r = 1; r < square.length; r++) {
			if(!hasAllValues(square[0], square[r])) {
				return false;
			}
		}
		
		for(int c = 0; c < square[0].length; c++) {
			if(!hasAllValues(square[0], getColumn(square, c))) {
				return false;
			}
		}
		return true;
	}

}
