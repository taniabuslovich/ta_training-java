package com.epam.training.student_tatsiana_mikhnavets.java_basics.arrays.transpose_matrix;

import java.util.Arrays;

public class TransposeMatrix {
    public static int[][] transpose(int[][] matrix) {
        int columns = matrix.length;
        int row = matrix[0].length;
        int [][] nMatrix = new int [row] [columns];
        for (int i =0; i<matrix.length; i++) {
            for (int j =0; j<matrix [i].length; j++) {
                nMatrix [j][i] = matrix[i][j];
            }
        }
        return nMatrix;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");


        int[][] matrix = {
                {1, 2},
                {7, -13} };

        int[][] result = transpose(matrix);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }

}


