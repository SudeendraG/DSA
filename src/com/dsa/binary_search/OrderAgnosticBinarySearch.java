package com.dsa.binary_search;


//if array is   sorted but we dont know in which order it is sorted
// to find that always compare first and last element
public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {-12, -7, 0, 5, 9, 12, 15, 25, 56, 78, 87, 99};


        int[] arrDesc = {99, 80, 72, 56, 25, 13, 10, 5, 3, 0, -1, -2, -22};

        System.out.println(OrderAgnosticBs(arr, 87));
        System.out.println(OrderAgnosticBs(arr, -12));
        System.out.println(OrderAgnosticBs(arr, 12));
        System.out.println(OrderAgnosticBs(arr, 1222));

        System.out.println(OrderAgnosticBs(arrDesc, 99));
        System.out.println(OrderAgnosticBs(arrDesc, -22));
        System.out.println(OrderAgnosticBs(arrDesc, 0));
        System.out.println(OrderAgnosticBs(arrDesc, 56));
        System.out.println(OrderAgnosticBs(arrDesc, 9923));
    }

    public static int OrderAgnosticBs(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (target == arr[middle]) {
                return middle;
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
        return -1;
    }
}