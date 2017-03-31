package bean;

/**
 * Created by Olga on 18.03.2017.
 */
public class Matrix {
    private int n;
    private int m;
    private int matrix[][];

    public Matrix() {
    }

    public Matrix(int n, int m, int[][] matrix) {
        this.n = n;
        this.m = m;
        this.matrix = matrix;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public void showMatrix(){
        int i,j;
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
              System.out.print(matrix[i][j]+ "\t");

            }
            System.out.println();
        }

    }
}
