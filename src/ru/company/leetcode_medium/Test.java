package ru.company.leetcode_medium;

public class Test {
    public static void main(String[] args) {

    }

    public String isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed) ? "Yes" : "No";
    }
}
