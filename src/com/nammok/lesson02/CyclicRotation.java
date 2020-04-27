package com.nammok.lesson02;

import java.util.Arrays;

/**
 * -- EXERCISE DESCRIPTION
 *
 * An array A consisting of N integers is given. Rotation of the array means that each element is shifted right by one
 * index, and the last element of the array is moved to the first place. For example, the rotation of array
 * A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7] (elements are shifted right by one index and 6 is moved to the first place).
 *
 * The goal is to rotate array A K times; that is, each element of A will be shifted to the right K times.
 *
 */

public class CyclicRotation {

    static int[] solution(int[] A, int K) {
        if (A.length == 0) return A;
        int[] rotatedA = new int[A.length];
        int rotationTimes = K%A.length;
        if(rotationTimes == 0) return A;
        for(int i=0; i<A.length; i++) {
            rotatedA[(i+rotationTimes)%A.length] = A[i];
        }
        return rotatedA;
    }

    public static void main(String[] args) {
        int N = 5;
        int[] data = {};
        System.out.println(Arrays.toString(solution(data, N)));
    }
}
