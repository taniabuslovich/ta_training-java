package com.epam.training.student_tatsiana_mikhnavets.java_basics.generics.be_aware_of_dogs.house;

import java.util.ArrayList;
import java.util.List;

public class House <T> {

    private final List<T> residents = new ArrayList<>();

    public void enter(T resident) {
        residents.add(resident);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("There are following residents in the house:\n");
        for (Object resident : residents) {
            builder.append(resident.toString()).append("\n");
        }
        return builder.toString();
    }
}
