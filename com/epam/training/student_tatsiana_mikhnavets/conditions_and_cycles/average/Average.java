package com.epam.training.student_tatsiana_mikhnavets.conditions_and_cycles.average;

import java.util.Scanner;

public class Average {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int count =0;
            int sum = 0;
            while (true) {
                int t = scanner.nextInt();
                if (t==0) {
                    break;
                } else {
                    sum +=t;
                    count ++;
                }
            }
            int average = sum/count;
            System.out.println(average);
            // Use Scanner methods to read input

        }

    }


