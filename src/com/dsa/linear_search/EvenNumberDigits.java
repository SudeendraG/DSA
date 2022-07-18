package com.dsa.linear_search;

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class EvenNumberDigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
        int[] nums2 = {12, 345, 2, 6, -7896, 89, 100, 1234, 96, 9890};
        System.out.println(findNumbers(nums2));
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (isEvenDigits(num)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isEvenDigits(int num) {
        if (num < 0) {
            num = num * -1;
        }
        return digits(num) % 2 == 0;
    }

    private static int digits(int num) {
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        return count;
    }
}
