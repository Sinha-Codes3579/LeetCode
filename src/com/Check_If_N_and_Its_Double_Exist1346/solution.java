package com.Check_If_N_and_Its_Double_Exist1346;
import java.util.*;
public class solution {
    public static boolean checkIfExist(int[] arr){
        int n = arr.length;
        int i = 0, j = 0;
        int product = 1;
        int count = 0;
        for(i = 0; i < n; i++){
            for(j = 1; j < n; j++){
                if(i != j){
                    if(arr[i] == 2 * arr[j]){
                        count = count + 1;
                    }
                }
            }
        }
        return count >= 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int n = sc.nextInt();
        System.out.println("Assign values to the array:");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        boolean b = checkIfExist(arr);
        System.out.println(b);
    }
}

