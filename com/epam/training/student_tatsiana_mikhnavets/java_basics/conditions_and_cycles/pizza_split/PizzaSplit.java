package com.epam.training.student_tatsiana_mikhnavets.java_basics.conditions_and_cycles.pizza_split;

import java.util.Scanner;

public class PizzaSplit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = scanner.nextInt();
        int pieces = scanner.nextInt();
        int pizza = 1;
        int countOfPieces = pieces;
        while (true) {
            pieces = countOfPieces;
            pieces *= pizza;
            if (pieces % people == 0) {
                break;
            }
            pizza++;
        }
        System.out.println(pizza);

    }
}
