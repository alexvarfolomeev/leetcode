package ru.company.leetcode_medium;

import java.util.*;

import static java.util.Map.entry;

public class Search2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                          {1, 3, 5, 6},
                          {10, 11, 16, 20},
                          {23, 30, 34, 60},
                          {67, 75, 80, 99}
                        };
        System.out.println(matrix.length);
        System.out.println(searchMatrix(matrix, 16));

        String[] test = {"eat","tea","tan","ate","nat","bat"};
        new Search2DMatrix().groupAnagrams(test);

    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[row].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            }
            if (matrix[row][col] < target) {
                row++;
            }
            else {
                col--;
            }
        }
        return false;
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String keyStr = String.valueOf(ca);
            if (!map.containsKey(keyStr)) map.put(keyStr, new ArrayList<>());
            map.get(keyStr).add(s);
        }
        return new ArrayList<>(map.values());
    }




    //matrix = [[1,3,5,7],
    //         [10,11,16,20],
    //         [23,30,34,60]], target = 3
    
    public static boolean searchMatrix_pr(int[][] matrix, int target) {
        var row = 0;
        var column = matrix[row].length - 1;
        while(row < matrix.length && column >= 0) {
            if (matrix[row][column] == target) {
                return true;
            }
            if (matrix[row][column] < target){
                row++;
            } else {
                column--;
            }
        }
        return false;
    }
}
