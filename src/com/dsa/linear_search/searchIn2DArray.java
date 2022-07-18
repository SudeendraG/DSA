package com.dsa.linear_search;

import java.util.Arrays;

public class searchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {12, 34, 65},
                {24, 23, 45, 76},
                {78, 99, 83},
                {13, 8}
        };

        System.out.println(Arrays.toString(findIn2DArray(arr, 99)));
        System.out.println(Arrays.toString(findIn2DArray(arr, 13)));
        System.out.println(findMaxIn2DArray(arr));
        System.out.println(findMinIn2DArray(arr));
    }

    private static int[] findIn2DArray(int[][] arr, int searchTarget) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == searchTarget) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }


    private static int findMaxIn2DArray(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];
                }
            }
        }
        return max;
    }

    private static int findMinIn2DArray(int[][] arr) {
        int min = Integer.MAX_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] < min) {
                    min = arr[row][col];
                }
            }
        }
        return min;
    }
}
