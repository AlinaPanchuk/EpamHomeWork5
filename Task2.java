package com.Epam.company.HomeWork5.task1.task2;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int size = getSize();
        int[] array = getArray(size);
        outputArray(array);
        amountOfOddElements(array);
    }

    private static void amountOfOddElements(int[] array) {
        int summ = 0;
        for (int i = 0; i < array.length ; i++) {
            if (array[i]%2!=0 ){
                summ = summ + array[i];
            }
        }
        System.out.println("Amount of odd elements in Array = " + summ);
    }

    private static int getSize() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the array size - > ");
        return scanner.nextInt();
    }

    private static int[] getArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 25);
        }
        return array;
    }

    private static void outputArray(int[] array) {
        System.out.print("Array - > ");
        System.out.println(Arrays.toString(array));
    }
}
