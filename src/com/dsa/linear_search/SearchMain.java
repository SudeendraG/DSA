package com.dsa.linear_search;

public class SearchMain {
    public static void main(String[] args) {

        int[] arr = {1, 4, 6, 7, 12, 56};
        //best case O(1) , O(n)
        // find 4 exists in the array
        boolean isExists = linearSearch1(arr, 4);
        System.out.println(isExists);
        System.out.println(linearSearch2(arr, 56));
        System.out.println(linearSearch2(arr, 99));
        System.out.println(linearSearch3(arr, 99));
        System.out.println(linearSearch3(arr, 12));

    }

    private static boolean linearSearch1(int[] arr, int searchTerm) {
        for (int j : arr) {
            if (j == searchTerm) {
                return true;
            }
        }
        return false;
    }


    private static int linearSearch2(int[] arr, int searchTerm) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchTerm) {
                return i;
            }
        }
        return -1;
    }

    private static int linearSearch3(int[] arr, int searchTerm) {
        for (int j : arr) {
            if (j == searchTerm) {
                return j;
            }
        }
        return Integer.MAX_VALUE;
    }
}
