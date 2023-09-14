package com.NaiveMul;

import java.util.Random;
public class NaiveMult {

    // Integer
    public static int[][] randomintmatrix(int rws, int cls) {
        int[][] matrix = new int[rws][cls];
        Random random = new Random();
        for (int i = 0; i < rws; ++i) {
            for (int j = 0; j < cls; ++j) {
                matrix[i][j] = random.nextInt(100); 
            }
        }
        return matrix;
    }

     // Multiply
    public static int[][] multintmatrix(int[][] A, int[][] B) {
        int Arws = A.length;
        int Acls = A[0].length;
        int Bcls = B[0].length;
        int[][] result = new int[Arws][Bcls];

        for (int i = 0; i < Arws; ++i) {
            for (int j = 0; j < Bcls; ++j) {
                for (int k = 0; k < Acls; ++k) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return result;
    }

       public static int[][] nmultintmatrix(int[][] A, int[][] B) {
        int Arws = A.length;
        int Acls = A[0].length;
        int Bcls = B[0].length;
        int[][] result = new int[Arws][Bcls];

        for (int i = 0; i < Bcls; ++i) {
            for (int j = 0; j < Arws; ++j) {
                for (int k = 0; k < Acls; ++k) {
                    result[j][i] += A[j][k] * B[k][i];
                }
            }
        }

        return result;
    }

    // Double 
    public static double[][] randomdblmatrix(int rws, int cls) {
        double[][] matrix = new double[rws][cls];
        Random random = new Random();
        for (int i = 0; i < rws; ++i) {
            for (int j = 0; j < cls; ++j) {
                matrix[i][j] = random.nextDouble(); 
            }
        }
        return matrix;
    }

    // Multiply Double
    public static double[][] multdblmatrix(double[][] A, double[][] B) {
        int Arws = A.length;
        int Acls = A[0].length;
        int Bcls = B[0].length;
        double[][] result = new double[Arws][Bcls];

        for (int i = 0; i < Arws; ++i) {
            for (int j = 0; j < Bcls; ++j) {
                for (int k = 0; k < Acls; ++k) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return result;
    }

        public static double[][] nmultdblmatrix(double[][] A, double[][] B) {
        int Arws = A.length;
        int Acls = A[0].length;
        int Bcls = B[0].length;
        double[][] result = new double[Arws][Bcls];

         for (int i = 0; i < Bcls; ++i) {
            for (int j = 0; j < Arws; ++j) {
                for (int k = 0; k < Acls; ++k) {
                    result[j][i] += A[j][k] * B[k][i];
                }
            }
        }
        return result;
    }
}