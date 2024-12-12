package com.take_gifts_from_richest_pile_2558;
import java.util.*;
import java.util.Collections;

public class solution {
    public static long pickGifts(int[] gifts, int k){
        int n = gifts.length;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int gift : gifts){
            maxHeap.add(gift);
        }
        for(int i = 0; i < k; i++) {
            int x = maxHeap.poll();
            maxHeap.add((int) Math.sqrt(x));
        }
        Object[] remaining = maxHeap.toArray();
        long res = 0;
        for(Object pile : remaining){
            res = res + (int) pile;
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] gifts = new int[n];
        System.out.println("Enter the element in the array:");
        for(int i = 0; i < n; i++){
            gifts[i] = sc.nextInt();
        }
        System.out.println("Enter the time after which remaining gifts can be calculated");
        int k = sc.nextInt();
        long res = pickGifts(gifts, k);
        System.out.println("The number of gifts remaining after k seconds: "+ res);
    }
}
