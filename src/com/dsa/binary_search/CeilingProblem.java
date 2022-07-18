package com.dsa.binary_search;

public class CeilingProblem {
    // ceiling  =  smallest element in the array which is greater or equal to target
    public static void main(String[] args) {
        int[] arr = {-12, -7, 0, 5, 9, 12, 15, 25, 56, 78, 87, 99};
        System.out.println(binarySearchCeilingGeneric(arr, 14));
        System.out.println(binarySearchCeilingGeneric(arr, 12));
        System.out.println(binarySearchCeilingGeneric(arr, 23));
        System.out.println(binarySearchCeilingGeneric(arr, 86));
        System.out.println(binarySearchCeilingGeneric(arr, 99));

        int[] arrDesc = {99, 80, 72, 56, 25, 13, 10, 5, 3, 0, -1, -2, -22};
        System.out.println(binarySearchCeilingGeneric(arrDesc, 87));
    }


    //target should be always between start and end  --> s m e  --> target = m
    //loop breaks when start > end        --> e m s
    // in case of ascending order   --> smallest of next greatest is obviously right-hand side i.e, start
    // in case of descending order --> smallest of next greatest would be left-hand side i.e,       end


    private static int binarySearchCeilingAsc(int[] arr, int target) {
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
        return arr[start];
    }


    private static int binarySearchCeilingDesc(int[] arr, int target) {
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
        return arr[end];
    }


    public static int binarySearchCeilingGeneric(int[] arr, int target) {
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
        return isAsc ? arr[start] : arr[end];
    }
}
