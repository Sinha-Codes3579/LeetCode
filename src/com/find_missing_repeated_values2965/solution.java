package com.find_missing_repeated_values2965;
import java.util.*;
public class solution {
    public int[] findMissingAndRepeatedValues(int[][] grid){
        int n = grid.length;
        int size = n * n;
        int[] count = new int[size + 1];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                count[grid[i][j]]++;
            }
        }
        int a = -1, b = -1;
        for(int num = 1; num <= size; num++){
            if(count[num] == 2){
                a = num;
            }else if(count[num] == 0){
                b = num;
            }
        }
        return new int[]{a, b};
    }
    public static void main(String[] args){
        int[][] grid = {{1, 3}, {2, 2}};
        solution sol = new solution();
        int[] count = sol.findMissingAndRepeatedValues(grid);
        System.out.println(java.util.Arrays.toString(count));
    }
}
