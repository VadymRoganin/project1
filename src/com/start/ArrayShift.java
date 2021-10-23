package com.start;

import java.util.Arrays;

public class ArrayShift {

    static int[] shift(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            // a = b + a; b = a - b; a = a - b
            // a = a + b - (b = a)
            array[i] = array[i] + array[i + 1] - (array[i + 1] = array[i]);
        }
        return array;
    }

    public static void main(String[] args) {
       int[] array = {1, 2, 3, 4, 5, 6};
        System.out.print("Original array: " + Arrays.toString((array)));
        System.out.println();
        System.out.print("Array after permutation: " + Arrays.toString(shift(array)));
    }
}