package com.dsa.binary_search;

//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class InfiniteArray {


    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(ans(arr, target));
        int[] arr2 = {-12, -7, 0, 5, 9, 12, 15, 25, 56, 78, 87, 99};
        System.out.println(ans(arr2, 56));
    }

    private static int ans(int[] arr, int target) {
        //lets take a smaller chunk i.e, 0,1
        int start = 0;
        int end = 1;
        //s e ==>
        // 1,2,5,8,9,12,23,45   ||
        //s   e
        // 1,2,5,8,9,12,23,45

        while (end < arr.length && target > arr[end]) {
            int newStart = end + 1;
            //double the box or search space
            // new end = previous end +boxsize *2
            end = end + (end - start + 1) * 2;  // derive this draw the array and check  we are splitting into chunks
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
    }

    public static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }

        }
        return -1;
    }
}
