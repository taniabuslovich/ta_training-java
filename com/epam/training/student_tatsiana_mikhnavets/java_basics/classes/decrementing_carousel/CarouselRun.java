package com.epam.training.student_tatsiana_mikhnavets.java_basics.classes.decrementing_carousel;

public class CarouselRun {
    int position = 0;

    public int next() {
        while (DecrementingCarousel.carousel[position] ==0 && !isFinished()) {
            position = carouselReposit(position);
        }
        int element = DecrementingCarousel.carousel[position];
        if (!isFinished()) {
            int next = element;
            next--;
            DecrementingCarousel.carousel[position] = next;
            position = carouselReposit(position);
        } else element =-1;
        return element;
    }

    public boolean isFinished() {
        boolean result;
        int j =0;
        for (int i=0; i<=DecrementingCarousel.carousel.length-1;i++) {
            if (DecrementingCarousel.carousel[i] ==0) {
                j++;
            }
        }
        result = j == DecrementingCarousel.carousel.length;
        return result;
    }
    public int carouselReposit(int position) {
        if (position+1 == DecrementingCarousel.carousel.length) {
            position =0;
        } else position++;
        return position;
    }

}


