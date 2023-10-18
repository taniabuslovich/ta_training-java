package com.epam.training.student_tatsiana_mikhnavets.java_basics.basics_of_oop.decrementing_carousel_with_limit;

public class DecrementingCarouselWithLimitedRun extends DecrementingCarousel{
    int actionLimit;
    public DecrementingCarouselWithLimitedRun(final int capacity, final int actionLimit) {

        super(capacity);
        this.actionLimit = actionLimit;
    }
    @Override
    public CarouselRun run () {
        if (!carouselGo) {
            carouselGo = true;
            return new CarouselRun(actionLimit);
        }
        return super.run();
    }
}


