package com.epam.training.student_tatsiana_mikhnavets.java_basics.abstract_classes_and_interfaces.figures;

public class Run {
    public static void main(String[] args) {
        double area = new Triangle(new Point(0,0), new Point(3, 0), new Point(0, 4)).area();
        System.out.println(area);
    }
}
