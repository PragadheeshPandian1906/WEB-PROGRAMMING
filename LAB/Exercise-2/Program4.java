import java.util.Scanner;

class Matrix {
    int rows, cols;
    int[][] mat;

    Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        mat = new int[rows][cols];
    }

    void input(Scanner sc) {
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
    }

    void display() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    Matrix add(Matrix m) {
        if (rows != m.rows || cols != m.cols) {
            System.out.println("Addition not possible.");
            return null;
        }

        Matrix result = new Matrix(rows, cols);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.mat[i][j] = mat[i][j] + m.mat[i][j];
            }
        }

        return result;
    }

    Matrix multiply(Matrix m) {
        if (cols != m.rows) {
            System.out.println("Multiplication not possible.");
            return null;
        }

        Matrix result = new Matrix(rows, m.cols);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < m.cols; j++) {
                for (int k = 0; k < cols; k++) {
                    result.mat[i][j] += mat[i][k] * m.mat[k][j];
                }
            }
        }

        return result;
    }

    Matrix transpose() {
        Matrix result = new Matrix(cols, rows);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.mat[j][i] = mat[i][j];
            }
        }

        return result;
    }
}

public class Program4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows of first matrix: ");
        int r1 = sc.nextInt();
        System.out.print("Enter columns of first matrix: ");
        int c1 = sc.nextInt();

        Matrix m1 = new Matrix(r1, c1);
        m1.input(sc);

        System.out.print("Enter rows of second matrix: ");
        int r2 = sc.nextInt();
        System.out.print("Enter columns of second matrix: ");
        int c2 = sc.nextInt();

        Matrix m2 = new Matrix(r2, c2);
        m2.input(sc);

        System.out.println("Matrix addition of A and B is : ");
        Matrix res=m1.add(m2);
        res.display();

        System.out.println("Matrix multiplication of A and B is : ");
        Matrix prod=m1.multiply(m2);
        prod.display();

        System.out.println("Matrix  A is : ");
        m1.display();
        System.out.println("Matrix Transpose of A is : ");
        m1.transpose().display();;

        sc.close();
    }
}