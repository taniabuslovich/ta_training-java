package com.epam.training.student_tatsiana_mikhnavets.generics.be_aware_of_dogs.house;

import com.epam.training.student_tatsiana_mikhnavets.generics.be_aware_of_dogs.residents.cats.Cat;
import com.epam.training.student_tatsiana_mikhnavets.generics.be_aware_of_dogs.residents.cats.Kitten;
import com.epam.training.student_tatsiana_mikhnavets.generics.be_aware_of_dogs.residents.dogs.Dog;
import com.epam.training.student_tatsiana_mikhnavets.generics.be_aware_of_dogs.residents.dogs.Puppy;

public class Main {

    public static void main(String[] args) {
        Dog rex = new Dog("Rax");
        Puppy randy = new Puppy("Randy");
        Cat barbos = new Cat("Barbos");
        Kitten murzik = new Kitten("Murzik");

        House<Dog> dogHouse = new House();
        dogHouse.enter(rex);
        dogHouse.enter(randy);
        System.out.println(dogHouse);

        House<Cat> catHouse = new House();
        catHouse.enter(barbos);
        catHouse.enter(murzik);
        System.out.println(catHouse);
    }
}
