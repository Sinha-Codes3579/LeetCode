package com.build_arr_from_permutation_1920;

import java.util.Scanner;

public class solution {
    public static int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for(int i = 0; i < n; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter values of the array nums");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int[] ans = buildArray(nums);
        for(int i = 0; i < n; i++){
            System.out.println(ans[i]);
        }
    }
}
/*
using recursion:
public static int[] buildArray(int[] nums){
    func(nums, 0);
    return nums;
}
public static void func(int[] nums, int start){
    if(start < nums.length){
        int t = nums[start];
        int res = nums[t];
        func(nums, start + 1);
        nums[start] = res;
 */