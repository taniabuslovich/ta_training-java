package com.epam.training.student_tatsiana_mikhnavets.classes.triangle;

public class main {
    public static void main(String[] args) {


        double area = new Triangle(new Point(0, 0), new Point(3, 0), new Point(0, 4)).area();
        System.out.println(area);
        Point centroid = new Triangle(new Point(0,0), new Point(3, 0), new Point(0, 3)).centroid();

        System.out.println(centroid.getX());
        System.out.println(centroid.getY());
    }
}
