package com.Epam.company.HomeWork5.task1;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int size = getSize();
        int[] array = getArray(size);
        outputArray(array);
        int[] arrayReverse = new int[size];
        inputReverseArray(array, arrayReverse);
    }

    private static void inputReverseArray(int[] array, int[] arrayReverse) {
        System.out.print("Reverse array - >");
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            arrayReverse[j] = array[i];
        }
        System.out.print(Arrays.toString(arrayReverse));
    }

    private static void outputArray(int[] array) {
        System.out.print("Array - > ");
        System.out.println(Arrays.toString(array));
    }

    private static int[] getArray(int size) {
            int[] array = new int[size];
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 25);
            }
            return array;
    }

    private static int getSize() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter the array size - > ");
        return scanner.nextInt();
    }
}
