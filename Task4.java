package com.epam.lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int size = getSize();
        int[] array = getArray(size);
        outputArray(array);

        int j = 0, k = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                j++;
            } else {
                k++;
            }
        }
        int[] arrayPlus = new int[j];
        int[] arrayMinus = new int[k];


        for (int i = 0, a = 0; i < array.length; i++) {
            if (array[i] > 0) {
                arrayPlus[a] = array[i];
                a++;
            }
        }
        outputArray(arrayPlus);


        for (int i = 0, b = 0; i < array.length; i++) {
            if (array[i] < 0) {
                arrayMinus[b] = array[i];
                b++;
            }
        }
        outputArray(arrayMinus);
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
