package ru.company.leetcode_easy;

import java.util.Arrays;

public class isIsomorphic {
    public static void main(String[] args) {
       String  s = "egg", t = "add";
        System.out.println(new isIsomorphic().isIsomorphic(s, t));
        StringBuilder builder = new StringBuilder();
        int a = 1;

    }
    public boolean isIsomorphic(String s, String t) {
        int[] sChar = new int[256];
        int[] tChar = new int[256];
        Arrays.fill(sChar, -1);
        Arrays.fill(tChar, -1);

        for(int i = 0; i < s.length(); i++){
            int sCharIdx = s.charAt(i);
            int stCharIdx = t.charAt(i);
            if (sChar[sCharIdx] == -1 && tChar[stCharIdx] == -1){
                sChar[sCharIdx] = stCharIdx;
                tChar[stCharIdx] = sCharIdx;
            } else if (sChar[sCharIdx] != stCharIdx
                    || tChar[stCharIdx] != sCharIdx) {
                return false;
            }
        }
        return true;
    }
}
