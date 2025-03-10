package com.max_abs_sum_of_Any_array_1749;
import java.util.*;
public class solution {
    public static int maxAbsoluteSum(int[] nums){
        int sum = 0, maxSum = 0, minSum = 0;
        for(int num : nums){
            sum = sum + num;
            if(sum > maxSum) maxSum = sum;
            if(sum < minSum) minSum = sum;
        }
        return Math.abs(maxSum - minSum);
    }

    public static void main(String[] args) {
        int[] nums = {1,-3,2,3,-4};
        System.out.println((maxAbsoluteSum(nums)));
    }
}
//Kadane's algorithm can be modified to solve efficiently
//Instead of just tracking maximum subarray sum we can also track minimum subarray sum
//to find the maximum absolute sum return the abs sum of (maxSum - minSum)