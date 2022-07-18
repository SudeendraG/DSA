package com.dsa.binary_search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-12, -7, 0, 5, 9, 12, 15, 25, 56, 78, 87, 99};
        System.out.println(binarySearchAsc(arr, 87));
        System.out.println(binarySearchAsc(arr, -12));
        System.out.println(binarySearchAsc(arr, 12));
        System.out.println(binarySearchAsc(arr, 1222));

        int[] arrDesc = {99, 80, 72, 56, 25, 13, 10, 5, 3, 0, -1, -2, -22};

        System.out.println(binarySearchDesc(arrDesc, 99));
        System.out.println(binarySearchDesc(arrDesc, -22));
        System.out.println(binarySearchDesc(arrDesc, 0));
        System.out.println(binarySearchDesc(arrDesc, 56));
        System.out.println(binarySearchDesc(arrDesc, 9923));
    }

    //return index
    //return -1 if target not exists
    //assuming array is sorted in ascending order
    private static int binarySearchAsc(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

//         int middle = (start + end )/2 ; // might return error in case of large number so to avoid restructuring the formula as
        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (target < arr[middle]) {
                end = middle - 1;
            } else if (target > arr[middle]) {
                start = middle + 1;
            } else return middle;
        }
        return -1;
    }

    //return index
    //return -1 if target not exists
    //assuming array is sorted in ascending order
    private static int binarySearchDesc(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

//         int middle = (start + end )/2 ; // might return error in case of large number so to avoid restructuring the formula as
        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (target > arr[middle]) {
                end = middle - 1;
            } else if (target < arr[middle]) {
                start = middle + 1;
            } else return middle;
        }
        return -1;
    }


}