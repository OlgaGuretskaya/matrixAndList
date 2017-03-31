import actionsList.FindTheSecondByLengthString;
import actionswithmatrix.Multiplymatrixes;
import actionswithmatrix.TransportMatrix;
import bean.Matrix;
import converter.Converter;
import reader.Reader;
import writer.Writer;

import java.util.ArrayList;
import java.util.List;
import bean.ListWork;


/**
 * Created by Olga on 18.03.2017.
 */
public class Worker {

    //создание объектов

    Writer writer = new Writer();
    Reader reader = new Reader();
    Converter converter = new Converter();



    public void runMatrix() {
        //создание объектов
        Matrix matrix = new Matrix();
        MatrixCreation matrixCreation = new MatrixCreation();
        TransportMatrix transportMatrix = new TransportMatrix();
        Matrix matrix1 = new Matrix();
        Multiplymatrixes multiplymatrixes = new Multiplymatrixes();

        int matrixA[][] = matrix.getMatrix();
// ввести количество строк
        writer.setMatrixRowSizeN();
        String a = reader.readString();
        matrix.setN(converter.convertStringtoInt(a));
        int n = matrix.getN();
// ввести количество столбцов
        writer.setMatrixColumnSizeM();
        String b = reader.readString();
        matrix.setM(converter.convertStringtoInt(b));
        int m = matrix.getM();
//создание матрицы и вывод
        System.out.println("matrix1");
        matrixA = new int[n][m];
        matrixA = matrixCreation.createMatrix(n, m, matrixA);
        matrix.setMatrix(matrixA);
        matrix.showMatrix();

//транспортировать матрицу
        System.out.println("transport");
        int matrixB[][] = transportMatrix.doAction(n, m, matrixA);
        matrix1.setMatrix(matrixB);
        matrix1.setM(n);
        matrix1.setN(m);
        matrix1.showMatrix();

//перемножение матриц
        System.out.println("multiply matrixA and matrixB");
        int matrixC[][] = new int[n][m];
        matrixC = matrixCreation.createMatrix(n, m, matrixC);
        Matrix matrix3 = new Matrix();
        matrix3.setN(n);
        matrix3.setM(m);
        matrix3.setMatrix(matrixC);
        System.out.println("matrixA");
        matrix3.showMatrix();

        int matrixD[][] = new int[n][m];
        matrixD = matrixCreation.createMatrix(n, m, matrixD);
        Matrix matrix4 = new Matrix(n, m, matrixD);
        System.out.println("matrixB");
        matrix4.showMatrix();

        Matrix matrix5 = multiplymatrixes.multiplayMatrixes(matrix4, matrix3);
        System.out.println("result");
        matrix5.showMatrix();

    }

    public void runList(){
        ListWork listWork = new ListWork();
        FindTheSecondByLengthString findTheSecondByLengthString = new FindTheSecondByLengthString();
       writer.showMessageAboutListSize();
        String listSizeString = reader.readString();
        int listSize = converter.convertStringtoInt(listSizeString);
        List<String> list = new ArrayList<>();


        for(int i =0; i<listSize; i++){
            writer.showMessageAboutListComponents();
            String line = reader.readString();
            list.add(line);

        }
        listWork.setList(list);
        System.out.println(listWork.toString());
        findTheSecondByLengthString.findSecondStringInList(listWork);


    }

}