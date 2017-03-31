package actionswithmatrix;

/**
 * Created by Olga on 18.03.2017.
 */
public class TransportMatrix {
    public int[][] doAction(int n, int m, int matrixA[][]) {

        int i,j;
        int matrixB[][] = new int[m][n];
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                int a = matrixA[i][j];
                matrixB[j][i] = a;

            }
        }

        return matrixB;

    }
}
