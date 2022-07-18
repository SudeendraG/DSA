package com.dsa.arrays;

public class Max {
    public static void main(String[] args) {
        int[] arr = {8, 11, 23, 8, 12};
        int maxNumber = findMax(arr);
        System.out.println(maxNumber);
        int[] arr2 = {50};
        System.out.println(findMax(arr2));
        System.out.println(findMaxRange(arr, 0, 1));
    }




    private static int findMax(int[] arr) {
        int max = arr[0];

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    private static int findMaxRange(int[] arr, int startIndex, int endIndex) {
        if (endIndex < startIndex) {
            return -1;
        }
        if (arr == null) {
            return -1;
        }
        int max = arr[startIndex];
        for (int i = startIndex; i <= endIndex; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
