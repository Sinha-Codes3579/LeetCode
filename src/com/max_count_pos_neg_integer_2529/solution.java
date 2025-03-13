package com.max_count_pos_neg_integer_2529;

import java.util.*;
public class solution {
    public static int maximumCount(int[] nums) {
        int countpos = 0;
        int countneg = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(nums[i] < 0){
                countneg++;
            }else if(nums[i]>0){
                countpos++;
            }
        }
        if(countpos > countneg){
            return countpos;
        }else{
            return countneg;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter an array including 0 as well as positive and negative number:");
        for (int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int m = maximumCount(nums);
        System.out.println(m);
    }
}
