package com.count_square_submatrices_with_allones_1277;
import java.util.*;
public class solution {
    public static int countSquare(int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;
        //create dp table with same dimensions as matrix
        int[][] dp = new int[n][m];
        int ans = 0;
        //initialize first column of dp table
        for(int i = 0; i < n; i++){
            dp[i][0] = matrix[i][0];
            ans = ans + dp[i][0];
        }
        //initialize first row of dp table
        for(int j = 1; j < m; j++){
            dp[0][j] = matrix[0][j];
            ans = ans + dp[0][j];
        }
        //find the dp table of remaining cells
        for(int i = 1; i < n; i++){
            for(int j = 1; j < m; j++){
                if(matrix[i][j] == 1){
                    dp[i][j] = 1 + Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]);
                }
                ans = ans + dp[i][j];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of column of matrix");
        int n = sc.nextInt();
        System.out.println("Enter the size of row of matrix");
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int ans = countSquare(matrix);
        System.out.println(ans);
    }
}
