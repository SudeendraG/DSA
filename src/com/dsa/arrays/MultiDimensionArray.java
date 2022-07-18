package com.dsa.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArray {
    public static void main(String[] args) {

        // int[][] arr = new int[rowsize][coloumsize(optional]
        //in line
       /* int[][] arr = {
                {1, 2, 3, 4}, //0th index
                {4, 5},       // 1st index
                {7, 8, 9}      //2nd index
        };*/
        Scanner scanner = new Scanner(System.in);
        ///input
        int[][] arr = new int[3][2];
        System.out.println(arr.length);
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = scanner.nextInt();
            }
        }

        //output
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        ///

        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

        for (int[] num : arr) {
            System.out.println(Arrays.toString(num));
        }

    }
}
