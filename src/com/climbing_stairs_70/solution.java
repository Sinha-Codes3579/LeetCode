package com.climbing_stairs_70;

import java.util.*;

public class solution {
    public static int climbStairs(int n){
        if(n == 0 || n == 1) return 1;
        int left = climbStairs(n - 1);
        int right = climbStairs(n - 2);
        return left + right;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of steps to reach top.");
        int n = sc.nextInt();
        System.out.println("Number of distinct ways to climb to top:");
        System.out.println(climbStairs(n));
    }
}
