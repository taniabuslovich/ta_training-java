package com.epam.training.student_tatsiana_mikhnavets.java_basics.classes.line_intersection;

public class Line {
    public int k;
    public int b;

    public Line(int k, int b) {
        this.k=k;
        this.b=b;

    }

    public Point intersection(Line other) {
        int x;
        int y;
        if (k!= other.k) {
            x=(other.b-b)/(k- other.k);
            y=k*x+b;
        }else return null;
        return new Point(x,y);

    }

}


