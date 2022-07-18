package com.dsa.binary_search;

//https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class MountainArray1 {
   //montain array is increasing order of numbres and when reaches peak again decreases
    public static void main(String[] args) {
        int[] arr={0,1,0};
        System.out.println(peakIndexInMountainArray(arr));
        int[] arr2 = {0,10,5,2};
        System.out.println(peakIndexInMountainArray(arr2));
        int[] arr3 = {1,3,5,7,8,6,4,2,0};
        System.out.println(peakIndexInMountainArray(arr3));
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
}
