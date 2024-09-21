package com.lexographicsl_no;
import java.util.*;
public class solution {
    public static List<Integer> lexographical_no(int n){
        List<Integer> res = new ArrayList<>();
        int curr = 1;
        for(int i = 1; i <= n; i++){
            res.add(curr);
            if(curr * 10 <= n){
                curr = curr * 10;
            }else{
                while(curr % 10 == 9 || curr >= n){
                    curr = curr / 10;
                }
                curr = curr + 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer");
        int n = sc.nextInt();
        List<Integer> res = lexographical_no(n);
        System.out.println("Lexographical_no: "+ res);
    }
}
