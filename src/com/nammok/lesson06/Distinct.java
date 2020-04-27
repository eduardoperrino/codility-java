package com.nammok.lesson06;

import java.util.HashMap;

/**
 * -- EXERCISE DESCRIPTION
 *
 * Write a function
 *
 * class Solution { public int solution(int[] A); }
 *
 * that, given an array A consisting of N integers, returns the number of distinct values in array A.
 *
 * For example, given array A consisting of six elements such that:
 *
 *  A[0] = 2    A[1] = 1    A[2] = 1
 *  A[3] = 2    A[4] = 3    A[5] = 1
 * the function should return 3, because there are 3 distinct values appearing in array A, namely 1, 2 and 3.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [0..100,000];
 * each element of array A is an integer within the range [−1,000,000..1,000,000].
 */

public class Distinct {

    static final int solution(int[] A) {
        HashMap<Integer,Integer> occurs = new HashMap<>();
        for(int i=0; i<A.length;i++) {
            occurs.put(A[i], occurs.containsKey(A[i]) ? occurs.get(A[i]++) : 1);
        }
        return occurs.keySet().size();
    }

    public static void main(String[] args) {
        int[] data = {3,8,7,4,345,4,7,3,8, 10, 10, 10,8 , 165, 11, 11,  11, 11, 2, 345};
        System.out.println("Solution: " + solution(data));
    }
}
