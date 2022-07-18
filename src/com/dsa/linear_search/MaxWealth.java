package com.dsa.linear_search;

//https://leetcode.com/problems/richest-customer-wealth/
public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1, 2, 3},
                {3, 2, 1}};
        System.out.println(maximumWealth(accounts));

        int[][] accounts2 = {{1, 5}, {7, 3}, {3, 5}};

        System.out.println(maximumWealth(accounts2));

        int[][] accounts3 = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};
        System.out.println(maximumWealth(accounts3));
    }

    public static int maximumWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;
        for (int row = 0; row < accounts.length; row++) {
            int sum = 0;
            for (int col = 0; col < accounts[row].length; col++) {
                sum += accounts[row][col];
                if (sum > maxWealth) {
                    maxWealth = sum;
                }
            }

        }
        return maxWealth;
    }
}
