package com.epam.training.student_tatsiana_mikhnavets.java_basics.nested_classes.arithmetic_expressions;

public class Variable implements Expression {
    private String name;
    private int value;

    public Variable(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public int evaluate() {
        return value;
    }

    @Override
    public String toExpressionString() {
        return name;
    }
}