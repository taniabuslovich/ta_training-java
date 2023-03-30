package com.epam.training.student_tatsiana_mikhnavets.conditions_and_cycles.go_dutch;

import java.util.Scanner;

public class GoDutch {
    public static void main(String[] args) {
        //Write code here
        Scanner scanner = new Scanner (System.in);
        int bill = scanner.nextInt();
        int friends = scanner.nextInt();
        if (friends <=0) {
            System.out.println("Number of friends cannot be negative or zero");
            return;
        } else if (bill<0) {
            System.out.println("Bill total amount cannot be negative");
            return;
        }
        double result = bill*0.1;
        int result1 = (int) result;
        System.out.println((result1+bill)/friends);
    }
}


