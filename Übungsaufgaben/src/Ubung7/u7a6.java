package Ubung7;

public class u7a6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][] a = {{1,2,3},
					 {4,5,6},
					 {7,8,9}};
		printMatrix(a);
		
		matrixTransponieren(a);
		
	}
	
	public static void printMatrix(double[][] matrix) {
		System.out.println("Print: " + matrix);
		int rows = matrix.length;
		int cols = matrix[0].length;
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	public static void matrixTransponieren(double[][] matrix) {
		int zeile = matrix.length;
		int spalte = matrix[0].length;

		for (int i = 0; i < zeile; i++) {
			for (int j = 0; j < spalte; j++) {
			
				double temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		printMatrix(matrix);
		
	}
	
	public static void matrixTransNoSqrt(double[][] matrix) {
		int zeile = matrix.length;
		int spalte = matrix[0].length;
		
		double[][] new_matrix = new double[spalte][zeile];

		for (int i = 0; i < zeile; i++) {
			for (int j = 0; j < spalte; j++) {
				
				new_matrix[j][i] = matrix[i][j];
			}
		}
		
	}
	
}
