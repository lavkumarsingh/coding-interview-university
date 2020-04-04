// https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
public class OddCells {
    public static void main(String args[]) {
        // n = 2, m = 3, indices = [[0,1],[1,1]]
        int[][] indices = new int[][] {{0,1},{1,1}};
        int result = oddCells(2, 3, indices);
        System.out.println(result);
    }

    private static int oddCells(int n, int m, int[][] indices) {
        int[][] matrix = new int[n][m];
        // set zero in all cells
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = 0;
            }
        }

        for (int k = 0; k < indices.length; k++) {
            int row = indices[k][0];
            for (int j = 0; j < m; j++) {
                matrix[row][j] = matrix[row][j] + 1;
            }
            int col = indices[k][1];
            for (int j = 0; j < n; j++) {
                matrix[j][col] = matrix[j][col] + 1;
            }
        }

        int oddCellCount = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] % 2 != 0) {
                    oddCellCount++;
                }
            }
        }
        return oddCellCount;
    }
}