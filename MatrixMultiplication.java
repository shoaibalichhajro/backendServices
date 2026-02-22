public class MatrixMultiplication {
    public static int[][] multiply(int[][] A, int[][] B) {
        int n = A.length, m = B[0].length, common = B.length;
        int[][] C = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < common; k++) C[i][j] += A[i][k] * B[k][j];
            }
        }
        return C;
    }

    public static void main(String[] args) {
        int[][] A = { {1,2}, {3,4} };
        int[][] B = { {5,6}, {7,8} };
        int[][] C = multiply(A,B);
        System.out.println("Result:");
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[0].length; j++) System.out.print(C[i][j] + " ");
            System.out.println();
        }
    }
}
