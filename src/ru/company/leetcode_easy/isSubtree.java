package ru.company.leetcode_easy;

import java.util.*;

public class isSubtree {

    public static void main(String[] args) {
        String test1 = "Hello, world!";
        String test2 = "Twas brillig, and the slithy toves " +
                "Did gyre and gimble in the wabe;" +
                "All mimsy were the borogoves," +
                "And the mome raths outgrabe.";
        //charsGistogram(test1);
        System.out.println();
        charsGistogram(test2);
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) return false;
        if (checkSubtree(root, subRoot)) return true;
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public boolean checkSubtree(TreeNode root, TreeNode subRoot){
        if(root == subRoot) return true;
        if((root == null || subRoot == null) || root.val != subRoot.val) return false;
        return checkSubtree(root.left, subRoot.left) && checkSubtree(root.right, subRoot.right);
    }

    public static void charsGistogram(String str){
        SortedMap<Character, Integer> map = new TreeMap<>();
        var strings = str.split(" ");
        for (String s : strings) {
            char[] chars = s.toCharArray();
            for (char c : chars) {
                if(!map.containsKey(c)) {
                    map.put(c, 1);
                } else {
                    map.put(c, map.get(c) + 1);
                }
            }
        }
        int max = map.values().stream().max(Comparator.naturalOrder()).get();
        for (int i = max; i > 0; i--) {
            for (int j : map.values()) {
                if(j > i || j == i){
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        map.keySet().forEach(System.out::print);
    }
}
