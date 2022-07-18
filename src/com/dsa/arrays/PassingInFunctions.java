package com.dsa.arrays;

import java.util.Arrays;

public class PassingInFunctions {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(nums));
        changeNums(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void changeNums(int[] nums) {
        nums[0] = 999;
    }
}
