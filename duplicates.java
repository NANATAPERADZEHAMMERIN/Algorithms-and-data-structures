package com.company;

import java.util.Arrays;

public class duplicates {
    public static void main(String [] argc){
        int [] numbers = {1, 1, 2, 2, 3, 3, 4, 5, 6, 6, 6, 7, 8, 10, 11, 11, 11};
        System.out.print("Before: " + Arrays.toString(numbers) + "\n");
        int replacement = 0;
        int previousElement = numbers[0];
        for(int i = 0; i < numbers.length; i++) {
            if(i > 0 && numbers[i] == previousElement){
                numbers[i - 1] = replacement;
            }
            previousElement = numbers[i];
        }

        System.out.println("After: " + Arrays.toString(numbers));
    }
}
