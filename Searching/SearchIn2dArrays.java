import java.util.Arrays;

public class binarySearch2dArray {
	
	public static void main(String[] args) {
		// The below matrix is sorted  by row wise and column wise but the matrix is not completely sorted, i.e a[0][-1] is not necessarily less than a[1][0] (where -1 is last element of array)
		int[][] arr = {
				{10, 20, 30, 40},
				{15, 25, 35, 45}, 
				{58, 59, 67, 79},
				{83, 84, 88, 90},
				{93, 94, 98, 900},
					};
		
		System.out.println(Arrays.toString(search(arr, 98)));
		
	}
	
	static int[] search(int[][] matrix, int target) {
		
		int r = 0;
		int c = matrix[0].length-1;
		
		while(r< matrix.length && c>=0) {
			
			if(matrix[r][c]==target) return new int[] {r, c};
			
			if(matrix[r][c] < target) r++;
			
			else c--;			
			
		}
		
		return new int[] {-1, -1};
				
	}

}
