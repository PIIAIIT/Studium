package Ubung7;

public class MatrixRechnen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][] a = new double[3][3];
		double[][] b = new double[3][3];
		int d = 1;
		int e = 9;
		for (int x = 0; x < a.length; x++) {
			for (int y = 0; y < a[0].length; y++) {
				a[x][y] = d;
				b[x][y] = e;
				d++;
				e--;
			}
		}
		double[][] c = multiplizieren(a,b);
		printMatricies(c);
		
		
	}
	
	/**
	 * 
	 * @param matrix1
	 * @param matrix2
	 * @return ergebnisMatrix
	 */
	public static double[][] addieren(double[][] matrix1, double[][] matrix2) {
		double[][] ergebnisMatrix = new double[matrix1.length][matrix1[0].length];
		
		for (int i=0; i <matrix1.length; i++) {
			for (int j = 0; j < matrix1[0].length; j++) {
				ergebnisMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
				System.out.println(ergebnisMatrix[i][j]);
			}
		}
		return ergebnisMatrix;
	}
	
	/**
	 * 
	 * @param matrix1
	 * @param matrix2
	 * @return ergebnisMatrix
	 */
	public static double[][] subtrahieren(double[][] matrix1, double[][] matrix2) {
		double[][] ergebnisMatrix = new double[matrix1.length][matrix1[0].length];
		
		for (int i=0; i <matrix1.length; i++) {
			for (int j = 0; j < matrix1[0].length; j++) {
				ergebnisMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
				System.out.println(ergebnisMatrix[i][j]);
			}
		}
		return ergebnisMatrix;
	}
	
	/**
	 * 
	 * @param matrix1
	 * @param matrix2
	 * @return ergebnisMatrix
	 */
	public static double[][] multiplizieren(double[][] matrix1, double[][] matrix2) {
		int breitem1 = matrix1.length;
		int hohem1 = matrix1[0].length;
		int hohem2 = matrix2[0].length;
		double[][] ergebnisMatrix = new double[breitem1][hohem1];
		
		for (int i=0; i < breitem1; i++) {
			for (int j = 0; j < hohem2; j++) {
				for (int k = 0; k < hohem1; k++) {
					ergebnisMatrix[i][j] += matrix1[i][k] * matrix2[k][j];		
				}
			}
		}
		return ergebnisMatrix;
	}
	
	public static void printMatricies(double[][] m) {
		for (int i = 0; i < m.length; i++) {
			System.out.print("[");
			for (int j = 0; j < m.length; j++) {
				System.out.print(m[i][j]+"\t");
			}
			System.out.println("]");
		}
	}
	
}
