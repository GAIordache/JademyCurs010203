import java.util.Arrays;

public class Arr2Main {

	public static void main(String[] args) {
		// Init type 1
		int[][] matrix1 = { { 1, 1 }, { 2, 2 } };
		// Init type 2
		int[][] matrix2 = new int[2][2];
		matrix2[0][0] = 1;
		matrix2[0][1] = 1;
		matrix2[1][0] = 2;
		matrix2[1][1] = 2;
		// Init type 3
		int[][] matrix3 = new int[2][];
		matrix3[0] = new int[2];
		matrix3[0][0] = 1;
		matrix3[0][1] = 1;
		matrix3[1] = new int[2];
		matrix3[1][0] = 2;
		matrix3[1][1] = 2;
		// Init type 4
		int[][] matrix4 = new int[2][];
		matrix4[0] = new int[] { 1, 1 };
		matrix4[1] = new int[] { 2, 2 };
		// Init type 5
		int[][] matrix5 = new int[][] { { 1, 1 }, { 2, 2 } };
		System.out.println("matrix5:" + Arrays.deepToString(matrix5));

		double[][] m1 = identity(10);
		double[][] m2 = identity(10);
		double[][] m3 = multiply(m1, m2);
		System.out.println("m1:" + Arrays.deepToString(m1));
		System.out.println("m2:" + Arrays.deepToString(m2));
		System.out.println("m1 x m2:" + Arrays.deepToString(m3));

	}

	static int sum(int[][] pArray) {
		int sum = 0;
		for (int row = 0; row < pArray.length; row++) {
			for (int col = 0; col < pArray[row].length; col++) {
				sum += pArray[row][col];
			}
		}
		return sum;
	}

	static int sum1(int[][] pArray) {
		int sum = 0;
		for (int[] row : pArray) {
			for (int cell : row) {
				sum += cell;
			}
		}
		return sum;
	}

	static int sum2(int[][][] pArray) {
		int sum = 0;
		for (int[][] row : pArray) {
			for (int[] col : row) {
				for (int cell : col) {
					sum += cell;
				}
			}
		}
		return sum;

	}

	/**
	 * https://introcs.cs.princeton.edu/java/22library/Matrix.java.html
	 * 
	 * @param a
	 * @param b
	 * @return
	 */

	public static double[][] multiply(double[][] a, double[][] b) {
		int aRows = a.length;
		int aCols = a[0].length;
		int bRows = b.length;
		int bCols = b[0].length;
		if (aCols != bRows) {
			throw new RuntimeException("Illegal matrix dimensions.");
		}
		double[][] c = new double[aRows][bCols];
		for (int i = 0; i < aRows; i++) {
			for (int j = 0; j < bCols; j++) {
				for (int k = 0; k < aCols; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return c;
	}

	/**
	 * https://introcs.cs.princeton.edu/java/22library/Matrix.java.html
	 * 
	 * @param n
	 * @return
	 */
	public static double[][] identity(int n) {
		double[][] a = new double[n][n];
		for (int i = 0; i < n; i++) {
			a[i][i] = 1;
		}
		return a;
	}

	static boolean hasNegativeElements(int[][] pArray) {
		boolean result = false;
		outer: 
		for (int[] row : pArray) {
			for (int cell : row) {
				if (cell < 0) {
					result = true;
					break outer;
				}
			}
		}
		
		return result;
	}
}