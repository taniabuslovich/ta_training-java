package com.epam.training.student_tatsiana_mikhnavets.basics_of_oop.gradually_decreasing_carousel;

public class GraduallyDecreasingCarousel extends DecrementingCarousel{
    public GraduallyDecreasingCarousel(final int capacity) {
        super(capacity);
    }
    @Override
    public CarouselRun run() {
        if (!carouselGo) {
            carouselGo=true;
            return new CarouselRun(1);
        }
        return super.run();
    }
}


