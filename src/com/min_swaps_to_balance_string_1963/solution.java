package com.min_swaps_to_balance_string_1963;

import java.util.*;

class Solution {
    public static int minSwaps(String s) {
        int imbalance = 0;
        int maxImbalance = 0;

        // Traverse the string to detect imbalances
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[') {
                // Decrease imbalance if we find an opening bracket
                imbalance--;
            } else if (s.charAt(i) == ']') {
                // Increase imbalance if we find a closing bracket
                imbalance++;
            }

            // Track the maximum imbalance during the scan
            maxImbalance = Math.max(maxImbalance, imbalance);
        }

        // Number of swaps required is half of the maximum imbalance because each swap can fix two misplaced brackets
        return (maxImbalance + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string containing '[' and']' brackets");
        String s = sc.next();
        System.out.println(minSwaps(s));
    }
}
