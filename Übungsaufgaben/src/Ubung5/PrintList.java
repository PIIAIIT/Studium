package Ubung5;

public class PrintList {
	/**
	 * Liste auf die Konsole ausgeben
	 * @param r: Liste
	 */
	public void printList(byte[] r) {
		System.out.print("[");
		for (int i = 0; i < r.length; i++) {
			System.out.print(r[i]);
			if (i != r.length-1) {
				System.out.print(",");
			}
		}
		System.out.println("]");
		
	}
	/**
	 * Liste auf die Konsole ausgeben
	 * @param r: Liste
	 */
	public void printList(short[] r) {
		System.out.print("[");
		for (int i = 0; i < r.length; i++) {
			System.out.print(r[i]);
			if (i != r.length-1) {
				System.out.print(",");
			}
		}
		System.out.println("]");
		
	}
	/**
	 * Liste auf die Konsole ausgeben
	 * @param r: Liste
	 */
	public void printList(int[] r) {
		System.out.print("[");
		for (int i = 0; i < r.length; i++) {
			System.out.print(r[i]);
			if (i != r.length-1) {
				System.out.print(",");
			}
		}
		System.out.println("]");
		
	}
	/**
	 * Liste auf die Konsole ausgeben
	 * @param r: Liste
	 */
	public void printList(long[] r) {
		System.out.print("[");
		for (int i = 0; i < r.length; i++) {
			System.out.print(r[i]);
			if (i != r.length-1) {
				System.out.print(",");
			}
		}
		System.out.println("]");
		
	}
	/**
	 * Liste auf die Konsole ausgeben
	 * @param r: Liste
	 */
	public void printList(double[] r) {
		System.out.print("[");
		for (int i = 0; i < r.length; i++) {
			System.out.print(r[i]);
			if (i != r.length-1) {
				System.out.print(",");
			}
		}
		System.out.println("]");
		
	}
	/**
	 * Liste auf die Konsole ausgeben
	 * @param r: Liste
	 */
	public void printList(float[] r) {
		System.out.print("[");
		for (int i = 0; i < r.length; i++) {
			System.out.print(r[i]);
			if (i != r.length-1) {
				System.out.print(",");
			}
		}
		System.out.println("]");
		
	}
	/**
	 * Methode um eine Liste auf dem Bildschirm auszugeben.
	 * 
	 * @param a: die Liste die ausgegeben wird
	 * 
	 */
	public void printList(String[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("  "+a);
	}
	
	/**
	 * Matrix auf der Konsole ausgeben
	 * @param matrix
	 */
	public static void printMatrix(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	/**
	 * Matrix auf der Konsole ausgeben
	 * @param matrix
	 */
	public static void printMatrix(long[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	/**
	 * Matrix auf der Konsole ausgeben
	 * @param matrix
	 */
	public static void printMatrix(short[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	/**
	 * Matrix auf der Konsole ausgeben
	 * @param matrix
	 */
	public static void printMatrix(byte[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	/**
	 * Matrix auf der Konsole ausgeben
	 * @param matrix
	 */
	public static void printMatrix(double[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	/**
	 * Matrix auf der Konsole ausgeben
	 * @param matrix
	 */
	public static void printMatrix(float[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	/**
	 * Matrix auf der Konsole ausgeben
	 * @param matrix
	 */
	public static void printMatrix(String[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
