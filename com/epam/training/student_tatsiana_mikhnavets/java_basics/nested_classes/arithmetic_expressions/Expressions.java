package com.epam.training.student_tatsiana_mikhnavets.java_basics.nested_classes.arithmetic_expressions;

public class Expressions {

    public static Variable var(String name, int value) {
        return new Variable(name, value);
    }

    public static Expression val(int value) {
        return new Expression() {
            @Override
            public int evaluate() {
                return value;
            }
            @Override
            public String toExpressionString() {
                return (value>=0) ? Integer.toString(value) : "("+ value+")";
            }
        };
    }

    public static Expression sum(Expression... members){
        return new Expression() {
            @Override
            public int evaluate() {
                return add(members);
            }
            @Override
            public String toExpressionString() {
                return operationRepresentation("+", members);
            }
        };
    }

    public static Expression product(Expression... members){
        return new Expression() {
            @Override
            public int evaluate() {
                return multiply(members);
            }
            @Override
            public String toExpressionString() {
                return operationRepresentation("*", members);
            }
        };
    }

    public static Expression difference(Expression minuend, Expression subtrahend){
        return new Expression() {
            @Override
            public int evaluate() {
                return minuend.evaluate() - subtrahend.evaluate();
            }
            @Override
            public String toExpressionString() {
                return "(" + minuend.toExpressionString() + " - " + subtrahend.toExpressionString() + ")";
            }
        };
    }

    public static Expression fraction(Expression dividend, Expression divisor){
        return new Expression(){
            @Override
            public int evaluate() {
                return dividend.evaluate()/ divisor.evaluate();
            }
            @Override
            public String toExpressionString() {
                return "(" + dividend.toExpressionString() + " / " + divisor.toExpressionString() + ")";
            }
        };
    }
    private static int add(Expression ...members) {
        int sum =0;
        for(Expression member : members) {
            sum +=member.evaluate();
        }
        return sum;
    }
    private static int multiply(Expression ...members) {
        int product = 1;
        for(Expression member : members) {
            product *= member.evaluate();
        }
        return product;
    }
    private static String operationRepresentation(String operator, Expression... members) {
        String operationRepresentation = "(";
        for (int i =0; i < members.length; i++) {
            operationRepresentation +=members [i].toExpressionString();
            if (i+1<members.length) {
                operationRepresentation+= " " + operator + " ";
            }
        }
        return operationRepresentation += ")";
    }

}

