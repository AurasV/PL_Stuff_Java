/**
 * 1211EC / Homework nr 4
 * @author Frimu Aurel-Viorel
 * @version 20/01/2023
 */
public class Lab4HwEx3MatrixCalculations {

    public static int sumMainDiagonal(int m[][]) {
        if (m.length != m[0].length) {
            return 0;
          }
        int sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][i];
        }
        return sum;
    }

    public static int sumUnderMainDiagonal(int m[][]) {
        if (m.length != m[0].length) {
            return 0;
          }
        int sum = 0;
        for (int row = 0; row < m.length; row++) {
            for (int col = 0; col < row; col++) {
                sum += m[row][col];
            }
        }
        return sum;
    }

    public static int[][] matrixMultiplication(int a[][], int b[][]) {
        if (a[0].length != b.length) {
            System.out.println("Matrices cannot be multiplied.");
            return null;
        }
        int[][] result = new int[a.length][b[0].length];
        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < b[0].length; col++) {
                for (int i = 0; i < a[0].length; i++) {
                    result[row][col] += a[row][i] * b[i][col];
                }
            }
        }
        return result;

    }

}