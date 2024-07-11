package com.kClosest;

import java.util.*;
/**
 * kClosestPointToOrigin973
 */
public class solution {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        sTriangle(arr);
    }

    public static void sTriangle(int[] arr) {
        if (arr.length < 1) {
            return;
        }
        int[] array = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            int a = arr[i] + arr[i + 1];
            array[i] = a;
        }
        // Make a recursive call and pass the newly created array
        sTriangle(array);
        System.out.println(Arrays.toString(arr));
    }
}