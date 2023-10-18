package com.epam.training.student_tatsiana_mikhnavets.java_basics.abstract_classes_and_interfaces.figures_extra;

public class Circle extends Figure{
    public double rad;
    Point center;

    public Circle(Point center, double rad) {
        this.rad = rad;
        this.center = center;

        if (this.rad>0 && this.center !=null) {

        } else throw new IllegalArgumentException();
    }
    @Override
    public Point centroid() {
        return center;
    }
    @Override
    public boolean isTheSame(Figure figure) {
        if (getClass() == figure.getClass()&& Math.abs(rad - ((Circle) figure).rad) <ERROR_DELTA && Math.abs(center.getX()- ((Circle) figure).center.getX()) < ERROR_DELTA && Math.abs(center.getY()- ((Circle) figure).center.getY()) < ERROR_DELTA) return true;
        else return false;
    }
    double area() {
        return Math.PI *rad*rad;
    }
}
