package com.Special_Array_II_3152;
import java.util.*;
public class solution {
    public static boolean[] isArraySpecial(int[] nums, int[][] queries){
        int n = nums.length;
        int count[] = new int[n];
        count[0] = 0;
        for(int i = 1; i < n; i++){
            int parity = (nums[i] % 2 == nums[i - 1] % 2) ? 1 : 0;
            count[i] = count[i - 1] + parity;
        }
        int m = queries.length;
        boolean[] res = new boolean[m];
        for(int i = 0; i < m; i++){
            int start = queries[i][0];
            int end = queries[i][1];
            res[i] = ((count[start] - count[end]) == 0);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the subarray");
        int n = sc.nextInt();
        System.out.println("Enter the subarray nums:");
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the size of the array queries:");
        int m = sc.nextInt();
        int[][] queries = new int[m][2];
        System.out.println("Enter the range in the array queries:");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < 2; j++){
                queries[i][j] = sc.nextInt();
            }
        }
        boolean[] res = isArraySpecial(nums, queries);
        System.out.println(Arrays.toString(res));
    }
}
