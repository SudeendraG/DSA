package com.dsa.binary_search;

//https://leetcode.com/problems/find-smallest-letter-greater-than-target/

// same as ceiling but no equal condition and letter wraparound condition i.e,
public class SmallestLetter {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        System.out.println(nextGreatestLetter(letters, 'a'));
        System.out.println(nextGreatestLetter(letters, 'c'));
        System.out.println(nextGreatestLetter(letters, 'd'));
    }


    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (target < letters[middle]) {

                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return start == letters.length ? letters[0] : letters[start];  // or  return letters[start%letters.length]; both are same


    }


    // for the same logic just reverting the if conditions are not working so always asc first < and for desc always first > check

   /*public static char nextGreatestLetter2(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (target > letters[middle]) {
                start = middle + 1;
            } else {

                end = middle - 1;
            }
        }
        return letters[start%letters.length];

    }*/


}
