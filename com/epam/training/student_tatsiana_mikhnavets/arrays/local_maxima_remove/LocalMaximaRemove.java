package com.epam.training.student_tatsiana_mikhnavets.arrays.local_maxima_remove;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LocalMaximaRemove {
    public static void main(String[] args) {
        int[] array = new int[]{18, 1, 3, 6, 7, -5};
        String result = Arrays.toString(removeLocalMaxima(array));
        System.out.println(result);
    }

    public static int[] removeLocalMaxima(int[] array) {
        List<Integer> locals = new ArrayList<>();
        if (array[0] <= array[1]) {
            locals.add(array[0]);
        }
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] <= array[i + 1] || array[i] <= array[i - 1]) {
                locals.add(array[i]);
            }
        }
        if (array[array.length - 2] >= array[array.length - 1]) {
            locals.add(array[array.length - 1]);
        }

        int[] arr = new int[locals.size()];
        for (int i = 0; i < locals.size(); i++) {
            arr[i] = locals.get(i);
        }
        return arr;
    }
}


