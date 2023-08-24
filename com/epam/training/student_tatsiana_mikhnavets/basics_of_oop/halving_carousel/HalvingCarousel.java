package com.epam.training.student_tatsiana_mikhnavets.basics_of_oop.halving_carousel;

public class HalvingCarousel extends DecrementingCarousel {
    int position = 0;

    public HalvingCarousel(final int capacity) {

        super(capacity);
    }
    @Override
    public CarouselRun run() {
        if (!carouselGo) {
            carouselGo = true;
            return new CarouselRun(1);
        }
        return super.run();
    }

}

