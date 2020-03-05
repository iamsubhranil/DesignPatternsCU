/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.lang.IllegalArgumentException;

/**
 *
 * @author USER
 */
public class Matrix {

    int values[][], row, col;
    
    Matrix(int r, int c) {
        values = new int[r][c];
        row = r;
        col = c;
    }
    
    Matrix add(Matrix m) {
        if(row != m.row | col != m.col) {
            throw new IllegalArgumentException("Matrices are of unmatched sizes for addition!");
        }
        Matrix res = new Matrix(m.row, m.col);
        for (int i = 0; i < m.row; i++) {
            for (int j = 0; j < m.col; j++) {
                res.values[i][j] = values[i][j] + m.values[i][j];
            }
        }
        return res;
    }
    Matrix sub(Matrix m) {
        if(row != m.row | col != m.col) {
            throw new IllegalArgumentException("Matrices are of unmatched sizes for subtraction!");
        }
        Matrix res = new Matrix(m.row, m.col);
        for (int i = 0; i < m.row; i++) {
            for (int j = 0; j < m.col; j++) {
                res.values[i][j] = values[i][j] - m.values[i][j];
            }
        }
        return res;
    }
    Matrix mult(Matrix m) {
        if(col != m.row) {
            throw new IllegalArgumentException("Matrices are of different sizes for multiplication!");
        }
        Matrix res = new Matrix(row, m.col);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < m.col; j++) {
                res.values[i][j] = 0;
                for (int k = 0; k < m.row; k++) {
                    res.values[i][j] += values[i][k] + m.values[k][j];
                }
            }
        }
        return res;
    }
    
    static Matrix fromFile(String fileName) throws FileNotFoundException, NullPointerException {
        Scanner s = new Scanner(Matrix.class.getResourceAsStream(fileName));
        Matrix m = new Matrix(s.nextInt(), s.nextInt());
        for (int i = 0; i < m.row; i++) {
            for (int j = 0; j < m.col; j++) {
                m.values[i][j] = s.nextInt();
            }
        }
        return m;
    }
    
    @Override
    public String toString() {
        String s =  "";
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                s += (values[i][j] + " ");
            }
            s += "\n";
        }
        return s;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Matrix m1 = Matrix.fromFile("matrix_1");
            System.out.println(m1);
            Matrix m2 = Matrix.fromFile("matrix_2");
            System.out.println(m2);
            //System.out.println(m1.add(m2));
            //System.out.println(m1.sub(m2));
            System.out.println(m1.mult(m2));
        } catch (FileNotFoundException | NullPointerException ex) {
            Logger.getLogger(Matrix.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
