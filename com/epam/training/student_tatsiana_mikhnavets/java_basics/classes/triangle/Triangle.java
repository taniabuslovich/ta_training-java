package com.epam.training.student_tatsiana_mikhnavets.java_basics.classes.triangle;

import static java.lang.Math.*;

public class Triangle {
    Point pointA;
    Point pointB;
    Point pointC;

    public Triangle(Point a, Point b, Point c) {
        pointA = a;
        pointB =b;
        pointC = c;
        double doubleAB = sqrt(pow((pointB.getX() - pointA.getX()), 2) + pow((pointB.getY() - pointA.getY()), 2));
        double doubleBC = sqrt(pow((pointC.getX()- pointB.getX()),2)+pow((pointC.getY()-pointB.getY()),2));
        double doubleCA = sqrt(pow((pointA.getX()-pointC.getX()),2)+pow((pointA.getY()- pointC.getY()),2));
        if (doubleAB+doubleBC > doubleCA && doubleBC+doubleCA>doubleAB && doubleCA+doubleAB>doubleBC) {


        }
        else throw new IllegalArgumentException();
    }


    public double area() {
        return abs(((pointB.getX()-pointA.getX())*((pointC.getY())-pointA.getY())-(pointC.getX()-pointA.getX())*(pointB.getY()-pointA.getY()))/2);
    }

    public Point centroid(){
        return new Point ((pointA.getX()+pointB.getX()+pointC.getX())/3,(pointA.getY()+pointB.getY()+ pointC.getY())/3);
    }

}

