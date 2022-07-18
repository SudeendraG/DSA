package com.dsa.binary_search;

public class FloorProblem {
    // floor  =  greatest element in the array which is less than or equal to target

    public static void main(String[] args) {
        int[] arr = {-12, -7, 0, 5, 9, 12, 15, 25, 56, 78, 87, 99};
        System.out.println(binarySearchFloorGeneric(arr, 14));
        System.out.println(binarySearchFloorGeneric(arr, 12));
        System.out.println(binarySearchFloorGeneric(arr, 23));
        System.out.println(binarySearchFloorGeneric(arr, 86));
        System.out.println(binarySearchFloorGeneric(arr, 99));

        int[] arrDesc = {99, 80, 72, 56, 25, 13, 10, 5, 3, 0, -1, -2, -22};
        System.out.println(binarySearchFloorGeneric(arrDesc, 87));
    }


    //target should be always between start and end  --> s m e  --> target = m
    //loop breaks when start > end        --> e m s
    // in case of ascending order   --> greatest of next lowest is obviously left-hand side i.e, end
    // in case of descending order --> greatest of next lowest would be right-hand side i.e,       start


    private static int binarySearchFloorAsc(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (target < arr[middle]) {
                end = middle - 1;
            } else if (target > arr[middle]) {
                start = middle + 1;

            } else return middle;
        }
        return arr[end];
    }


    private static int binarySearchFloorDesc(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (target > arr[middle]) {
                end = middle - 1;
            } else if (target < arr[middle]) {
                start = middle + 1;
            } else return middle;
        }
        return arr[start];
    }


    public static int binarySearchFloorGeneric(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {

            int middle = start + (end - start) / 2;

            if (target == arr[middle]) {
                return arr[middle];
            }
            if (isAsc) {
                if (target < arr[middle]) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            } else {
                if (target > arr[middle]) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            }
        }
        return isAsc ? arr[end] : arr[start];
    }
}
