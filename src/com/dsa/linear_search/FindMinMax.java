package com.dsa.linear_search;

public class FindMinMax {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 12, 56, -7, 67, 23, 23};
        System.out.println(findMin(arr));
        System.out.println(findMax(arr));
    }

    private static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    private static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }


}
