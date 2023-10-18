package com.epam.training.student_tatsiana_mikhnavets.java_basics.generics.be_aware_of_dogs.residents.dogs;

public class Dog {

    protected String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog " + name;
    }
}