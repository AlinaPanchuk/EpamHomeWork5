package com.epam.lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        int size = getSize();
        int[] array = getArray(size);
        outputArray(array);

        int[] arrayPlus = new int[getArraPlusLength(array)];
        int[] arrayMinus = new int[getArrayMinusLength(array)];

        getArrayPlus(array, arrayPlus);
        outputArray(arrayPlus);

        getArrayMinus(array, arrayMinus);
        outputArray(arrayMinus);
    }

    private static int getArrayMinusLength(int[] array) {
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                k++;
            }
        }
        return k;
    }

    private static int getArraPlusLength(int[] array) {
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                j++;
            }
        }
        return j;
    }

    private static void getArrayMinus(int[] array, int[] arrayMinus) {
        for (int i = 0, b = 0; i < array.length; i++) {
            if (array[i] < 0) {
                arrayMinus[b] = array[i];
                b++;
            }
        }
    }

    private static void getArrayPlus(int[] array, int[] arrayPlus) {
        for (int i = 0, a = 0; i < array.length; i++) {
            if (array[i] > 0) {
                arrayPlus[a] = array[i];
                a++;
            }
        }
    }

    private static int getSize() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the array size - > ");
        return scanner.nextInt();
    }

    private static int[] getArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            do {
                array[i] = (int) ((Math.random() * 25) - 10);
            }
            while (array[i] == 0);
        }
        return array;
    }

    private static void outputArray(int[] array) {
        System.out.print("Array - > ");
        System.out.println(Arrays.toString(array));
    }
}
