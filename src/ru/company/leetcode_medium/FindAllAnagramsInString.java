package ru.company.leetcode_medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsInString {
    public static void main(String[] args) {
        String s = "cbaebabacd", p = "abc";
        System.out.println(new FindAllAnagramsInString().findAnagrams_2(s, p));
    }

    /**
     * Моё решение
     */
    public List<Integer> findAnagrams(String s, String p) {
        //перём подстроку равную длинне второй строки.
        //полученную подстроку сортируем - toCharArray(), Arrays.sort(), String.valueOf()
        //если равны - кладём первый индекс в список
        //двигаемся дальше с шагом в 1
        List<Integer>result = new ArrayList<>();
        if(s.equals(p)){
            result.add(0);
            return result;
        }
        int left = 0;
        int right = p.length();
        char[] p_chars = p.toCharArray();
        Arrays.sort(p_chars);
        p = String.valueOf(p_chars);
        while(right <= s.length()){
            String sub = s.substring(left, right)   ;
            char[] chars = sub.toCharArray();
            Arrays.sort(chars);
            sub = String.valueOf(chars);
            if(sub.equals(p)){
                result.add(left);
            }
            left += 1;
            right += 1;
        }
        return result;
    }


    /**
     * Решение с Leetcode
     */
    public List<Integer> findAnagrams_2(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if (s == null || s.length() == 0 || p == null || p.length() == 0) return list;
        int[] hash = new int[256]; //character hash
        //record each character in p to hash
        for (char c : p.toCharArray()) {
            hash[c]++;
        }
        //two points, initialize count to p's length
        int left = 0, right = 0, count = p.length();
        while (right < s.length()) {
            //move right everytime, if the character exists in p's hash, decrease the count
            //current hash value >= 1 means the character is existing in p
            if (hash[s.charAt(right++)]-- >= 1) count--;

            //when the count is down to 0, means we found the right anagram
            //then add window's left to result list
            if (count == 0) list.add(left);

            //if we find the window's size equals to p, then we have to move left (narrow the window) to find the new match window
            //++ to reset the hash because we kicked out the left
            //only increase the count if the character is in p
            //the count >= 0 indicate it was original in the hash, cuz it won't go below 0
            if (right - left == p.length() && hash[s.charAt(left++)]++ >= 0) count++;
        }
        return list;
    }
}
