package com.dsa.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        int[] arr = new int[4];
        arr[0] = 1;
        arr[1] = 13;
        arr[2] = 12;
        arr[3] = 11;
        Scanner scanner = new Scanner(System.in);
        //printing array in 3 types

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print(Arrays.toString(arr));
    }
}
