package com.dsa.binary_search;

import java.util.Arrays;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class FirstAndLastPosition {

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        System.out.println(Arrays.toString(searchRange(nums, 8)));
        int[] nums2 = {5, 7, 7, 8, 8, 10};
        System.out.println(Arrays.toString(searchRange(nums2, 6)));
        int[] nums3 = {};
        System.out.println(Arrays.toString(searchRange(nums3, 0)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        ans[0] = binarySearch(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = binarySearch(nums, target, false);
        }
        //logN + logN = 2 logN  we are ignoring constants so time complexity is logN

        return ans;
    }

    // when you found the target element we need to find the start index so instead of returning mid
    // again apply same logic go left for start and go right for end indexes because 8 may exists both on right and left side s.
    //finally return the ans;
    private static int binarySearch(int[] nums, int target, boolean isFirstIndex) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (isFirstIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return ans;
    }
}
