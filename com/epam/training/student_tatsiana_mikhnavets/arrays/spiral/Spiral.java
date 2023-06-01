package com.epam.training.student_tatsiana_mikhnavets.arrays.spiral;

import java.util.Arrays;

public class Spiral {
        public static int[][] spiral(int rows, int cols) {
            int[][] arr = new int[rows][cols];

            int num = 1;
            int max = rows * cols;

            int rmin = 0, rmax = rows - 1;
            int cmin = 0, cmax = cols - 1;

            while (num <= max) {
                for (int i = cmin; num <= max && i <= cmax; i++) {
                    arr[rmin][i] = num++;
                }
                rmin++;
                for (int i = rmin; num <= max && i <= rmax; i++) {
                    arr[i][cmax] = num++;
                }
                cmax--;
                for (int i = cmax; num <= max && i >= cmin; i--) {
                    arr[rmax][i] = num++;
                }
                rmax--;
                for (int i = rmax; num <= max && i >= rmin; i--) {
                    arr[i][cmin] = num++;
                }
                cmin++;
            }
            return arr;
        }

        public static void main(String[] args) {
            for (int [] row : spiral(3,4)) {
                System.out.println(Arrays.toString(row));
            }
        }
    }


    