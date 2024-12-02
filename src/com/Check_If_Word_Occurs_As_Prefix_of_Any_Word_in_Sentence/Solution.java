package com.Check_If_Word_Occurs_As_Prefix_of_Any_Word_in_Sentence;

import java.util.*;
public class Solution {
    public int isPrefixOfWord(String sentence, String searchWord){
        String[] words = sentence.split(" ");
        for(int i  = 0; i < words.length; i++){
            if(words[i].startsWith(searchWord)){
                return i + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a sentence:");
        String sentence = sc.nextLine();
        System.out.println("Enter searchWord:");
        String searchWord = sc.next();
        Solution solution = new Solution();
        int index = solution.isPrefixOfWord(sentence, searchWord);
        System.out.println(index);
    }
}
