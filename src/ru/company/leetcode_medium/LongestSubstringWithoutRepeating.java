package ru.company.leetcode_medium;

import java.util.HashSet;

public class LongestSubstringWithoutRepeating {
    public static void main(String[] args) {
        String test = "pwwkew";
        System.out.println(new LongestSubstringWithoutRepeating().lengthOfLongestSubstring(test));
    }

    public int lengthOfLongestSubstring(String s) {
        var i = 0;
        var j = 0;
        var max = 0;

        HashSet<Character>hashSet = new HashSet<>();

        while(j < s.length()){
            if(!hashSet.contains(s.charAt(j))){
                hashSet.add(s.charAt(j));
                max = Math.max(hashSet.size(), max);
                j++;
            } else {
                hashSet.remove(s.charAt(i));
                i++;
            }
        }
        return max;
    }
}
