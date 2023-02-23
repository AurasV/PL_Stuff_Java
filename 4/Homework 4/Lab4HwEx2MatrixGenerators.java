/**
 * 1211EC / Homework nr 4
 * @author Frimu Aurel-Viorel
 * @version 20/01/2023
 */
public class Lab4HwEx2MatrixGenerators {
    public static int[][] matrix1(int size) {
      int[][] matrix = new int[size][size];
  
      for (int row = 0; row < size; row++) {
        for (int col = 0; col < size; col++) {
          matrix[row][col] = row * size + col + 1;
        }
      }
  
      return matrix;
    }

    public static int[][] matrix2(int size) {
      int[][] matrix = new int[size][size];
  
      for (int row = 0; row < size; row++) {
        for (int col = 0; col < size; col++) {
          matrix[row][col] = row * size + col + 1;
        }
      }
  
      return matrix;
    }

    public static int[][] matrix3(int size) {
        int[][] matrix = new int[size][size];
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                matrix[row][col] = row * size + col + 1;
                if (row % 2 == 1) {
                    matrix[row][col] = (size - row) * size - col;
                  }
                }
              }
        return matrix;
    }

    public static int[][] matrix4(int size) {
        int[][] matrix = new int[size][size];

        int n = size;
        int i = 0;

        while (n > 0) {
            for (int col = i; col < i + n; col++) {   
                matrix[i][col] = i + 1;
                i++;
            }
            for (int row = i; row < i + n; row++) {  
                matrix[row][i + n - 1] = i + 1;
                i++;
            }
            for (int col = i + n - 1; col >= i; col--) {  
                matrix[i + n - 1][col] = i + 1;
                i++;
            }
            for (int row = i + n - 1; row >= i; row--) {  
                matrix[row][i - 1] = i + 1;
                i++;
            }
            n -= 2;
            i += n * n;
        }
        return matrix;
    }
  }