package com;
import java.util.*;
public class min_add_make_parenthesis_valid_921 {
    public static int minAddToMakeValid(String s){
        int n = s.length();
        //count open parenthesis and number of mismatch of parenthesis in string
        int open = 0, mismatch = 0;
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == '('){
                open++;//open parenthesis is found
            }
            else{
                if(open > 0)
                    open--;//match of open parenthesis is found
                else
                    mismatch++;//match for close parenthesis is not found
            }
        }
        return open + mismatch;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string having only parenthesis");
        String s = sc.next();
        int minAdd = minAddToMakeValid(s);
        System.out.println(minAdd);
    }
}
