package com.epam.training.student_tatsiana_mikhnavets.java_basics.generics.be_aware_of_dogs.residents.dogs;

public class Puppy extends Dog {

    public Puppy(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Puppy " + name;
    }
}
