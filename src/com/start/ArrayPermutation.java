package com.start;

import java.util.Arrays;

public class ArrayPermutation {
    static void permutationWithValue(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    static void permutationWithoutValue(int[] array, int i, int j) {
        array[i] = array[i] + array[j];
        array[j] = array[i]  - array[j];
        array[i] = array[i] - array[j];
    }
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4};
        System.out.print(Arrays.toString(array));
        permutationWithValue(array, 3, 1);
        System.out.println();
        System.out.print(Arrays.toString(array));
        System.out.println();
        permutationWithoutValue(array, 3, 1);
        System.out.println(Arrays.toString(array));

    }
}
