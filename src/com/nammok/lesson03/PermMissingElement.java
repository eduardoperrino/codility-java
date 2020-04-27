package com.nammok.lesson03;

/**
 * -- EXERCISE DESCRIPTION
 *
 * An array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)],
 * which means that exactly one element is missing.
 *
 * Your goal is to find that missing element.
 *
 * Write a function:
 *
 * class Solution { public int solution(int[] A); }
 *
 * that, given an array A, returns the value of the missing element.
 *
 * For example, given array A such that:
 *
 *   A[0] = 2
 *   A[1] = 3
 *   A[2] = 1
 *   A[3] = 5
 * the function should return 4, as it is the missing element.
 */

public class PermMissingElement {

    static int solution(int[] A) {
        if (A.length == 0)
            return 1;

        int sumOfAllNumbers = 0;
        for (int num : A)
            sumOfAllNumbers += num;

        long N = A.length;
        long expectedSumOfAllNumbers = ((N + 1)*(N + 2))/2;

        long missingNumber = expectedSumOfAllNumbers - sumOfAllNumbers;

        return (int) missingNumber;
    }

    public static void main(String[] args) {
        int[] A = {5, 3, 4, 2};
        System.out.println("Missing element : " + solution(A));
    }
}
