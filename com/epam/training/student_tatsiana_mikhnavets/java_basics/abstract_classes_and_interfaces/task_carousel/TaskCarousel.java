package com.epam.training.student_tatsiana_mikhnavets.java_basics.abstract_classes_and_interfaces.task_carousel;

public class TaskCarousel {
    int capacity = -1;
    int task =0;
    Task [] carousel;

    public TaskCarousel(int capacity) {
        if (capacity >0) {
            this.capacity = capacity;
            carousel = new Task [capacity];
        } else throw new UnsupportedOperationException();
    }

    public boolean addTask(Task task) {
        if (!task.isFinished() && !isFull()) {
            while (carousel[this.task] != null) {this.task = carouselReposition(this.task);}
            carousel [this.task] = task;
            this.task = carouselReposition(this.task);
            return true;
        }
        else return false;
    }

    public boolean execute() {
        boolean result;
        if (!isEmpty()) {
            while (carousel[task] ==null) {task = carouselReposition(task);}
            carousel [task].execute();
            if (carousel[task].isFinished()) carousel[task] = null;
            task = carouselReposition(task);
            result=true;
        } else result = false;
        return result;
    }

    public boolean isFull() {
        boolean result = false;
        if (capacity!=0) {
            int j=0;
            for (int i =0; i<capacity; i++) {
                if (!(carousel[i] == null))
                    j++;
            }
            if (j==capacity) result = true;
        }
        return result;
    }

    public boolean isEmpty() {
        boolean result = false;
        if (capacity !=0) {
            int j=0;
            for (int i =0;i<capacity;i++){
                if (carousel[i] ==null) j++;
            }
            if (j==capacity) result = true;
        } else result = true;
        return result;
    }
    private int carouselReposition (int position) {
        if (position+1 >= capacity) {
            position = 0;
        } else position ++;
        return position;
    }


}
