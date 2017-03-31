import bean.Matrix;

/**
 * Created by Olga on 18.03.2017.
 */
public class MatrixCreation {

   int i, j;

    public int[][] createMatrix(int n, int m, int matrixA[][]) {

        for (i = 0; i < n; i++) {
           for (j = 0; j < m; j++) {
               matrixA[i][j] = (int) Math.floor(Math.random() * 200 - 100);

           }
                    }
        return matrixA;
    }
}
