package com.epam.training.student_tatsiana_mikhnavets.java_basics.abstract_classes_and_interfaces.task_carousel;

public class CountDownTask implements Task{
        private int value;

    public CountDownTask(int value) {

            if (value>0) this.value = value;
            else this.value = 0;
        }

        public int getValue() {
            return value;
        }


        @Override
        public void execute() {

            if (value>0) value--;
        }

        @Override
        public boolean isFinished() {

            if (value ==0) return true;
            else return false;
        }
    }

