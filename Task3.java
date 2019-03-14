package com.Epam.company.HomeWork5.task1.task3;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int size = getSize();
        int[] array1 = getArray(size);
        int[] array2 = getArray(size);
        outputArray(array1);
        outputArray(array2);
        int[] array3 = new int[size];
        resultArray(array1, array2, array3);
        outputArray(array3);
    }

    private static void resultArray(int[] array1, int[] array2, int[] array3) {
        for (int i = 0, j = 0, k = 0; i < array3.length; i++, j++, k++) {
            array3[i] = array1[j] + array2[k];
        }
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

    private static void outputArray(int[] array) {
        System.out.print("Array - > ");
        System.out.println(Arrays.toString(array));
    }
}
