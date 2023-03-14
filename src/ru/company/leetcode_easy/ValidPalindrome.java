package ru.company.leetcode_easy;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(new ValidPalindrome().isPalindrome(s));

    }

    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^A-Za-z0-9]", "").replaceAll(" ", "").toLowerCase();
        StringBuilder b = new StringBuilder(s);
        return b.reverse().toString().equals(s);
    }
}
