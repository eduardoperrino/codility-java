package com.nammok.lesson02;

import java.util.HashMap;

/**
 * -- EXERCISE DESCRIPTION
 * A non-empty array A consisting of N integers is given. The array contains an odd number of elements,
 * and each element of the array can be paired with another element that has the same value, except for one element
 * that is left unpaired.
 *
 * For example, in array A such that:
 *
 *   A[0] = 9  A[1] = 3  A[2] = 9
 *   A[3] = 3  A[4] = 9  A[5] = 7
 *   A[6] = 9
 * the elements at indexes 0 and 2 have value 9,
 * the elements at indexes 1 and 3 have value 3,
 * the elements at indexes 4 and 6 have value 9,
 * the element at index 5 has value 7 and is unpaired.
 * Write a function:
 *
 * class Solution { public int solution(int[] A); }
 *
 * that, given an array A consisting of N integers fulfilling the above conditions, returns the value
 * of the unpaired element.
 *
 * For example, given array A such that:
 *
 *   A[0] = 9  A[1] = 3  A[2] = 9
 *   A[3] = 3  A[4] = 9  A[5] = 7
 *   A[6] = 9
 * the function should return 7, as explained in the example above.
 *
 */

public class OddOccurrencesInArray {

    static final int solution(int[] A) {
        HashMap<Integer,Integer> occurs = new HashMap<>();
        for(int i=0;i<A.length;i++){
            if(occurs.containsKey(A[i]) && occurs.get(A[i]) == 1) {
                occurs.remove(A[i]);
            }else{
                occurs.put(A[i],1);
            }
        }
        for(int key : occurs.keySet()){
            return key;
        }
        return 0;
    }

    public static void main(String[] args) {
       int[] data = {3,8,7,4,345,4,7,3,8, 10, 10, 11, 11, 2, 345};
       System.out.println("Solution: " + solution(data));
    }
}
