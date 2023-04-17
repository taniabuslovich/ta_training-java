package com.epam.training.student_tatsiana_mikhnavets.arrays.max_method;

public class MaxMethod {
    public static void main(String[] args) {
        int [] inputArray = new int[] {-2,10,0,5};
        int result = MaxMethod.max(inputArray);
        System.out.println(result);
    }
    public static int max(int[] inputArray) {
        int maxValue = inputArray [0];
        for (int i=1; i< inputArray.length; i++) {
            if (inputArray[i] > maxValue) {
                maxValue = inputArray[i];
            }
        }
        return maxValue;


    }

}




