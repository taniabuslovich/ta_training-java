package com.epam.training.student_tatsiana_mikhnavets.java_basics.abstract_classes_and_interfaces.figures;

public abstract class Figure {
    public abstract double area();

    public abstract String pointsToString();

    public String toString() {

        return this.getClass().getSimpleName() + "[" + pointsToString() + "]";
    }

    public abstract Point leftmostPoint();
}
