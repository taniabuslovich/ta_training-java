package com.epam.training.student_tatsiana_mikhnavets.abstract_classes_and_interfaces.figures_extra;

abstract class Figure {
    public final double ERROR_DELTA = 0.001;

    public abstract Point centroid();
    public abstract boolean isTheSame(Figure figure);
}