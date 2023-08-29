package com.epam.training.student_tatsiana_mikhnavets.basics_of_oop.gradually_decreasing_carousel;

public class DecrementingCarousel {
    static int[] carousel;
    int i;
    boolean carouselGo = false;
    public DecrementingCarousel(int capacity) {
        i =0;
        carousel = new int [capacity];
    }

    public boolean addElement(int element){
        boolean gotIt;
        if (element >0 &&i<carousel.length &&!carouselGo) {
            carousel[i] = element;
            i++;
            gotIt=true;
        } else gotIt = false;
        return gotIt;
    }

    public CarouselRun run(){
        if (!carouselGo) {
            carouselGo=true;
            return new CarouselRun();
        }
        return null;
    }
}
