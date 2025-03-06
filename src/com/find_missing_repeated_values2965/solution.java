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


//    public int[] findMissingAndRepeatedValues(int[][] grid){
//        int n = grid.length*grid.length;
//        int[] count = new int[n + 1];
//        int max = -1;
//        ArrayList<Integer> res = new ArrayList<>();
//        for(int i = 0; i < grid.length; i++){
//            for(int j = 0; j < grid[0].length; j++){
//                int currNum = grid[i][j];
//                if(count[currNum] != 0){
//                    res.add(currNum);
//                }
//                max = Math.max(currNum, max);
//                count[currNum]++;
//            }
//        }
//        for(int i = 1; i <= n; i++){
//            if(count[i] == 0){
//                res.add(i);
//            }
//        }
//        int[] res1 = new int(res.size());
//        for(int i = 0; i < res.size(); i++){
//            rs1[i] = res.get(i);
//        }
//        return res1;
//    }