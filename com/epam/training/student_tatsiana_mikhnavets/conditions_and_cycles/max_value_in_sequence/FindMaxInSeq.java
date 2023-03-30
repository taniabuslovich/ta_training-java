package com.epam.training.student_tatsiana_mikhnavets.conditions_and_cycles.max_value_in_sequence;

import java.util.Scanner;

public class FindMaxInSeq {
        public static int max() {

            Scanner scanner = new Scanner(System.in);
            int currentValue = scanner.nextInt();
            int maxSoFar = currentValue;
            while (true) {
                currentValue = scanner.nextInt();
                if (currentValue==0) break;
                if (currentValue>=maxSoFar) {
                    maxSoFar=currentValue;
                }
            }

            return maxSoFar;
        }

        public static void main(String[] args) {

            System.out.println("Test your code here!\n");


            System.out.println(max());
        }
    }


