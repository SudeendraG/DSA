package com.dsa.linear_search;

public class SearchInRange {

    public static void main(String[] args) {
        String str = "Sudeendra";
        char target = 'S';
        boolean isExists = searchInRange(str, target, 1, 4);
        System.out.println(isExists);
        System.out.println(searchInRange(str, 'a', 5, 9));
    }

    private static boolean searchInRange(String str, char target, int start, int end) {

        for (int i = start; i <= end; i++) {
            if (str.charAt(i) == target) {
                return true;
            }
        }
        return false;
    }


}
