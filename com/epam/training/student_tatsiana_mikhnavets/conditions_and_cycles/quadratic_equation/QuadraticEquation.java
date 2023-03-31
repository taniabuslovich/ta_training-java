package com.epam.training.student_tatsiana_mikhnavets.conditions_and_cycles.quadratic_equation;

import java.util.Locale;
import java.util.Scanner;

public class QuadraticEquation {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            scanner.useLocale(Locale.US);
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();
            double d = b*b-4*a*c;

            if (a ==0) {
                return;
            }
            if (d ==0) {
                double x;
                x = -b/ (2*a);
                System.out.printf("%s\n", x);
            }else if (d<0) {
                System.out.println("no roots\n");
            } else if (d>0) {
                double x1 = ((-b - Math.sqrt(d)) / (2 * a));
                double x2 = ((-b + Math.sqrt(d)) / (2 * a));
                System.out.printf("%s %s\n", x1, x2);
            }
        }

    }

