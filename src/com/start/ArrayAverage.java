package com.start;

class ArrayAverage {

    static int average(int[] array) {
        int result = 0;
        for (int j : array) {
            result += j;
        }
        return result / array.length;
    }

    public static void main(String[] args) {
      int[] array = new int[10];
      for (int i = 0; i < array.length; i++) {
          array[i] = i;
      }
        System.out.println(average(array));
    }
}
