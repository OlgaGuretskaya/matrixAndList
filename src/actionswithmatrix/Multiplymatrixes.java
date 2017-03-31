package actionswithmatrix;

import bean.Matrix;

/**
 * Created by Olga on 19.03.2017.
 */
public class Multiplymatrixes {
    public Matrix multiplayMatrixes(Matrix matrix4, Matrix matrix3){
        int n = matrix3.getN();
        int m = matrix3.getM();
        int matrixC[][] = matrix3.getMatrix();
        int matrixD[][] = matrix4.getMatrix();
        int matrixResult[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrixResult[i][j] = matrixC[i][j]*matrixD[i][j] ;

            }
        }

        Matrix matrixR = new Matrix(n, m, matrixResult);

        return matrixR;
    }

}
