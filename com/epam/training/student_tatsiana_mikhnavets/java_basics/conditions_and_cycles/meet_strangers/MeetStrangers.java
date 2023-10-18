package com.epam.training.student_tatsiana_mikhnavets.java_basics.conditions_and_cycles.meet_strangers;

import java.util.Scanner;

public class MeetStrangers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if (input == 0) {
            System.out.println("Oh, it looks like there is no one here");
        } else if (input < 0) {
            System.out.println("Seriously? Why so negative?");
        } else {
            for (int i = 0; i <= input; i++) {
                String str = (scanner.nextLine());
                if (str.isEmpty()) continue;
                System.out.println("Hello, " + str);
            }
        }
    }
}
