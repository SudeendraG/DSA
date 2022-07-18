package com.dsa.binary_search;

//https://leetcode.com/problems/find-in-mountain-array/
public class FindInMountainArray {
    //find the peak of the array
    // now binary search in left side of the array for target if found done return the index
    /// else do binary search in right side of the target
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        System.out.println(search(arr, 3));
    }

    static int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = OrderAgnosticBs(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        return OrderAgnosticBs(arr, target, peak + 1, arr.length - 1);
    }


    public static int peakIndexInMountainArray(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
            //finally we have start = end
        }
        return start; //you can also return end as start and end will be pointing to same element at the end
    }


    public static int OrderAgnosticBs(int[] arr, int target, int start, int end) {

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


