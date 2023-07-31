package com.epam.training.student_tatsiana_mikhnavets.classes.decrementing_carousel;

public class main {
    public static void main(String[] args) {
        DecrementingCarousel carousel = new DecrementingCarousel(7);

        carousel.addElement(2);
        carousel.addElement(3);
        carousel.addElement(1);

        CarouselRun run = carousel.run();

        System.out.println(run.isFinished()); //false

        System.out.println(run.next()); //2
        System.out.println(run.next()); //3
        System.out.println(run.next()); //1

        System.out.println(run.next()); //1
        System.out.println(run.next()); //2

        System.out.println(run.next()); //1

        System.out.println(run.isFinished()); //true
        System.out.println(run.next());
    }
}
