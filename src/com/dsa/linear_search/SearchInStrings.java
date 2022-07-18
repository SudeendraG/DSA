package com.dsa.linear_search;

public class SearchInStrings {
    public static void main(String[] args) {
        String str = "Sudeendra";
        char target = 'S';
        boolean isExists = search(str, target);
        System.out.println(isExists);
        System.out.println(search2(str, 'a'));
    }

    private static boolean search(String str, char target) {

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return true;
            }
        }
        return false;
    }


    private static boolean search2(String str, char target) {

        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }
}
